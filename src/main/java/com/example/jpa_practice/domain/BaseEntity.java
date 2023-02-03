package com.example.jpa_practice.domain;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {

    private Date createdDate;
    private Date lastModifiedDate;
}
