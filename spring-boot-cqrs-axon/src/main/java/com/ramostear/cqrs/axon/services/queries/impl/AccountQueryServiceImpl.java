package com.ramostear.cqrs.axon.services.queries.impl;

import com.ramostear.cqrs.axon.entities.Account;
import com.ramostear.cqrs.axon.entities.repositories.AccountRepository;
import com.ramostear.cqrs.axon.services.queries.AccountQueryService;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-18:07
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Service
public class AccountQueryServiceImpl implements AccountQueryService {

    private final EventStore eventStore;

    private final AccountRepository accountRepository;

    public AccountQueryServiceImpl(EventStore eventStore,AccountRepository accountRepository){
        this.eventStore = eventStore;
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Object> listEventsForAccount(String accountNumber) {
        return eventStore.readEvents ( accountNumber ).asStream ().map ( s->s.getPayload () ).collect ( Collectors.toList () );
    }

    @Override
    public Account getAccount(String accountNumber) {
        return accountRepository.findById(accountNumber).get();
    }
}
