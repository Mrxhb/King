package com.dzkj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzkj.mapper.IUsersMapper;
import com.dzkj.pojo.Users;


@Service
public class UsersDaoImp implements IUsersDao{
	@Autowired
	private IUsersMapper users_mapper;
	
	
	@Override
	public List<Users> findAll() {
			
		return users_mapper.findAll();
	}

}
