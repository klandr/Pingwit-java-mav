package com.pingwit.kl.hw22.controller;

import com.pingwit.kl.hw22.service.ServerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    private final ServerService serverService;

    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @GetMapping("/name")
    public String getName(){
    return serverService.getName();
    }
}
