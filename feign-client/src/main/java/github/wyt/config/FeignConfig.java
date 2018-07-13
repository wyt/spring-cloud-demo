package github.wyt.config;

import static java.util.concurrent.TimeUnit.SECONDS;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Created by fangzhipeng on 2017/6/16. */
@Configuration
public class FeignConfig {

  @Bean
  public Retryer feignRetryer() {
    return new Retryer.Default(100, SECONDS.toMillis(1), 5);
  }
}
