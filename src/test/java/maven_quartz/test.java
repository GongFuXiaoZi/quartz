package maven_quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[]) throws Exception {  
	    System.out.println("��ʼ������ʱ���� ...");  
	    ApplicationContext context = new ClassPathXmlApplicationContext("quartz-config.xml");    
	    System.out.println("��ʱ���������ɹ�...");  
	  }  
	//���������quartz��������Tomcat�������м���
	//��web.xml�µ�DispatcherServlet����classpath:quartz-config.xml
}
