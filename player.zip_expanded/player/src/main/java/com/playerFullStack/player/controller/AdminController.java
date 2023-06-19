package com.playerFullStack.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playerFullStack.player.model.Admin;
import com.playerFullStack.player.model.Player;
import com.playerFullStack.player.service.AdminService;


@CrossOrigin
@RequestMapping("admin")
@RestController
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	
	@PostMapping
	public ResponseEntity<String> findAdmin(@RequestBody Admin loginadmin){
		String data=adminservice.findAdmin(loginadmin.getUsername(), loginadmin.getPassword());
		return new ResponseEntity<String>(data,HttpStatus.ACCEPTED);
	}
}













