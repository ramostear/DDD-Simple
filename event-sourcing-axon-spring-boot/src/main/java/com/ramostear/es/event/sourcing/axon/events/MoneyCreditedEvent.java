package com.ramostear.es.event.sourcing.axon.events;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:35
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public class MoneyCreditedEvent extends BaseEvent<String> {

    public final double creditAmount;

    public final String currency;

    public MoneyCreditedEvent(String id,double creditAmount,String currency){
        super(id);
        this.creditAmount = creditAmount;
        this.currency = currency;
    }
}
