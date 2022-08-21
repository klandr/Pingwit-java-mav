package com.pingwit.kl.controller;

import com.pingwit.kl.dto.AppleDto;
import com.pingwit.kl.servise.AppleServise;
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
    @GetMapping("/get")
    List<AppleDto> getAppleRequestParam(@RequestParam Long id) throws SQLException, ClassNotFoundException {
            return appleServise.getById(id);
        }

        @GetMapping("/get/{runQuery}")
        List<AppleDto> getApple(@PathVariable("runQuery")Long id) throws SQLException, ClassNotFoundException {
       return appleServise.getById(id);
        }

    @GetMapping("/getALL")
    public List<AppleDto> getAllApplies() throws SQLException, ClassNotFoundException {
         return appleServise.getAllApplies();
    }

}
