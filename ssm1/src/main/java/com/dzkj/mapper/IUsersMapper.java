package com.dzkj.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dzkj.pojo.Users;



@Repository
public interface IUsersMapper {
	List<Users> findAll();
}
