package com.sb.services.userTask.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.services.projectTask.entity.ProjectTaskEntity;

public interface UserTaskRepository extends JpaRepository<UserTaskEntity, Integer>{

}
