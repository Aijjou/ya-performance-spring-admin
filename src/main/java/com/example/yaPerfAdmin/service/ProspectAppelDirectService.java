package com.example.yaPerfAdmin.service;

import java.util.List;

import com.example.yaPerfAdmin.model.ProspectAppelDirect;

public interface ProspectAppelDirectService {
	
	
	
	public ProspectAppelDirect create(ProspectAppelDirect prospectAppelDirect);
	public List<ProspectAppelDirect> findAll();
	public void deleteByid(Integer idProspectAppelDirect);


}
