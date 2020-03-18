package cn.mghio.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author mghio
 * @date: 2020-03-18
 * @version: 1.0
 * @description:
 * @since JDK 1.8
 */
@Service
public class TestService {

  @SentinelResource("sayHello")
  public String sayHello(String name) {
    return "Hello, " + name;
  }

}
