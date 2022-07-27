package com.codeup.meta.entities;

import javax.persistence.*;

@Entity
public class ProfileData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String username;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String location;

    public ProfileData() {
    }

}
