package com.ramostear.cqrs.axon.controller;

import com.ramostear.cqrs.axon.entities.Account;
import com.ramostear.cqrs.axon.services.queries.AccountQueryService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-18:47
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@RestController
@RequestMapping(value="/bank-accounts")
@Api(value = "Account Queries", description = "Account Query Events Endpoint", tags = "Account Queries")
public class AccountQueryController {

    private final AccountQueryService accountQueryService;

    public AccountQueryController(AccountQueryService accountQueryService){
        this.accountQueryService = accountQueryService;
    }

    @GetMapping("/{accountNumber}")
    public Account getAccount(@PathVariable(value="accountNumber")String accountNumber){
        return accountQueryService.getAccount ( accountNumber );
    }


    @GetMapping("/{accountNumber}/events")
    public List<Object> listEventsForAccount(@PathVariable(value = "accountNumber")String accountNumber){
        return accountQueryService.listEventsForAccount ( accountNumber );
    }
}
