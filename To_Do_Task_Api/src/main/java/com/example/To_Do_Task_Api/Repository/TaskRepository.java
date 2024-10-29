package com.example.To_Do_Task_Api.Repository;

import com.example.To_Do_Task_Api.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}