package com.dw.TheBoxer.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "re_comment")
public class ReComment {  // 대댓글 기능

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "add_date", updatable = false)
    private LocalDate addDate;

    @Column(name = "modified_date")
    private LocalDate modifiedDate; // 수정일

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;
}
