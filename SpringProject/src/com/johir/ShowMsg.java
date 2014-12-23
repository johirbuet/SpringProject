package com.johir;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class ShowMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		HelloMessage obj=(HelloMessage) factory.getBean("helloMessage");
		Employee e1=(Employee) factory.getBean("employee");
		String str=obj.getMessage();
		System.out.println(str);
		
		e1.showMsg();
		
		Question qn=(Question) factory.getBean("question");
		qn.displayInfo();

	}

}
