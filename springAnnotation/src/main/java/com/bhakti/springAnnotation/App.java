package com.bhakti.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        
        Vehicle obj = (Vehicle)context.getBean("bike");
        obj.drive();
    }
}
