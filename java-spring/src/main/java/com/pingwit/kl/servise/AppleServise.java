package com.pingwit.kl.servise;

//@Service //<--this bin
//@Component
//Repository

import com.pingwit.kl.converter.AppleDtoConverter;
import com.pingwit.kl.dto.AppleDto;
import com.pingwit.kl.entity.Apple;
import com.pingwit.kl.repository.AppleWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AppleServise {
    @Autowired
    private final AppleWarehouse appleWarehouse;
    @Autowired
    private final AppleDtoConverter appleDtoConverter;

    public AppleServise(AppleWarehouse appleWarehouse, AppleDtoConverter appleDtoConverter) {
        this.appleWarehouse = appleWarehouse;
        this.appleDtoConverter = appleDtoConverter;
    }



   public List<AppleDto> getById(Long id) throws SQLException, ClassNotFoundException {
        List<Apple> appleById = appleWarehouse.getById(id);
        return appleById.stream().map(appleDtoConverter::convert).toList();
    }

    public List<AppleDto> getAllApplies() throws SQLException, ClassNotFoundException {
        List<Apple> allApplies = appleWarehouse.getAll();
        return allApplies.stream().map(appleDtoConverter::convert).toList();
    }
}
