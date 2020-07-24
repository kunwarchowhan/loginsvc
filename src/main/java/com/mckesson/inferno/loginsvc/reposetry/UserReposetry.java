package com.mckesson.inferno.loginsvc.reposetry;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.mckesson.inferno.loginsvc.model.User;

public interface UserReposetry extends MongoRepository<User, Long> {
	 User findByUserName(String userName); 
	 
}
