package com.springboot.gradu.service;

import com.springboot.gradu.data.dataobject.PubMrbsLog;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

//日志管理的Service
public interface RZGLService {

    List<PubMrbsLog> search(String fydm, String type, Date startDate, Date endDate);

    Page<PubMrbsLog> findByPage(String fydm, String type, Date startDate, Date endDate, Integer pageNum, Integer pageSize);

    List<PubMrbsLog> findCountBy(String fydm);
}
