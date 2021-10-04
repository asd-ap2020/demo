package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private BillionairesRepository billionairesRepository;
	
	@GetMapping("/get")
	public List<Billionaires> getBillionaires() {
		List<Billionaires> list = new ArrayList<>();
		
		list = billionairesRepository.findAll();
//		Billionaires b1 = new Billionaires();
//		b1.setFirstName("Test");
//		
//		list.add(b1 );
		return list;
	}
	
	@GetMapping("/test")
	public String saveBillionaire() {
		List<Billionaires> list = new ArrayList<>();
		
		Billionaires b1 = new Billionaires();
		b1.setId(1);
		b1.setFirstName("Test1 FirstName");
		b1.setLastName("Test1 Last NAme");
		
		Carrers[] carrs = new Carrers[2];
		carrs[0] = Carrers.BACHELORS;
		carrs[1] = Carrers.MASTERS;
		
		b1.setCarrers(carrs);
		
		
		Billionaires b2 = new Billionaires();
		b2.setId(2);
		b2.setFirstName("Test1 FirstName");
		b2.setLastName("Test1 Last NAme");
		
		carrs = new Carrers[3];
		carrs[0] = Carrers.BACHELORS;
		carrs[1] = Carrers.MASTERS;
		carrs[2] = Carrers.PG;
		
		b2.setCarrers(carrs);
		list.add(b1);
		list.add(b2);
		billionairesRepository.saveAll(list);
		return "SAVED";
	}
	
}
