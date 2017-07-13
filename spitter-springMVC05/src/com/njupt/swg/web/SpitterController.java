package com.njupt.swg.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.njupt.swg.bean.Spitter;
import com.njupt.swg.data.ISpitterDao;
import com.njupt.swg.exception.DuplicateSpitterException;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	private ISpitterDao spitterDao;
	
	@Autowired
	public SpitterController(ISpitterDao spitterDao) {
		this.spitterDao = spitterDao;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegisterationForm(Model model){
		model.addAttribute(new Spitter());
		return "registerForm";
	}
	//包含单文件上传和多文件上传的注册方法
/*	 @RequestMapping(value="/register", method=RequestMethod.POST)
	 public String processRegistration(
			 @RequestPart("profilePicture") MultipartFile[] profilePicture,
			 @Valid Spitter spitter,
			 Errors errors) {
	    if (errors.hasErrors()) {
	      return "registerForm";
	    }
	    try {
	    	for(int i=0; i<profilePicture.length; i++){
	    		profilePicture[i].transferTo(new File("E:/STS/spring/spitter-springMVC05/WebContent/images/uploads"
						+"/"+profilePicture[i].getOriginalFilename()));
	    	}
	    	System.out.println("==========success to upload!=========");
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	    spitterDao.save(spitter);
	    return "redirect:/spitter/" + spitter.getUsername();
	  }*/
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	 public String processRegistration(
			 @RequestPart("profilePicture") MultipartFile[] profilePicture,
			 @Valid Spitter spitter,
			 Errors errors,
			 RedirectAttributes model,
			 HttpServletRequest request) {
		//上传路径
		String uploadPath = "E:/testSpring/";
		 // 存储要下载的文件名  
	    Map<String, String> fileNameMap = new HashMap<String, String>(); 
	    
	    if (errors.hasErrors()) {
	      return "registerForm";
	    }
	    
	    try {
	    	for(int i=0; i<profilePicture.length; i++){
	    		profilePicture[i].transferTo(new File(uploadPath+profilePicture[i].getOriginalFilename()));
	    		fileNameMap.put(uploadPath+profilePicture[i].getOriginalFilename(), profilePicture[i].getOriginalFilename());
	    	}
	    	System.out.println("==========success to upload!=========");
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	    List<Spitter> spitters = spitterDao.getAllSpitters();
	    List<String> usernames = new ArrayList<String>();
	    for(Spitter s:spitters){
	    	usernames.add(s.getUsername());
	    }
	    if(usernames.contains(spitter.getUsername()))
	    	throw new DuplicateSpitterException();
	    spitterDao.save(spitter);
	    model.addFlashAttribute("Pics",fileNameMap);
	    return "redirect:/spitter/" + spitter.getUsername();
	  }
	
	
     @RequestMapping("download")
     public ResponseEntity<byte[]> download(
    		 HttpServletRequest request,
             @RequestParam("filename") String filename,
             Model model)throws Exception {
        //下载文件路径
        String path = "E:/testSpring/";
        File file = new File(path + filename);
        HttpHeaders headers = new HttpHeaders();  
        //下载显示的文件名，解决中文名称乱码问题  
        String downloadFielName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以attachment（下载方式）打开图片
        headers.setContentDispositionFormData("attachment", downloadFielName); 
        //application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                headers, HttpStatus.CREATED);  
     }
     
	 
	  @RequestMapping(value="/{username}", method=RequestMethod.GET)
	  public String showSpitterProfile(@PathVariable String username, Model model) {
	    Spitter spitter = spitterDao.findByUsername(username);
	    model.addAttribute(spitter);
	    return "profile";
	  }
	  
	  
	  @ExceptionHandler(DuplicateSpitterException.class)
	  public String hanleDuplicateSpitter(){
		  return "error";
	  }
	
}
