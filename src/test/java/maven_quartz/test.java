package maven_quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[]) throws Exception {  
	    System.out.println("开始启动定时任务 ...");  
	    ApplicationContext context = new ClassPathXmlApplicationContext("quartz-config.xml");    
	    System.out.println("定时任务启动成功...");  
	  }  
	//如果想配置quartz任务随着Tomcat启动进行加载
	//在web.xml下的DispatcherServlet加入classpath:quartz-config.xml
}
