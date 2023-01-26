package com.example.jpa_practice.web.dto;

import com.example.jpa_practice.domain.Member;
import lombok.Getter;

@Getter
public class MemberListDto {

    private String id;
    private String username;
    private Integer age;
    public MemberListDto(Member entity){
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.age = entity.getAge();
    }
}
