package com.fis.spring.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.spring.app.model.ElectronicDevices;

	public class MainRunner {

		public static void main(String[] args) {
			// Spring container 
			ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
			
			/*
			 * ElectronicDevices dev =
			 * (ElectronicDevices)spring.getBean("NewElectronicDevice");
			 * System.out.println(dev);
			 */
			
			//ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");// this is already created
			ElectronicDevices dev2 = (ElectronicDevices)spring.getBean("electronicDevices");
			//ElectronicDevices   -> electronicDevices
			// MyVeryLongCLassName = > myVeryLongClassName
			System.out.println(dev2);
			
			//Car car3 = (Car)spring.getBean("car");
			//System.out.println(" Second Call "+car3);
		
		}
		
	}

