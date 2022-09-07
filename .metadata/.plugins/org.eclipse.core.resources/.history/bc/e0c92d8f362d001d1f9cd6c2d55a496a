package com.xworkz.pharmacy;

import com.xworkz.pharmacy.dao.PharmacyDAO;
import com.xworkz.pharmacy.dao.pharmacyDAOImpl;
import com.xworkz.pharmacy.dto.MedicineDTO;
import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.DataIsInvalidException;
import com.xworkz.pharmacy.service.PharmacyService;
import com.xworkz.pharmacy.service.PharmacyServiceImpl;

public class PharmacyRunner {

	public static void main(String[] args) throws DataIsInvalidException {
		MedicineDTO medicineDTO=new MedicineDTO("Dolo", "2027", 100, 500.00);
		PharmacyDTO dto1=new PharmacyDTO("med+", "Rajajinagar", 666, true, medicineDTO);
		PharmacyDTO dto2=new PharmacyDTO("med1+", "aaaaa", 777, true, medicineDTO);
		PharmacyDTO dto3=new PharmacyDTO("med2+", "bbbb", 888, true, medicineDTO);
		PharmacyDAO dao=new pharmacyDAOImpl();
		PharmacyService service=new PharmacyServiceImpl(dao);
		boolean value;
		
		/*dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);*/
		
		try {
			value=service.validateAndSave(dto1);
			System.out.println(value);
		} catch (DataIsInvalidException e) {
			
		}
		value=service.validateAndSave(dto3);
		System.out.println(value);

	}

}
