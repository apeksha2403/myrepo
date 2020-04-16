package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.UserEntity;
import com.spring.json.User;
import com.spring.rest.repository.UserRepository;
import com.spring.utils.UserUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String login(User user) {
		String userName=user.getUserName();
		String password=user.getPassword();
		List<UserEntity> userList=userRepository.findByUserName(userName);
		if(userList==null || userList.size()==0) {
			return "{ \"result\": \"failed\",\"message\": \" Invalid user\""+userName+"}";
		}
		else {
			UserEntity userEntity=userList.get(0);
			if(password.equals(userEntity.getPassword())) {
				String sessionId=new java.rmi.server.UID().toString().substring(0,10);
				userEntity.setSessionId(sessionId);
				userRepository.save(userEntity);
				return "{ \"result\": \"Success\",\"message\": \"Login Successful\","
						+ "\"auth-token\":\""+sessionId+"\"}";
			}
			else {
				return "{ \"result\": \"failed\",\"message\": \" Invalid password\"}";
			}
		}
	}
	@Override
	public String logout(String authToken) 
	{
		if (authToken.equals(null))
		{
			return "{\"result\": \"failed\",\"message\": \"Invalid Session-Id\"}";
		}
		else
		{
	     List<UserEntity> userEntity= userRepository.findBySessionId(authToken);
		((UserEntity) userEntity).setSessionId(null);
		userEntity =userRepository.saveAll(userEntity);
		return "{ \"result\": \"Success\",\"message\": \"User Successfully logout\"}";
		}
	}

	public User save(User user) {
		UserEntity userEntity = 
				userRepository.save(UserUtils.convertUserToUserEntity(user));
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	public List<User> getAllUsers() {
		List<UserEntity> userEntityList = userRepository.findAll();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	public User getUserById(String id) {
		UserEntity userEntity = userRepository.findById(Long.valueOf(id)).get();
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	@Override
	public List<User> getUsersByFirstName(String firstName) {
		List<UserEntity> userEntityList = userRepository.findByFirstName(firstName);
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public User update(User user, String id) {
		UserEntity userEntity = userRepository.findById(Long.valueOf(id)).get();
		if(userEntity != null) {
			userEntity.setFirstName(user.getFirstName());
			userEntity.setUserName(user.getUserName());
			userEntity.setPassword(user.getPassword());
			userEntity = userRepository.save(userEntity);
			return UserUtils.convertUserEntityToUser(userEntity);
		}
		return null;
	}

	@Override
	public boolean delete(String id) {
		if(userRepository.existsById(Long.valueOf(id))) {
			userRepository.deleteById(Long.valueOf(id));
			return true;
		}
		return false;
	}

	@Override
	public List<User> getUsersByOrderByFirstNameAsc() {
		List<UserEntity> userEntityList = userRepository.findByOrderByFirstNameAsc();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public List<User> getUsersByOrderByFirstNameDesc() {
		List<UserEntity> userEntityList = userRepository.findByOrderByFirstNameDesc();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	
}
