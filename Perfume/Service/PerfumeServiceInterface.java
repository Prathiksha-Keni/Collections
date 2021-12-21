package com.xworkz.Collection.Perfume.Service;

import com.xworkz.Collection.Perfume.DTO.PerfumeDto;

public interface PerfumeServiceInterface {

	public void validateSave(PerfumeDto obj);
	public void display();
	public void remove(PerfumeDto obj);
}
