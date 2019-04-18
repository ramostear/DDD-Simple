package com.ramostear.cqrs.axon.entities.handlers;

import com.ramostear.cqrs.axon.aggregates.AccountAggregate;
import com.ramostear.cqrs.axon.entities.Account;
import com.ramostear.cqrs.axon.entities.repositories.AccountRepository;
import com.ramostear.cqrs.axon.events.BaseEvent;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-17:56
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Component
public class AccountHandler {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    @Qualifier("accountAggregateEventSourcingRepository")
    private EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository;


    @EventSourcingHandler
    void on(BaseEvent event){
        persistAccount(buildQueryAccount(getAccountFromEvent(event)));
    }


    private AccountAggregate getAccountFromEvent(BaseEvent event){
        return accountAggregateEventSourcingRepository.load ( event.id.toString () ).getWrappedAggregate ().getAggregateRoot ();
    }


    private Account findExistOrCreateQueryAccount(String id){
        return accountRepository.findById ( id ).isPresent ()?accountRepository.findById ( id ).get ():new Account ();
    }


    private Account buildQueryAccount(AccountAggregate accountAggregate){
        Account account =findExistOrCreateQueryAccount ( accountAggregate.getId ());

        account.setId ( accountAggregate.getId () );
        account.setAccountBalance ( accountAggregate.getAccountBalance () );
        account.setCurrency ( accountAggregate.getCurrency () );
        account.setStatus ( accountAggregate.getStatus () );
        return account;
    }


    private void persistAccount(Account account){
        accountRepository.save ( account );
    }
}
