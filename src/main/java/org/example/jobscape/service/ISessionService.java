package org.example.jobscape.service;

import com.google.api.services.gmail.Gmail;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface ISessionService {

    void login() throws GeneralSecurityException, IOException;

    Gmail getSession();
}
