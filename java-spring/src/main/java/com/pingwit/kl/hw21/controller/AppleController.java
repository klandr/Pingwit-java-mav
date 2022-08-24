package com.pingwit.kl.hw21.controller;

import com.pingwit.kl.hw21.dto.AppleDto;
import com.pingwit.kl.hw21.servise.AppleServise;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class AppleController {
    private final AppleServise appleServise;


    public AppleController(AppleServise appleServise) {
        this.appleServise = appleServise;
            }

    @GetMapping("/getALL")
    public List<AppleDto> getAllApplies() throws SQLException, ClassNotFoundException {
        return appleServise.getAllApplies();
    }
    @GetMapping("/get")
    List<AppleDto> getAppleRequestParam(@RequestParam Long id) throws SQLException, ClassNotFoundException {
            return appleServise.getById(id);
        }

        @GetMapping("/get/{appleId}")
        List<AppleDto> getApple(@PathVariable("appleId") Long id) throws SQLException, ClassNotFoundException {
            return appleServise.getById(id);
        }

    @GetMapping("/getName")
    public List<AppleDto> getNamApple() throws SQLException, ClassNotFoundException {
        return appleServise.getByName();
    }

}
