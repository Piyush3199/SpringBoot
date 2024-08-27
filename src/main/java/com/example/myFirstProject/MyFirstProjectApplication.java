//Base package - Beans created inside it
package com.example.myFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*Applied to main class only
1. @configuration - Also created bean. If mentioned on the class it means it is used for the configuration usually used with @Bean(It is used on the function not on the class)
2. @EnableAutoConfiguration - Enables configuration for the dependencies e.g mongoDB mentioned in the pom.xml
3. @ComponentScan - IOC scans for the beans in the project
*/
@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}

}
