package com.sb.services.project.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.services.task.entity.TaskEntity;
import com.sb.services.user.entity.UserEntity;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
	public ProjectEntity findProjectEntityBypName(String pName);

	

}
