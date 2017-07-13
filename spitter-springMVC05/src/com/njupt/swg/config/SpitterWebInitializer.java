package com.njupt.swg.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	  @Override
	  protected Class<?>[] getRootConfigClasses() {
	    return new Class<?>[] { RootConfig.class };
	  }

	  @Override
	  protected Class<?>[] getServletConfigClasses() {
	    return new Class<?>[] { WebConfig.class };
	  }

	  @Override
	  protected String[] getServletMappings() {
	    return new String[] { "/" };
	  }
	  
	  @Override
	  protected void customizeRegistration(Dynamic registration) {
	    registration.setMultipartConfig(
	        //new MultipartConfigElement("E:/testSpring/", 2097152, 4194304, 0));    //上传到硬盘上
	    		new MultipartConfigElement("E:/", 2097152, 4194304, 0));
	  }
}
