package org.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
        ShoppingCart shoppingCart=context.getBean(ShoppingCart.class);
        shoppingCart.checkout();

    }
}
