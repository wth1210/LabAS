package com.wth.labas.mapper;


import com.wth.labas.bean.Consumer;
import com.wth.labas.bean.SRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SRecordMapper {
    public SRecord getSRecordById(String sid);
    public SRecord getSRecordByUid(String uid);
    public void updateSRecord(SRecord sRecord);
    public void insertSRecord(SRecord sRecord);
}
