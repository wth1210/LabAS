package com.wth.labas.service;

import com.wth.labas.bean.SRecord;

public interface SRecordService {
    public SRecord getSRecordById(String sid);
    public SRecord getSRecordByUid(String uid);
    public void updateSRecord(SRecord sRecord);
    public void insertSRecord(SRecord sRecord);
}
