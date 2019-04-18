package com.ramostear.cqrs.axon.events;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:30
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public class BaseEvent<T> {

    public final T id;

    public BaseEvent(T id){
        this.id = id;
    }
}
