package com.example.Ejercicio_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class E3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(E3Application.class, args);
		EmployeesRepository employeeRepository = context.getBean(EmployeesRepository.class);

		Employees employee1 = new Employees(null, "Diego", "Perez", 35, LocalDate.of(1988, 4, 18));
		Employees employee2 = new Employees(null, "Fernando", "Lopez", 33, LocalDate.of(1990, 2, 22));
		Employees employee3 = new Employees(null, "Anabela", "Bustamante", 24, LocalDate.of(1999, 5,13));
		Employees employee4 = new Employees(null, "Oscar Anibal", "Velazco", 26, LocalDate.of(1997, 11,12));

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);

		System.out.println(employeeRepository.count());

		System.out.println(employeeRepository.findAll());

	}
}
