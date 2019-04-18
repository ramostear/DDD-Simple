package com.ramostear.es.event.sourcing.axon.events;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:36
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public class MoneyDebitedEvent extends BaseEvent<String> {

    public final double debitAmount;

    public final String currency;

    public MoneyDebitedEvent(String id,double debitAmount,String currency){
        super(id);
        this.debitAmount = debitAmount;
        this.currency = currency;
    }
}
