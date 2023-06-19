package com.playerFullStack.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playerFullStack.player.model.Player;
import com.playerFullStack.player.service.PlayerService;

@CrossOrigin
@RequestMapping("player")
@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@PostMapping
	public ResponseEntity<Player> savePlayer(@RequestBody Player player) {
		Player savedPlayer = playerService.savePlayer(player);
		return new ResponseEntity<Player>(savedPlayer,HttpStatus.OK);
		
	}

	@GetMapping
	public ResponseEntity<List<Player>> getPendingPlayer(@RequestParam(required=false) String status, @RequestParam(required=false) String team){	
		if(status != null) {
			List<Player> players = playerService.getPendingPlayer(status);
			return new ResponseEntity<List<Player>>(players,HttpStatus.ACCEPTED);
		}else if(team != null) {
			List<Player> players = playerService.playersByTeam(team);
			return new ResponseEntity<List<Player>>(players,HttpStatus.ACCEPTED);
		}else {
			List<Player> players = playerService.findAllPlayer();
			return new ResponseEntity<List<Player>>(players,HttpStatus.ACCEPTED);
		}
	}
	
	@PutMapping
	public ResponseEntity<String> allotPlayer(@RequestBody Player player){
		String data=playerService.allotPlayer(player.getEmail(), player.getTeam());
		return new ResponseEntity<String>(data,HttpStatus.ACCEPTED);
		
	}
}















