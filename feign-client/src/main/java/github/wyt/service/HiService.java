package github.wyt.service;

import github.wyt.client.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Created by fangzhipeng on 2017/6/21. */
@Service
public class HiService {

  @Autowired
  EurekaClientFeign eurekaClientFeign;

  public String sayHi(String name) {
    return eurekaClientFeign.sayHiFromClientEureka(name);
  }
}
