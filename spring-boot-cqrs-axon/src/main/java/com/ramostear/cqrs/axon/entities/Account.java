package com.ramostear.cqrs.axon.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-17:53
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Entity
@Data
@ToString
public class Account {

    @Id
    private String id;

    private double accountBalance;

    private String currency;

    private String status;


}
