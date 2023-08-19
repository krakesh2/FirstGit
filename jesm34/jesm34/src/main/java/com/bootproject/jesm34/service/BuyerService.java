package com.bootproject.jesm34.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.bootproject.jesm34.dao.BuyerDao;
import com.bootproject.jesm34.dto.BuyerDto;
import com.bootproject.jesm34.helper.ResponseStructure;
import com.bootproject.jesm34.repository.BuyerRepository;
@Component
public class BuyerService {
    @Autowired
    BuyerDao buyerDao;
    
    public ResponseStructure<BuyerDto> createAccount(BuyerDto buyerDto) {
    	BuyerDto dto=buyerDao.createAccount(buyerDto);
    	ResponseStructure<BuyerDto> responseStructure=new ResponseStructure<BuyerDto>();
    	responseStructure.setStatuscode(HttpStatus.ACCEPTED.value());
    	responseStructure.setMessage("account created");
    	responseStructure.setData(dto);
    	return responseStructure;
    }
    
    public String removeAccount(int id){
    	Optional<BuyerDto> obo= buyerDao.removeAccount(id);
    	if(obo.isPresent()) {
    		BuyerDto dto=obo.get();
    		buyerDao.removById(dto.getId());
    		return"data deleted";
    	}else
    		return "data not found";
    }
    public BuyerDto findById(int id) {
    	Optional<BuyerDto> odo= buyerDao.findById(id);
    	if(odo.isPresent()) {
    		BuyerDto buyerDto=odo.get();
    		return buyerDto;
    	}
    	else
    		return null;
    }
    
	public List<BuyerDto> findAll() {
		List<BuyerDto> dtos=buyerDao.findAll();
		if(dtos.isEmpty()) 
			return null;
		else
		return dtos;
	}

	public String deleteAll() {
		List<BuyerDto> dto=buyerDao.findAll();
		if(dto.isEmpty())
			return "no data found";
		else {
			buyerDao.deleteAll();
		return "all data delete";
		}
	}
		public String update(BuyerDto buyerDto) {
			return buyerDao.update(buyerDto);
		}
	
    
}
