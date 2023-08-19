package com.bootproject.jesm34.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bootproject.jesm34.dto.BuyerDto;
import com.bootproject.jesm34.repository.BuyerRepository;

@Component
public class BuyerDao {

	@Autowired
    BuyerRepository buyerRepository;

public BuyerDto createAccount(BuyerDto buyerDto) {
	buyerRepository.save(buyerDto);
	return buyerDto;
}

public Optional<BuyerDto> removeAccount(int id) {
	Optional<BuyerDto> obo=buyerRepository.findById(id);
	return obo;
}

public void removById(int id) {
	buyerRepository.deleteById(id);
}

public Optional<BuyerDto> findById(int id){
	Optional<BuyerDto> obo=buyerRepository.findById(id);
	return obo;
}

public List<BuyerDto> findAll() {
	List<BuyerDto> buyerDtos=buyerRepository.findAll();
	return buyerDtos;
}

public void deleteAll() {
	buyerRepository.deleteAll();	
}
public String update(BuyerDto buyerDto) {
	buyerRepository.save(buyerDto);
	return "data update";
}
}