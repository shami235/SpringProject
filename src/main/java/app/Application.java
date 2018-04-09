package app;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static Logger log = Logger.getLogger(Application.class.getName());

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

    }
}
