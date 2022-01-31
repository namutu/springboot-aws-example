package com.mik.spring.domain.tots;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Tots {

    @Id
    private Long id;
    private String testNum;
    private String address;
    private int age;

    @Builder
    public Tots(Long id, String testNum, String address, int age) {
        this.id = id;
        this.testNum = testNum;
        this.address = address;
        this.age = age;
    }

    public void update(String testNum, String address, int age) {
        this.testNum = testNum;
        this.address = address;
        this.age = age;
    }
}















