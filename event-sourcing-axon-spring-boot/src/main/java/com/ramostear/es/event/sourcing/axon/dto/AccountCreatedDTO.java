package com.ramostear.es.event.sourcing.axon.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-17:00
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Getter
@Setter
public class AccountCreatedDTO {

    private double startingBalance;

    private String currency;


}
