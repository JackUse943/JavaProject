package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.AdminUser;
import com.abhi.repositiry.UserRepo;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepo repo;

	@Override
	public String insertDetails(AdminUser adminUser) {
		String msg = null;
		if (adminUser != null) {
			repo.save(adminUser);
			msg = "Details inserted successfully";
		}

		else {
			msg = "Details insertion failed";
		}
		return msg;
	}
}
