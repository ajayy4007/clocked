package com.sb.services.user.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sb.services.model.BussinesError;
import com.sb.services.model.BussinessException;
import com.sb.services.utils.EncryptionUtil;

@Service
public class UserServices {

	@Autowired
	UserRepository userRepository;

	public UserEntity getUserById(int id) {
		Optional<UserEntity> optinalUser = userRepository.findById(id);

		if (optinalUser.isPresent()) {
			return optinalUser.get();
		}
		return null;
	}

	public ResponseEntity<UserResponse> saveUser(UserRequest userRequest) {
		BussinesError error = new BussinesError();
		User user = userRequest.getUser();
		UserEntity userDao = new UserEntity();
		userDao.setActive('Y');
		userDao.setId(user.getId());
		userDao.setAddress(user.getAddress());
		userDao.setCreatedon(LocalDateTime.now());
		userDao.setUpdatedon(LocalDateTime.now());
		userDao.setDob(user.getDob());

		int len = userRequest.getUser().getMobNo().length();
		if (len == 10) {
			if (userRepository.findUserEntityByMobNo(userRequest.getUser().getMobNo()) == null) {
				userDao.setMobNo(user.getMobNo());

			} else {
				error.setErrorCode("E0001");
				error.setErrorMsg("Mob no already exist");
				error.setErrorType("VAL_ERR");
				throw new BussinessException(error, "mob no exist", null);
			}
		} else {
			error.setErrorCode("E0001");
			error.setErrorMsg("Mob no should be 10 digit");
			error.setErrorType("VAL_ERR");
			throw new BussinessException(error, "Mob no should be 10 digit", null);
		}

		UserEntity userEntityByEmail = userRepository.findUserEntityByEmailId(userRequest.getUser().getEmailId());
		/*
		 * if (userEntityByEmail != null &&
		 * !userRepository.findUserEntityByEmailId(userRequest.getUser().getEmailId())
		 * .equals(user.getEmailId())) { userDao.setEmailId(user.getEmailId()); } else
		 */ if (userEntityByEmail == null) {
			userDao.setEmailId(user.getEmailId());
		} else {

			error.setErrorCode("E0002");
			error.setErrorMsg("emailId already exist");
			error.setErrorType("VAL_ERR");

			throw new BussinessException(error, "emailId already exist", null);

		}
		userDao.setName(user.getName());
		userDao.setVerify('Y');
		// UserEnt dbEntity = reo . get by usename 9req.geu.getyn0

		if (userRepository.findUserEntityByUserName(userRequest.getUser().getUserName()) == null) {
			userDao.setUserName(user.getUserName());
		} else {
			error.setErrorCode("E0003");
			error.setErrorMsg("userName already exist");
			error.setErrorType("VAL_ERR");

			throw new BussinessException(error, "Username already exist", null);
		}

		userDao.setPassword(EncryptionUtil.encryptString(user.getPassword()));

		userRepository.save(userDao);
		UserResponse userResponse = new UserResponse();
		userResponse.setStatus("success");
		userResponse.setUser(user);
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);

	}

	public ResponseEntity<UserResponse> getAllUsers() {

		List<UserEntity> userList = userRepository.findAll();
		UserResponse res = new UserResponse();

		res.setError(null);
		res.setStatus("success");
		res.setUser(userList);

		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

	public void updateUser(UserEntity user) {

		Optional<UserEntity> excitingUser = userRepository.findById(user.getId());
		if (excitingUser.isPresent()) {
			UserEntity dbUser = excitingUser.get();
			boolean toBeUpdated = false;
			if (!StringUtils.isEmpty(user.getName()) && !user.getName().equals(dbUser.getName())) {
				dbUser.setName(user.getName());
				toBeUpdated = true;
			}
			if (!Objects.isNull(user.getMobNo()) && user.getMobNo() != dbUser.getMobNo()) {
				dbUser.setMobNo(user.getMobNo());

				toBeUpdated = true;
			}
			if (!StringUtils.isEmpty(user.getEmailId()) && !user.getEmailId().equals(dbUser.getEmailId())) {
				dbUser.setEmailId(user.getEmailId());

				toBeUpdated = true;
			}
			if (!StringUtils.isEmpty(user.getDob()) && !user.getDob().equals(dbUser.getDob())) {
				dbUser.setDob(user.getDob());

				toBeUpdated = true;
			}
			if (!StringUtils.isEmpty(user.getAddress()) && !user.getAddress().equals(dbUser.getAddress())) {
				dbUser.setAddress(user.getAddress());

				toBeUpdated = true;
			}
			if (!StringUtils.isEmpty(user.getPassword()) && !user.getPassword().equals(dbUser.getPassword())) {
				dbUser.setPassword(user.getPassword());

				toBeUpdated = true;
				if (toBeUpdated) {
					userRepository.save(dbUser);
				}
			}
		}
	}

	public void loginUser(UserRequest userRequest) {
		String encryptedPwd = EncryptionUtil.encryptString(userRequest.getUser().getPassword());
		UserEntity excitingUser = userRepository.findUserEntityByUserName(userRequest.getUser().getUserName());
		if (excitingUser == null) {
			System.out.println("invalid User");
		} else if (encryptedPwd.equals(excitingUser.getPassword())) {
			System.out.println("logged in");
		} else {
			System.out.println("Invalid password");
		}
	}

	public List<UserEntity> findUserEntityByName(String name) {
		Optional<List<UserEntity>> optinalUser = Optional.ofNullable(userRepository.findUserEntityByName(name));
		return optinalUser.get();

	}
}
