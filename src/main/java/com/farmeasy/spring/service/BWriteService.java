package com.farmeasy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmeasy.spring.dao.FarmRepository;
import com.farmeasy.spring.dao.FarmVO;

@Service
public class BWriteService implements BWriteServiceInter{

	@Autowired
	FarmRepository farmRepository;

	@Override
	public void execute(FarmVO bVo) {
		farmRepository.write(bVo);
	}
}
