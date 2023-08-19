package com.bootproject.jesm34.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootproject.jesm34.dao.BuyerDao;
import com.bootproject.jesm34.dto.BuyerDto;
import com.bootproject.jesm34.helper.ResponseStructure;
import com.bootproject.jesm34.service.BuyerService;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
	
	@Autowired
	BuyerService buyerService;
 
	@PostMapping("/signin")
	public ResponseStructure<BuyerDto> createAccount(@RequestBody BuyerDto buyerDto) {
		System.out.println(buyerDto);
	    return buyerService.createAccount(buyerDto);
		
	}
	@DeleteMapping("/deletebyid")
	public String removeAccount(@RequestBody BuyerDto buyerDto) {
		System.out.println(buyerDto);
		return buyerService.removeAccount(buyerDto.getId());
	}
	@GetMapping("/fetchbyid/{id}")
	public BuyerDto fetchById(@PathVariable int id) {
		System.out.println(id);
		return buyerService.findById(id);
	}
	
	@GetMapping("/fetchall")
	public List<BuyerDto> findAll(){
		return buyerService.findAll();
	}
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		return buyerService.deleteAll();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody BuyerDto buyerDto) {
		return buyerService.update(buyerDto);
	}
	
}
