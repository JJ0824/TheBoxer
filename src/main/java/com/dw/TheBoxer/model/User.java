package com.dw.TheBoxer.model;

import com.dw.TheBoxer.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name="user_name")
    private String userName; // 유저명

    @Setter
    @Column(name="password", nullable = false)
    private String password; // 비밀번호

    @Setter
    @Column(name = "real_name_m", nullable = false)
    private String realNameM; // 남자 이름

    @Setter
    @Column(name = "real_name_f", nullable = false)
    private String realNameF; // 여자 이름

    @Setter
    @Column(name="email_m", nullable = false)
    private String emailM; // 남자 이메일

    @Setter
    @Column(name="email_f", nullable = false)
    private String emailF; // 여자 이메일

    @Setter
    @Column(name = "phone_number_m",nullable = false)
    private String phoneNumberM; // 남자 번호

    @Setter
    @Column(name = "phone_number_f",nullable = false)
    private String phoneNumberF; // 여자 번호

    @Setter
    @Column(name = "first_date", nullable = false)
    private LocalDate firstDate; // 연애 시작일

    @Setter
    @Column(name = "anniversary")
    private LocalDate anniversary; // 기념일, 지정한 날짜별로 추가

    @Setter
    @Column(name = "anniversary_text")
    private String anniversaryText;

    @ManyToOne
    @JoinColumn(name = "user_authority")
    private Authority authority; // 권한

    @Column(name = "add_date", updatable = false)
    private LocalDate addDate; // 회원가입일자
}