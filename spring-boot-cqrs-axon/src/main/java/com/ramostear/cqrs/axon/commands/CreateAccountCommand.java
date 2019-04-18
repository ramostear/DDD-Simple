package com.ramostear.cqrs.axon.commands;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:25
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public class CreateAccountCommand extends BaseCommand<String> {

    public final double accountBalance;

    public final String currency;

    public CreateAccountCommand(String id,double accountBalance,String currency) {
        super ( id );
        this.accountBalance = accountBalance;
        this.currency = currency;
    }
}
