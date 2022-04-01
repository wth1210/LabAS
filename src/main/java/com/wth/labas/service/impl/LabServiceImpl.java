package com.wth.labas.service.impl;

import com.wth.labas.bean.Lab;
import com.wth.labas.mapper.LabMapper;
import com.wth.labas.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LabServiceImpl implements LabService {
    @Autowired
    LabMapper labMapper;

    @Override
    public Lab getLabById(String id) {
        return labMapper.getLabById(id);
    }

    @Override
    public List<Lab> getLabAll() {
        return labMapper.getLabAll();
    }

    @Override
    public void updateLab(Lab lab) {
        labMapper.updateLab(lab);
    }

    @Override
    public void insertLab(Lab lab) {
        labMapper.insertLab(lab);
    }
}
