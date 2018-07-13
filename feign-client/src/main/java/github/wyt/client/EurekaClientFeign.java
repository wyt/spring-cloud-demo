package github.wyt.client;

import github.wyt.client.hystrix.HiHystrix;
import github.wyt.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** Created by fangzhipeng on 2017/6/21. */
@SuppressWarnings("all")
@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {

  @GetMapping(value = "/hi")
  String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
