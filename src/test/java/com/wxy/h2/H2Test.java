package com.wxy.h2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
public class H2Test {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void insert(){
        jdbcTemplate.execute("insert into t_user(name,age) values('aaa',12)");
        log.info("插入数据...");
    }
}
