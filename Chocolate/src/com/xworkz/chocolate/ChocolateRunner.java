package com.xworkz.chocolate;

import com.xworkz.chocolate.dao.ChocolateDAO;
import com.xworkz.chocolate.dao.ChocolateDAOImplementation;
import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.dto.DairymilkDTO;
import com.xworkz.chocolate.dto.KitkatDTO;
import com.xworkz.chocolate.exception.DataIsInvalidException;
import com.xworkz.chocolate.service.ChocolateService;
import com.xworkz.chocolate.service.ChocolateServiceImplementation;



public class ChocolateRunner {

	public static void main(String[] args) {
		
		KitkatDTO kitkatDTO = new KitkatDTO("dgfj", 66, "fhgfj", 78909l);
		DairymilkDTO dairymilkDTO = new DairymilkDTO("hgy", 78, "fghfj", 77, kitkatDTO);
		ChocolateDTO dto1 = new ChocolateDTO("milk free", 150, "almond", "RA", 155l, dairymilkDTO );
		ChocolateDTO dto2 = new ChocolateDTO("milk free1", 250, "almond1", "RA1", 1556678l, dairymilkDTO );
		ChocolateDTO dto3 = new ChocolateDTO("milk free2", 350, "almond2", "RA2", 1556677l, dairymilkDTO );
		ChocolateDTO dto4 = new ChocolateDTO("milk free3", 450, "almond3", "RA3", 1556677l, dairymilkDTO );
		ChocolateDTO dto5 = new ChocolateDTO("milk free4", 550, "almond4", "RA4", 1556677l, dairymilkDTO );
		
		
		ChocolateDAO dao=new ChocolateDAOImplementation();
		ChocolateService service = new ChocolateServiceImplementation(dao);
		boolean value;
		
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.deleteChocolateByName("aaa");
		dao.findChocolateByPrice(9887756);
		dao.findChocolateByName("ddd");
		dao.findDuplicate(dto4);
		dao.findChocolateByType("yyy");
		
		try {
			value=service.validateAndSave(dto1);
			System.out.println(value);
		} catch (DataIsInvalidException e) {
			
		}

	}

}
