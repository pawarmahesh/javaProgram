package com.java.learn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreJavaApplication {

	public static void main(String[] args) {

		ApplicationContext appcontext = SpringApplication.run(CoreJavaApplication.class, args);

		Logger logger = LogManager.getLogger(CoreJavaApplication.class);
		logger.info("* Starting .. Core Java application.");

		JavaOopsConecpts oopsConecpts = appcontext.getBean(JavaOopsConecpts.class);
		oopsConecpts.execMethod();

	}

}
