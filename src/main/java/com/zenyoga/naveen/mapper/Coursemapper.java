package com.zenyoga.naveen.mapper;

import com.zenyoga.naveen.dto.response.Coursedto;
import com.zenyoga.naveen.model.Courseentity;

public class Coursemapper {

    public static Coursedto mapToServiceDto(Courseentity courseEntity) {
        // Implement the mapping logic
        return new Coursedto(
                courseEntity.getId(),
                courseEntity.getName(),
                courseEntity.getDuration(),
                courseEntity.getTimings(),
                courseEntity.getAcademyId()
                
        );
    }

    public static Courseentity mapToServiceEntity(Coursedto courseDto) {
        // Implement the mapping logic
        return new Courseentity(
            courseDto.getId(),
            courseDto.getName(),
            courseDto.getDuration(),
            // courseDto.getDesc(),
            courseDto.getTimings(),
            courseDto.getAcademyId()
        );
    }
}