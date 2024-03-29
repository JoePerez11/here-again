package com.codeup.meta.entities;

import javax.persistence.*;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //    @ForeignKey({})
    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;


    public Trip() {
    }

    public Trip(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

//    public Trip(Trip trips) {
//        this.id = trips.id;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title;}

    public String getDescription() {return description;}

    public void setDescription(String description) {
        this.description = description;
    }
}

