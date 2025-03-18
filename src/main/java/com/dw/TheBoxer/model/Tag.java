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
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "board_tag")  // 여러 태그는 여러 게시글을 가질 수 있음
    private List<Board> boards;  // 해당 태그가 포함된 게시글 목록
}
