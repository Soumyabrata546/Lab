package com.examplespring.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test_mcq {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("ApplicationContent.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Test_mcq m = (Test_mcq) b.getBean("mcq");
		m.display();
	}
}