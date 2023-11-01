package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TodoEntity {
    private String id;  //프로젝트 아이디
    private String userId;  //생상한 유저의 아이디
    private String title; //Todo 타이틀
    private boolean done; //ture -todo를 완료 한 경우(checked)

}
