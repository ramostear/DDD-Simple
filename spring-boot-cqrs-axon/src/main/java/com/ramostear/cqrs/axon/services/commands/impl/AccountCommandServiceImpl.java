package com.ramostear.cqrs.axon.services.commands.impl;

import com.ramostear.cqrs.axon.commands.CreateAccountCommand;
import com.ramostear.cqrs.axon.commands.CreditMoneyCommand;
import com.ramostear.cqrs.axon.commands.DebitMoneyCommand;
import com.ramostear.cqrs.axon.dto.AccountCreatedDTO;
import com.ramostear.cqrs.axon.dto.MoneyCreditDTO;
import com.ramostear.cqrs.axon.dto.MoneyDebitDTO;
import com.ramostear.cqrs.axon.services.commands.AccountCommandService;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-18:13
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Service
public class AccountCommandServiceImpl implements AccountCommandService {


    private final CommandGateway commandGateway;

    public AccountCommandServiceImpl(CommandGateway commandGateway){
        this.commandGateway = commandGateway;
    }

    @Override
    public CompletableFuture<String> createAccount(AccountCreatedDTO dto) {
        return commandGateway.send ( new CreateAccountCommand ( UUID.randomUUID ( ).toString (),dto.getStartingBalance (),dto.getCurrency () ) );
    }

    @Override
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO dto) {
        return commandGateway.send ( new CreditMoneyCommand ( accountNumber,dto.getCreditAmount (),dto.getCurrency () ) );
    }

    @Override
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO dto) {
        return commandGateway.send ( new DebitMoneyCommand ( accountNumber,dto.getDebitAmount (),dto.getCurrency () ) );
    }
}
