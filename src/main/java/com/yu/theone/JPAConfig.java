package com.yu.theone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by shuwei.yu.
 * on 2019/12/12.
 */
@Slf4j
@Configuration
@EnableTransactionManagement
public class JPAConfig {

    private final EntityManagerFactory emf;
    private final DataSource dataSource;

    @Autowired
    public JPAConfig(EntityManagerFactory emf, DataSource dataSource){
        log.info("1111111111111111111111");
        log.info("1111111111111111111111");
        log.info("1111111111111111111111");
        log.info("1111111111111111111111");
        log.info("1111111111111111111111");
        log.info("1111111111111111111111");
        this.emf = emf;
        this.dataSource = dataSource;

    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager3(){
        log.info("22222222222222222222222222");
        log.info("22222222222222222222222222");
        log.info("22222222222222222222222222");
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(emf);
        tm.setDataSource(dataSource);
        return tm;
    }

}
