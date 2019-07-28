package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean
{

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("BeanLifeCycle is created");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("BeanLifeCycle is destroyed");
    }
    public void customInit()
    {
        System.out.println("init mathod is created");

    }
    public void customDestroy()
    {
        System.out.println("Bean will be destroyed");
    }
}
