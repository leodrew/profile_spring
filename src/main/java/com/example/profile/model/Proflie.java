package com.example.profile.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "profile")
public class Proflie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "introduce")
    private String introDuce;

    @Column(name = "email")
    private String email;

    @Column(name = "created_at")
    private Date createDt;
}
