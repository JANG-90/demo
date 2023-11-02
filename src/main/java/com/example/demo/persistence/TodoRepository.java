package com.example.demo.persistence;

import com.example.demo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<TodoEntity, String> //<테이블 매핑할 엔티티, 엔티티클래스에서 기본 키 타입>
{
    List<TodoEntity> findByUserId(String userId);
}
