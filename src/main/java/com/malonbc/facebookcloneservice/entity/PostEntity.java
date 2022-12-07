package com.malonbc.facebookcloneservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "posts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column(columnDefinition="LONGTEXT")
    private String post;
    private String name;
    private String email;
    @Column(columnDefinition="LONGTEXT")
    private String image;
    @Column(columnDefinition="LONGTEXT")
    private String profilePic;
    private String timeStamp;

}
