package com.study.Board.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Member")
@Data
public class Member {

    @Id
    private  String id;
    private  String passWord;


}
