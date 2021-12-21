package com.xworkz.Collection.Perfume;

import com.xworkz.Collection.Perfume.DTO.PerfumeDto;
import com.xworkz.Collection.Perfume.Service.PerfumeServiceImpl;

public class PerfumeTester {

	public static void main(String[] args) {
		PerfumeServiceImpl perfume = new PerfumeServiceImpl();
		PerfumeDto foog = new PerfumeDto("foog",2500,"100ml","Jasmine");
		perfume.validateSave(foog);
		PerfumeDto denver = new PerfumeDto("denver",800,"50ml","Rose");
		perfume.validateSave(denver);
		PerfumeDto envy = new PerfumeDto("envy",1000,"150ml","Sandalwood");
		perfume.validateSave(envy);
		PerfumeDto ocean = new PerfumeDto("ocean",750,"200ml","Vanilla");
		perfume.validateSave(ocean);
		PerfumeDto axe = new PerfumeDto("axe",3500,"100ml","Musk");
		perfume.validateSave(axe);

		perfume.display();
		System.out.println("After Deletion");
		perfume.remove(ocean);
		perfume.display();
	}

}
