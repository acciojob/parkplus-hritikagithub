package com.driver.services;


import org.apache.catalina.User;

public interface UserService {

	void deleteUser(Integer userId);
	User updatePassword(Integer userId, String password);
    void register(String name, String phoneNumber, String password);
}
