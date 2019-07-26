package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main(String[] args)
    {
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie=xmlBeanFactory.getBean("movie",Movie.class);
        System.out.println(movie);

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)context.getBean("movie");
        System.out.println(movie1);

    }

}
