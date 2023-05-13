package com.sb.services.project.entity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sb.services.model.BussinesError;
import com.sb.services.task.entity.TaskEntity;
import com.sb.services.task.entity.TaskRequest;
import com.sb.services.task.entity.TaskResponse;
import com.sb.services.user.entity.UserEntity;
@Service
public class ProjectServices {
	@Autowired
	ProjectRepository projectRepository;
	public ResponseEntity<ProjectResponse> saveProject(@RequestBody ProjectRequest projectRequest) {
		BussinesError error = new BussinesError();
		com.sb.services.project.entity.Project project = projectRequest.getProject();
		ProjectEntity projectDao = new ProjectEntity();
		projectDao.setpId(project.getpId());
		projectDao.setpName(project.getpName());
		projectDao.setDescription(project.getDescription());
		projectDao.setAssigned_to(project.getAssigned_to());
		projectDao.setStartDate(LocalDateTime.now());
		projectDao.setDueDate(project.getDueDate());
		projectDao.setCompDate(project.getCompDate());
		projectDao.setRemark(project.getRemark());
		projectRepository.save(projectDao);
		ProjectResponse projectResponse = new ProjectResponse();
		projectResponse.setStatus("success");
		projectResponse.setProject(project);
		return ResponseEntity.status(HttpStatus.OK).body(projectResponse);

	}
	public ProjectEntity getProjectById(@PathVariable int pid) {
		Optional<ProjectEntity> optinalProject = projectRepository.findById(pid);
		
		if (optinalProject.isPresent()) {
			return optinalProject.get();
		}
		return null;
	}

}
