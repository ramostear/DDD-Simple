package com.ramostear.es.event.sourcing.axon.service.commands;

import com.ramostear.es.event.sourcing.axon.dto.AccountCreatedDTO;
import com.ramostear.es.event.sourcing.axon.dto.MoneyCreditDTO;
import com.ramostear.es.event.sourcing.axon.dto.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-17:05
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public interface AccountCommandService {

    CompletableFuture<String> createAccount(AccountCreatedDTO dto);

    CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO dto);

    CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO dto);

}
