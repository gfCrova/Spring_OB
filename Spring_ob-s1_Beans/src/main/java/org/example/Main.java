package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");
        System.out.println(calculadora.holaMundo());

        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculatorService.holaMundo());
    }
}