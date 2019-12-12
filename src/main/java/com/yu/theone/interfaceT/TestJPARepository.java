package com.yu.theone.interfaceT;

import com.yu.theone.entity.TestJPA;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shuwei.yu.
 * on 2019/12/10.
 */
public interface TestJPARepository extends JpaRepository<TestJPA, Integer> {


}