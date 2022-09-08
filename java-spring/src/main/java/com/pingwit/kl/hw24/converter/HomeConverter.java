package com.pingwit.kl.hw24.converter;

import com.pingwit.kl.hw24.dto.HomeDto;
import com.pingwit.kl.hw24.entity.Home;
import org.springframework.stereotype.Component;

@Component
public class HomeConverter {
    public Home toLocal(HomeDto dto) {
        Home home = new Home();
        home.setHomeType(dto.homeType());
        home.setFloorNumber(dto.floorNumber());
        home.setEntranceNumber(dto.entranceNumber());
        return home;
    }

    public HomeDto toFront(Home home) {
        return new HomeDto(home.getId(), home.getHomeType(),
                home.getFloorNumber(), home.getEntranceNumber());

    }
}
