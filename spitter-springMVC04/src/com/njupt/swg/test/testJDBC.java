package com.njupt.swg.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.njupt.swg.bean.Spittle;
import com.njupt.swg.data.ISpittleDao;

public class testJDBC {
	@Inject
	private static ISpittleDao sd;
	public static void main(String[] args) {
		System.out.println(sd);
	}
}
