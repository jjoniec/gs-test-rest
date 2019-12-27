package com.aws.codestar.projecttemplates.dao;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
@AllArgsConstructor
public class Pill {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String Description;
    private Integer weight;

    protected Pill() {}
}
