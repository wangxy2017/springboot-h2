package com.wxy.h2.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author wangxiaoyuan
 * @Date 19-10-31 下午6:35
 * @Description TODO
 **/
@Data
@Entity
public class User {
    @Id
    private String id;
    private Integer age;
    private String name;
    private String address;
    private String city;
}
