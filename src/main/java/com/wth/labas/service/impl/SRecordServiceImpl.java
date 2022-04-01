package com.wth.labas.service.impl;

import com.wth.labas.bean.SRecord;
import com.wth.labas.mapper.SRecordMapper;
import com.wth.labas.service.SRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SRecordServiceImpl implements SRecordService {


    @Autowired
    SRecordMapper sRecordMapper;

    @Override
    public SRecord getSRecordById(String sid) {
        return sRecordMapper.getSRecordById(sid);
    }

    @Override
    public SRecord getSRecordByUid(String uid) {
        return sRecordMapper.getSRecordByUid(uid);
    }

    @Override
    public void updateSRecord(SRecord sRecord) {
        sRecordMapper.updateSRecord(sRecord);
    }

    @Override
    public void insertSRecord(SRecord sRecord) {
        sRecordMapper.insertSRecord(sRecord);
    }
}
