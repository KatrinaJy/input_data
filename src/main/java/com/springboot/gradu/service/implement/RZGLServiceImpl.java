package com.springboot.gradu.service.implement;


import com.springboot.gradu.data.dao.RzglRepository;
import com.springboot.gradu.data.dataobject.PubMrbsLog;
import com.springboot.gradu.service.RZGLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//日志管理的服务
@Service("rzglService")
@Transactional
public class RZGLServiceImpl implements RZGLService {

    @Autowired
    private RzglRepository rzglRepository;

    public void setRzglRepository(RzglRepository rzglRepository) {
        this.rzglRepository = rzglRepository;
    }

    @Override
    public List<PubMrbsLog> search(String fydm, String type, Date startDate, Date endDate) {
        return null;
    }


    public Page<PubMrbsLog> findByPage(final String fydm,final String type,final Date startDate,final Date endDate,Integer pageNum,Integer pageSize){
        Pageable pageable = new PageRequest(pageNum,pageSize);
        Specification<PubMrbsLog> spec = new Specification<PubMrbsLog>() {
            private static final long serialVersionUID = -594262632507712037L;
            @Override
            public Predicate toPredicate(Root<PubMrbsLog> root, CriteriaQuery<?> crite, CriteriaBuilder cb) {
                List<Predicate> pr = new ArrayList<>();
                if( !(fydm == null || "".equals(fydm)) ){
                    pr.add(cb.equal(root.get("fydm").as(String.class), fydm));
                }
                if (!( type == null || "".equals(type))){
                    pr.add(cb.equal(root.get("type").as(String.class), type));
                }
                if (startDate != null ){
                    pr.add(cb.greaterThanOrEqualTo(root.get("time").as(Date.class), startDate));
                }
                if (endDate != null ){
                    pr.add(cb.lessThanOrEqualTo(root.get("time").as(Date.class), endDate));
                }
                return cb.and(pr.toArray(new Predicate[pr.size()]));
            }
        };
        return rzglRepository.findAll(spec,pageable);
    }

    @Override
    public List<PubMrbsLog> findCountBy(String fydm) {
        List<PubMrbsLog> log = rzglRepository.findByFydm(fydm);
        return log;
    }
}
