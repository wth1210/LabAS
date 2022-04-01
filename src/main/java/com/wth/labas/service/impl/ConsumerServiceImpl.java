package com.wth.labas.service.impl;

import com.wth.labas.bean.Consumer;
import com.wth.labas.mapper.ConsumerMapper;
import com.wth.labas.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    ConsumerMapper consumerMapper;

    @Override
    public Consumer getConsumerById(String uid) {
        return consumerMapper.getConsumerById(uid);
    }

    @Override
    public Consumer getConsumerByPhone(String phone) {
        return consumerMapper.getConsumerByPhone(phone);
    }

    @Override
    public Consumer getConsumerByEmail(String email) {
        return consumerMapper.getConsumerByEmail(email);
    }

    @Override
    public void updateConsumer(Consumer consumer) {
        consumerMapper.updateConsumer(consumer);
    }

    @Override
    public void insertConsumer(Consumer consumer) {
        consumerMapper.insertConsumer(consumer);
    }


}
