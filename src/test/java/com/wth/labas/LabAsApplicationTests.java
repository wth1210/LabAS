package com.wth.labas;

import com.wth.labas.bean.Consumer;
import com.wth.labas.service.ConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabAsApplicationTests {

    @Autowired
    ConsumerService consumerService;

    @Test
    void contextLoads() {
        Consumer consumer = consumerService.getConsumerById("1001");
        System.out.println(consumer);
    }

}
