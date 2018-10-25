package com.anil.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.property.bean.JmsPropertyBean;
import com.anil.property.bean.PropertyBean;

@SpringBootApplication
public class MultipropertySourceAccessApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MultipropertySourceAccessApplication.class, args);
		PropertyBean bean = run.getBean(PropertyBean.class);
		System.out.println("Normal Properties " + bean);
		JmsPropertyBean bean2 = run.getBean(JmsPropertyBean.class);
		System.out.println("Jms Properties " + bean2);
	}
}
