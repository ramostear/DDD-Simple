package com.ramostear.cqrs.axon.services.queries;

import com.ramostear.cqrs.axon.entities.Account;

import java.util.List;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-18:05
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public interface AccountQueryService {

    List<Object> listEventsForAccount(String accountNumber);

    Account getAccount(String accountNumber);

}
