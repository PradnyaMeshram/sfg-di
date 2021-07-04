package com.springframework.sfgdi;

import com.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("------Profile-------");
        I18nController i18nController = context.getBean(I18nController.class);
        System.out.println(i18nController.sayHello());


        System.out.println("------Primary-------");
        MyController controller = context.getBean(MyController.class);
        System.out.println(controller.getGreeting());

        System.out.println("-----Property--------");
        PropertyInjectionController propertyInjectionController =
                (PropertyInjectionController)context.getBean(PropertyInjectionController.class);

        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("-----Setters--------");
        SetterInjectionController setterInjectionController =
                context.getBean(SetterInjectionController.class);
        System.out.println(setterInjectionController.getGreeting());

        System.out.println("-----Constructor--------");
        ConstructorInjectionController constructorInjectionController =
                context.getBean(ConstructorInjectionController.class);
        System.out.println(constructorInjectionController.getGreeting());

    }

}
