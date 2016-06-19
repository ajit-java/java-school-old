package de.ajit.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory
            .getLogger(Application.class);

    @PostConstruct
    public void logSomething() {
        logger.debug("Sample Debug Message d");
        logger.trace("Sample Trace Message t");
        logger.error("Sample Trace Message e");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
