package com.zenyoga.naveen.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequest {
    private String name;
    private String duration;
    private String timings;
    // private String desc;
    private Long academyId;
}