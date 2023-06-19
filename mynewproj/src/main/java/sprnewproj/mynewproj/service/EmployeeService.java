package sprnewproj.mynewproj.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import sprnewproj.mynewproj.model.Employee;

public class EmployeeService {
	public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));	
	Employee s= (Employee)factory.getBean("employee");
		
	System.out.println(s);
	}

}
