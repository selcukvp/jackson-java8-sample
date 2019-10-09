package com.bozdag.learning.jackson.java8.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JacksonSampleMainApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(JacksonSampleMainApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(JacksonSampleMainApplication.class, args);
  }

}
