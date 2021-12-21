package com.xworkz.Collection.Perfume.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.Collection.Perfume.DTO.PerfumeDto;

public class PerfumeDaoInterfaceImpl implements PerfumeDaoInterface {

	
	
	public PerfumeDaoInterfaceImpl() {
		System.out.println("DAO Created");
	}

	List perfume=new ArrayList();
	
	@Override
	public void SavePerfumeDto(PerfumeDto obj) {
		perfume.add(obj);
	}

	@Override
	public void display() {
		
		Iterator iterator =perfume.iterator();
		while (iterator.hasNext()) {
			PerfumeDto p=(PerfumeDto)iterator.next();
			System.out.println(p.getBrand());
			System.out.println(p.getPrice());
			System.out.println(p.getFragnance());
			System.out.println(p.getQuantity());
			System.out.println("---------------------");
		}
	}

	@Override
	public void remove(PerfumeDto obj) {
		boolean remove =perfume.remove(obj);
		if(remove) {
			System.out.println("Removed succesfully");
		}
		
	}

	

	

}
