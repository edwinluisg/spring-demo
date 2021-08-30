package com.luis.demo.entity;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "surname", length = 200)
    private String surname;

    @Column(name = "surname", length = 200)
    private String email;

    @Column(name = "enabled")
    private Boolean enabled;

}
