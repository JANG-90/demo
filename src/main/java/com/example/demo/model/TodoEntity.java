package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "Todo")
public class TodoEntity {
    @Id
    @GeneratedValue(generator = "system-uuid") //id 자동 생성 어노테이션
    @GenericGenerator(name = "system-uuid", strategy = "uuid") //
    private String id;  //프로젝트 아이디
    private String userId;  //생상한 유저의 아이디
    private String title; //todo타이틀
    private boolean done; //ture -todo를 완료 한 경우(checked)

}
