package com.example.jpa_practice.web.dto;

import com.example.jpa_practice.domain.Member;
import lombok.Getter;

@Getter
public class MemberListDto {

    private Long id;
    private String name;
//    private Integer age;
    public MemberListDto(Member entity){
        this.id = entity.getId();
        this.name = entity.getName();
//        this.age = entity.getAge();
    }
}
