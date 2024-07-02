package com.omega.watch.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "watch_images")
public class WatchImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "watch_id")
    private Watch watch;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    public WatchImage() {

    }

    public WatchImage(Watch watch, String imageUrl) {
        this.watch = watch;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
