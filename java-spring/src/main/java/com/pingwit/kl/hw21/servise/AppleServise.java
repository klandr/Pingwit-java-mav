package com.pingwit.kl.hw21.servise;

//@Service //<--this bin
//@Component
//Repository

import com.pingwit.kl.hw21.converter.AppleDtoConverter;
import com.pingwit.kl.hw21.dto.AppleDto;
import com.pingwit.kl.hw21.entity.Apple;
import com.pingwit.kl.hw21.repository.AppleWarehouse;
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
    public List<AppleDto> getByName() throws SQLException, ClassNotFoundException {
        List<Apple> allApplies = appleWarehouse.getByName();
        return allApplies.stream().map(appleDtoConverter::convert).toList();
    }

}
