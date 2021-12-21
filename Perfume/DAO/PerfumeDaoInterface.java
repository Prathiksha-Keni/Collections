package com.xworkz.Collection.Perfume.DAO;

import com.xworkz.Collection.Perfume.DTO.PerfumeDto;

public interface PerfumeDaoInterface {

	public void SavePerfumeDto(PerfumeDto obj);
	public void display();
	public void remove(PerfumeDto obj);
}
