package com.ezsoft.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Test2 {
	private static Logger logger = LogManager.getLogger(Test2.class);
	@Test
	public void property(){	
		try {
			Properties pps = new Properties();
	        InputStream in=Test2.class.getClassLoader().getResourceAsStream("default.properties");
			pps.load(in);
			String key = "url";
			String value = pps.getProperty(key);
			System.out.println(key + " = " + value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
