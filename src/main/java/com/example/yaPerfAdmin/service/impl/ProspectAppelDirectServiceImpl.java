package com.example.yaPerfAdmin.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yaPerfAdmin.model.ProspectAppelDirect;
import com.example.yaPerfAdmin.repository.ProspectAppelDirectRespository;
import com.example.yaPerfAdmin.service.ProspectAppelDirectService;

@Service
@Transactional
public class ProspectAppelDirectServiceImpl implements ProspectAppelDirectService {

	@Autowired
	ProspectAppelDirectRespository prospectAppelDirectRepository;

	@Override
	public ProspectAppelDirect create(ProspectAppelDirect prospectAppelDirect) {

		return prospectAppelDirectRepository.save(prospectAppelDirect);
	}

	@Override
	public List<ProspectAppelDirect> findAll() {

		return (List<ProspectAppelDirect>) prospectAppelDirectRepository.findAll();
	}

	@Override
	public void deleteByid(Integer idProspectAppelDirect) {
		prospectAppelDirectRepository.deleteById(idProspectAppelDirect);

	}

	@Override
	public ProspectAppelDirect finProspectAppelDirectById(Integer id) {

		return prospectAppelDirectRepository.findById(id).get();
	}

}
