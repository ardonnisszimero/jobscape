package org.example.jobscape.service;

import com.google.api.services.gmail.Gmail;
import lombok.RequiredArgsConstructor;
import org.example.jobscape.proxy.GmailFactoryProxy;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Service
@RequiredArgsConstructor
public class SessionService implements ISessionService {

    private final GmailFactoryProxy gmailFactoryProxy;

    private Gmail gmailService;

    @Override
    public void login() throws GeneralSecurityException, IOException {
        gmailService = gmailFactoryProxy.connect();
    }

    @Override
    public Gmail getSession() {
        return gmailService;
    }

}
