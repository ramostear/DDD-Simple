package com.ramostear.es.event.sourcing.axon.controller;

import com.ramostear.es.event.sourcing.axon.service.queries.AccountQueryService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-17:22
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@RestController
@RequestMapping(value="/bank-accounts")
@Api(value="Account Queries",description = "Account Query Events Endpoint",tags = "Account Queries")
public class AccountQueryController {

    private final AccountQueryService accountQueryService;

    public AccountQueryController(AccountQueryService accountQueryService){
        this.accountQueryService = accountQueryService;
    }


    @GetMapping(value = "/{accountNumber}/events")
    public List<Object> listEventsForAccount(@PathVariable(value="accountNumber")String accountNumber){
        return accountQueryService.listEventsForAccount ( accountNumber );
    }
}
