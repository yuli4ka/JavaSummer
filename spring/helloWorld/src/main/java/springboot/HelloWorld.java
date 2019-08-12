package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class HelloWorld {

  public static void main(String[] args) {
    SpringApplication.run(HelloWorld.class, args);
  }

  @RequestMapping("/hello")
  public String showHelloWorld() {
    return "hello-world";
  }

}
