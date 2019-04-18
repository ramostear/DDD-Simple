package com.ramostear.cqrs.axon.dto;

import lombok.Data;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-17:03
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Data
public class MoneyDebitDTO {

    private double debitAmount;

    private String currency;
}
