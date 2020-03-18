package cn.mghio.sentinel.controller;

import cn.mghio.sentinel.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mghio
 * @date: 2020-03-18
 * @version: 1.0
 * @description:
 * @since JDK 1.8
 */
@RestController
public class TestController {

  private TestService service;

  public TestController(TestService service) {
    this.service = service;
  }

  @GetMapping("/hello/{name}")
  public String sayHello(@PathVariable String name) {
    return service.sayHello(name);
  }
}
