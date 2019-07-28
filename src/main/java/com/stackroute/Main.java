package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


//        Movie movie2 = (Movie) context.getBean("movie2");
//        System.out.println(movie2);


        Actor actor = (Actor) context.getBean("actor");
        Actor actor1 = (Actor) context.getBean("actor1");
        Actor actor2 = (Actor) context.getBean("actor2");

        System.out.println(actor);
        System.out.println(actor1);
        System.out.println(actor2);
        //if we try to autowire bytype we will get this exception thrown
      // org.springframework.beans.factory.UnsatisfiedDependencyException


    }

}
