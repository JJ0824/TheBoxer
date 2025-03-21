package com.dw.TheBoxer.model;


import com.dw.TheBoxer.enums.Reaction;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "great")
public class Great { // 좋아요 기능
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board; // 유저(단방향)

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user; // 유저(단방향)

    @Column(name = "reaction")
    @Enumerated(EnumType.STRING)
    private Reaction reaction; // ENUM
}
