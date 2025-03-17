package com.dw.TheBoxer.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "tag") // 하나의 태그는 여러 게시글을 가질 수 있음
    private List<Board> boards;  // 해당 태그가 포함된 게시글 목록
}
