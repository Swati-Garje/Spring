package com.playerFullStack.player.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.playerFullStack.player.model.Admin;
import com.playerFullStack.player.model.Player;

@Service
public interface AdminService {
	public String findAdmin(String username, String password);
}
