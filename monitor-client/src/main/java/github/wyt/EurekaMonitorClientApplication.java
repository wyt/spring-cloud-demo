package github.wyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@SuppressWarnings("all")
public class EurekaMonitorClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMonitorClientApplication.class, args);
  }
}
