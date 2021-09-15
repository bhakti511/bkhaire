package com.bhakti.springGetterSetter;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        
        Demo obj = (Demo)context.getBean("demo");
        
        System.out.println(obj);
    }
}
