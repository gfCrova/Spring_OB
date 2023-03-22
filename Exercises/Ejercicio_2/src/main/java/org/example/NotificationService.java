package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
    }

    public String imprimirSaludo() {
        return "Hola, Este es un saludo de la clase NotificationService.. Ejercicio 2 OB!";
    }
}
