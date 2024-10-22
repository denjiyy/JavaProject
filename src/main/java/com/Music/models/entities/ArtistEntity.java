package com.Music.models.entities;

import com.google.gson.annotations.Expose;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "artists")
public class ArtistEntity extends BaseEntity {

    @Expose
    @Column(nullable = false, columnDefinition = "TEXT")
    private String name;
    @Expose
    @Column(nullable = false, columnDefinition = "TEXT")
    private String careerInformation;

    public String getName() {
        return name;
    }

    public ArtistEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getCareerInformation() {
        return careerInformation;
    }

    public ArtistEntity setCareerInformation(String careerInformation) {
        this.careerInformation = careerInformation;
        return this;
    }

    @Override
    public String toString() {
        return "ArtistEntity{" +
                "name='" + name + '\'' +
                ", careerInformation='" + careerInformation + '\'' +
                '}';
    }
}
