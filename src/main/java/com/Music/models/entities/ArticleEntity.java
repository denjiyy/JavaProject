package com.Music.models.entities;

import com.Music.models.entities.enums.Genre;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "articles")
public class ArticleEntity extends BaseEntity {

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String imageUrl;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private Instant createdOn;
    @ManyToOne
    private UserEntity userEntity;

    public String getTitle() {
        return title;
    }

    public ArticleEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ArticleEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }

    public ArticleEntity setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ArticleEntity setContent(String content) {
        this.content = content;
        return this;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public ArticleEntity setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public ArticleEntity setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
        return this;
    }
}
