package com.ramostear.es.event.sourcing.axon.service.queries.impl;

import com.ramostear.es.event.sourcing.axon.service.queries.AccountQueryService;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-17:13
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Service
public class AccountQueryServiceImpl implements AccountQueryService {

    private final EventStore eventStore;

    public AccountQueryServiceImpl(EventStore eventStore){
        this.eventStore = eventStore;
    }

    @Override
    public List<Object> listEventsForAccount(String accountNumber) {
        return eventStore.readEvents ( accountNumber ).asStream ().map ( s->s.getPayload () ).collect ( Collectors.toList () );
    }
}
