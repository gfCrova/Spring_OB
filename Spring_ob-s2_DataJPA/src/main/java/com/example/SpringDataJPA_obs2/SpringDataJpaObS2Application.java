package com.example.SpringDataJPA_obs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaObS2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaObS2Application.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("La cantidad de coches en la bade de datos es de: " + repository.count());

		// Crear y almacenar en base de datos
		Coche coche = new Coche(null, "Chevrolet", "Corsa", 2023, "Blanco");
		Coche coche2 = new Coche(null, "Ford", "Falcon", 1998, "Verde");
		repository.save(coche);
		repository.save(coche2);

		System.out.println("La cantidad de coches en la bade de datos es de: " + repository.count());

		// Recuperar todos los datos
		System.out.println(repository.findAll());
	}

}
