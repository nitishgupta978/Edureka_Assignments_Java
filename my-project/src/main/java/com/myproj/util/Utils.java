package com.myproj.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Utils {

	public String getProperty(String key) {
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(new File("C:\\Users\\nitish.gupta_spicemo\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE-practice\\my-project\\src\\main\\resources\\myprops.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.toString());
		return prop.getProperty(key);
	}
}
