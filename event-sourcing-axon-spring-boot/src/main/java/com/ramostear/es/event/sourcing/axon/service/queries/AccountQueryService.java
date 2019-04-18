package com.ramostear.es.event.sourcing.axon.service.queries;

import java.util.List;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-17:12
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public interface AccountQueryService {

    public List<Object> listEventsForAccount(String accountNumber);
}
