package com.mudzingwa.sec.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.sec.Models.Bio;
import com.mudzingwa.sec.Repository.BioRepo;
@Service
public class BioImplemInter implements BioServiceIntef {
	@Autowired
private BioRepo repos;
	@Override
	public Bio addBio(Bio bio) {
		// TODO Auto-generated method stub
		return repos.save(bio);
	}

	@Override
	public List<Bio> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public void DeleteBio(Integer id) {
		// TODO Auto-generated method stub
		repos.deleteById(id);

	}

	@Override
	public Bio UpdateBio(Bio bio) {
		// TODO Auto-generated method stub
		return repos.saveAndFlush(bio);
	}

}
