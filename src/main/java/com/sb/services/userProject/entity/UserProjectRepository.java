package com.sb.services.userProject.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.services.userTask.entity.UserTaskEntity;

public interface UserProjectRepository extends JpaRepository<UserProjectEntity, Integer>{

}
