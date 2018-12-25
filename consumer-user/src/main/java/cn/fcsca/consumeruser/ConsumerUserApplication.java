package cn.fcsca.consumeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerUserApplication
 * @EnableDiscoveryClient 开启发现服务功能
 * 
 *
 * @author Fcscanf@樊乘乘
 * @date 上午 11:06 2018-08-27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }

    /**
     * RestTemplate 发送HTTP请求获取远程服务端信息
     * @LoadBalanced 开启负载均衡机制
     *
     * @param 
     * @return 
     * @author Fcscanf@樊乘乘
     * @date 上午 11:08 2018-08-27 
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
