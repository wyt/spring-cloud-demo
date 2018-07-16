package github.wyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerFileApplication {

  public static void main(String[] args) {
    SpringApplication.run(DockerFileApplication.class, args);
  }

  @RequestMapping("/")
  public String home() {
    return "Hello docker!";
  }
}
