package com.wth.labas.mapper;


import com.wth.labas.bean.Consumer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConsumerMapper {
    public Consumer getConsumerById(String uid);
    public Consumer getConsumerByPhone(String phone);
    public Consumer getConsumerByEmail(String email);
    public void updateConsumer(Consumer consumer);
    public void insertConsumer(Consumer consumer);
}
