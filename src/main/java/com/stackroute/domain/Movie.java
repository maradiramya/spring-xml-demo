package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    Actor actor;
   private ApplicationContext context;
   private BeanFactory beanFactory;





    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        this.context=context;
     Movie movie=(Movie)context.getBean("movie");
        System.out.println(movie);


    }


    @Override
    public void setBeanName(String beanName)
    {
        System.out.println("bean name is :" +beanName);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        this.beanFactory=beanFactory;
        System.out.println("beanfactory is:"+beanFactory);

    }
}
