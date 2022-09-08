package com.pingwit.kl.hw22.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServerService {

    private final String serverName;

    public ServerService(@Value("${pingwit.server.name}") String serverName) {
        this.serverName = serverName;
    }

    public String getName(){
        return serverName;
    }
}
