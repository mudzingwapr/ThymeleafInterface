package com.mudzingwa.sec.Service;

import java.util.List;

import com.mudzingwa.sec.Models.Bio;

public interface BioServiceIntef {
	public Bio addBio(Bio bio);
	public List<Bio> findAll();
	public void DeleteBio(Integer id);
	public Bio UpdateBio(Bio bio);

}
