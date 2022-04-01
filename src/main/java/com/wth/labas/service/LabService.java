package com.wth.labas.service;

import com.wth.labas.bean.Lab;

import java.util.List;

public interface LabService {
    public Lab getLabById(String id);
    public List<Lab> getLabAll();
    public void updateLab(Lab lab);
    public void insertLab(Lab lab);
}
