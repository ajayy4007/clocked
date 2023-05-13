package com.sb.services.projectTask.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.services.project.entity.ProjectEntity;
@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTaskEntity, Integer> {
	public List<ProjectTaskEntity> findProjectTaskEntityBypId(Integer pId);
	public List<ProjectTaskEntity> findProjectTaskEntityBytId(Integer tId);

	


}
