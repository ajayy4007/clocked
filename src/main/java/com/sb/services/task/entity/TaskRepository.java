package com.sb.services.task.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.services.user.entity.UserEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
	public TaskEntity findTaskEntityByTaskName(String taskName);
}
