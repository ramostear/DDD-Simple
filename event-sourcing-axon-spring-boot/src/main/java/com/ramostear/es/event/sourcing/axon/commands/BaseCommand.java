package com.ramostear.es.event.sourcing.axon.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:23
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public class BaseCommand<T> {

    @TargetAggregateIdentifier
    public final T id;

    public BaseCommand(T id){
        this.id = id;
    }
}
