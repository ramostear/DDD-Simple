package com.ramostear.cqrs.axon.entities.repositories;

import com.ramostear.cqrs.axon.entities.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-17:55
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public interface AccountRepository extends CrudRepository<Account,String> {
}
