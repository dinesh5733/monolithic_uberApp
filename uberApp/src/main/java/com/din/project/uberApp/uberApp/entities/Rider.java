package com.din.project.uberApp.uberApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
@Entity
@Getter
@Setter
@Table(name="rider")
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
