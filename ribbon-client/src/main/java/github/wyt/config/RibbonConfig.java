package github.wyt.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fangzhipeng on 2017/6/13.
 */
@Configuration /* 声明当前类是一个配置类，相当于spring的一个xml配置文件 */
public class RibbonConfig {

    @Bean /* 声明在方法上，表示当前方法的返回值为一个Bean */
    @LoadBalanced /* RestTemplate结合Ribbon开启负载均衡 */
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
