package com.ramostear.cqrs.axon.config;

import com.ramostear.cqrs.axon.aggregates.AccountAggregate;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-18:17
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Configuration
public class AxonConfig {

    @Bean
    EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository(EventStore eventStore) {
        EventSourcingRepository<AccountAggregate> repository = new EventSourcingRepository<AccountAggregate> ( AccountAggregate.class, eventStore );
        return repository;
    }
}