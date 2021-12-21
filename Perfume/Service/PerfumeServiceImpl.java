package com.xworkz.Collection.Perfume.Service;

import com.xworkz.Collection.Perfume.DAO.PerfumeDaoInterfaceImpl;
import com.xworkz.Collection.Perfume.DTO.PerfumeDto;
import com.xworkz.Collection.Perfume.Exception.InvalidBrandException;
import com.xworkz.Collection.Perfume.Exception.InvalidFragnanceException;
import com.xworkz.Collection.Perfume.Exception.InvalidPriceException;
import com.xworkz.Collection.Perfume.Exception.InvalidQuantityException;

public class PerfumeServiceImpl implements PerfumeServiceInterface {
	PerfumeDaoInterfaceImpl per =new PerfumeDaoInterfaceImpl();
	boolean status=true;
	@Override
	public void validateSave(PerfumeDto obj) {
		try {
			if(obj.getBrand()==null) {
				this.status=false;
				throw new InvalidBrandException("Invalid Brand Name");
			}
			if(obj.getPrice()<500) {
				this.status=false;
				throw new InvalidPriceException("Invalid Price");
			}
			if(obj.getQuantity()==null) {
				this.status=false;
				throw new InvalidQuantityException("Invalid Quantity");
				}
			if(obj.getFragnance().length()<2 && obj.getFragnance()==null) {
				this.status=false;
				throw new InvalidFragnanceException("Invalid Frahnance");
			}
		}
		catch (InvalidBrandException e) {
			e.printStackTrace();
		}
		catch (InvalidPriceException e) {
			e.printStackTrace();
		}
		catch (InvalidQuantityException e) {
			e.printStackTrace();
		}
		catch (InvalidFragnanceException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		if(status) {
			per.SavePerfumeDto(obj);
		}
	}
	@Override
	public void display() {
		per.display();
		
	}
	@Override
	public void remove(PerfumeDto obj) {
		per.remove(obj);
		
	}

}
