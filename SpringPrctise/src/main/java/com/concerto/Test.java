package com.concerto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	    TextEditor textEditor=(TextEditor) context.getBean("textEditor");
	    textEditor.getSpellChecker();

	}

}
