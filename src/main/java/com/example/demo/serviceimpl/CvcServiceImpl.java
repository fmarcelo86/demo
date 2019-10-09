package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ConsultaResponseDto;
import com.example.demo.dumy.CvcDumy;
import com.example.demo.service.CvcService;

@Service
public class CvcServiceImpl implements CvcService {
	
	@Override
	public ConsultaResponseDto getCvc() {
		
		ConsultaResponseDto consultaResponseDto = null;
		CvcDumy cvcDumy = new CvcDumy();
		
		consultaResponseDto = cvcDumy.dataCvcDumy();
		
		return consultaResponseDto;
	}
}
