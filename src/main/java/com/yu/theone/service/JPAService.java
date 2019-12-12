package com.yu.theone.service;

import com.yu.theone.entity.TestJPA;
import com.yu.theone.interfaceT.TestJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by shuwei.yu.
 * on 2019/12/12.
 */
@Service
public class JPAService {

    @Transactional(value = "transactionManager",rollbackFor=Exception.class)
    public void save(){
        testJPARepository.save(new TestJPA("321","1","212"));
    }


    @Autowired
    TestJPARepository testJPARepository;

}
