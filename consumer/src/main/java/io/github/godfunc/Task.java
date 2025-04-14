package io.github.godfunc;

import io.github.godfunc.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Task implements ApplicationRunner {

    @DubboReference(url = "${dubbo.reference.url}")
    private DemoService demoService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String result = demoService.sayHello("Jack");
        log.info(result);
    }
}
