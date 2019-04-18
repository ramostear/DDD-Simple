package com.ramostear.cqrs.axon.services.commands;

import com.ramostear.cqrs.axon.dto.AccountCreatedDTO;
import com.ramostear.cqrs.axon.dto.MoneyCreditDTO;
import com.ramostear.cqrs.axon.dto.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-18:05
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public interface AccountCommandService {

    CompletableFuture<String> createAccount(AccountCreatedDTO dto);

    CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO dto);

    CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO dto);
}
