package com.icss.employeeSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icss.employeeSystem.repository.EOARepository;

@Component("EOAservice")
public class EOAService {

	@Autowired
	private EOARepository EOArepository;
	
	public EOAService() {
		// TODO Auto-generated constructor stub
	}

	public EOARepository getEOArepository() {
		return EOArepository;
	}

	public void setEOArepository(EOARepository eOArepository) {
		EOArepository = eOArepository;
	}
	
	public void insert(String empId,String authId){
		EOArepository.insert(empId, authId);
	}
	
	public void deleteWithEmpId(String empId){
		EOArepository.deleteWithEmpId(empId);
	}
	
	public List<?> queryForList(final String sql, final List<?> paras){
		return EOArepository.queryForList(sql, paras);
	}
}
