package com.cvt.users.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="micro_users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name="Id")
    private String userID;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="about")
    private String about;

    @Transient
    private List<Rating> ratings;



}
