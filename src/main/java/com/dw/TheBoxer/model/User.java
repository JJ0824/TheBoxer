package com.dw.TheBoxer.model;

import com.dw.TheBoxer.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(name = "real_name", nullable = false)
    private String realName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @Column(name = "gender",nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender; // ENUM 수정 필요

    @ManyToOne
    @JoinColumn(name = "user_authority")
    private Authority authority; // 권한

//    @OneToMany(mappedBy = "sender")
//    private List<FriendRequest> sendRequests;
//
//    @OneToMany(mappedBy = "receiver")
//    private List<FriendRequest> receivedRequests;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "friend",
//            joinColumns = @JoinColumn(name = "user_name"),
//            inverseJoinColumns = @JoinColumn(name = "friend_name"))
//    private List<User> friends;
}