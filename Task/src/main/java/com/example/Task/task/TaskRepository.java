package com.example.Task.task;
import com.example.Task.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
//    List<Task> findByUserId(Long userId);
}
