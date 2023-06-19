package com.playerFullStack.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playerFullStack.player.dao.AdminDao;
import com.playerFullStack.player.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDao adminDao;

	@Override
	public String findAdmin(String username, String password) {
		Admin found = adminDao.findByUsernameAndPassword(username, password);
		if(found!=null) {
			return "1";		
		}
		return "0";
	}
}
