package com.wf.ai.springai.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FinancialService {
    @Autowired
    ChatClient aiClient;

    public String topBanksService(String number) {
        String promptString = "Top " + number + " banks in the world";
        log.info("Prompt String is ::  {}", promptString);
        String bankDetails = aiClient.call(promptString);
        log.info("Chat AI Response :: ----> {}", bankDetails);
        return bankDetails;
    }
}
