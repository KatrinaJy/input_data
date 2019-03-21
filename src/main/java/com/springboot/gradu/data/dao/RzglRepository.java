package com.springboot.gradu.data.dao;

import com.springboot.gradu.data.dataobject.PubMrbsLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RzglRepository extends JpaRepository<PubMrbsLog,Integer> {
    Page<PubMrbsLog> findAll(Specification<PubMrbsLog> spec, Pageable pageAble);

    List<PubMrbsLog> findByFydm(String fydm);
}
