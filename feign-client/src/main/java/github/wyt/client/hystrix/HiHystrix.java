package github.wyt.client.hystrix;

import github.wyt.client.EurekaClientFeign;
import org.springframework.stereotype.Component;

/** Created by fangzhipeng on 2017/6/21. */
@Component
public class HiHystrix implements EurekaClientFeign {

  @Override
  public String sayHiFromClientEureka(String name) {
    return "hi," + name + ",sorry,error!";
  }
}
