package com.wf.ai.springai.controller;

import com.wf.ai.springai.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class FinancialController {

    @Autowired
    FinancialService financialService;

    @GetMapping("/topBanks/{number}")
    public String topBanks(@PathVariable String number) {
        return financialService.topBanksService(number);
    }
}
