package com.wth.labas.service;

import com.wth.labas.bean.Consumer;

public interface ConsumerService {
    public Consumer getConsumerById(String uid);
    public Consumer getConsumerByPhone(String phone);
    public Consumer getConsumerByEmail(String email);
    public void updateConsumer(Consumer consumer);
    public void insertConsumer(Consumer consumer);
}
