package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*/@SpringBootConfiguration: indica que una clase proporciona la configuración de la aplicación. 
Es un alias de @Configuration con la diferencia en que SpringBootConfiguration permite que Spring 
encuentre las configuraciones automáticamente.

@EnableAutoConfiguration: permite que Spring Boot configure automáticamente la aplicación y registre 
los beans para su utilización. Esta autoconfiguración se aplica basada en las dependencias de la aplicación. 
La autoconfiguración intenta evitar configuraciones tediosas usando la inteligencia de Spring para tomar 
decisiones en cuando a las configuraciones habituales.

@ComponentScan: le da la directiva a Spring para que haga una búsqueda de todos los componentes anotados 
dentro de los paquetes. Es decir, buscará todo lo que esté anotado como @Component y 
sus clases hijas (Service, Repository, Controller) registrándolas en su contexto. */

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
