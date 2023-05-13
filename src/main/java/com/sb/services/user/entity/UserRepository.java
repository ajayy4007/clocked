package com.sb.services.user.entity;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	public UserEntity findUserEntityByUserName(String userName);
	public UserEntity findUserEntityByEmailId(String emailId );
	public UserEntity findUserEntityByMobNo(String mobNo);
	public List<UserEntity> findUserEntityByName(String name);

}
