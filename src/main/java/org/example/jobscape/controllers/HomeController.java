package org.example.jobscape.controllers;


import com.google.api.services.gmail.model.ListMessagesResponse;
import lombok.RequiredArgsConstructor;
import org.example.jobscape.service.ISessionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {


    private final ISessionService sessionService;

    @GetMapping("/")
    public void home() throws GeneralSecurityException, IOException {
        sessionService.login();
    }
    
    @GetMapping("/label")
    public String getLabel() throws IOException {
        String user = "me";
        ListMessagesResponse lmr =  sessionService.getSession().users().messages().list(user).execute();
        return lmr.getMessages().toString();
    }
}
