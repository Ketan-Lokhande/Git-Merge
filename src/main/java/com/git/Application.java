package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
            String name="Sunil";
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
      public void printName(){
System.out.print(name);
}
}
