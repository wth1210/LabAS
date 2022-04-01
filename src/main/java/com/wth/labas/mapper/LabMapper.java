package com.wth.labas.mapper;


import com.wth.labas.bean.Consumer;
import com.wth.labas.bean.Lab;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LabMapper {
    public Lab getLabById(String id);
    public List<Lab> getLabAll();
    public void updateLab(Lab lab);
    public void insertLab(Lab lab);
}
