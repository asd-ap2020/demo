package com.example.demo;

import javax.persistence.AttributeConverter;

public class CareerConverter implements AttributeConverter<Carrers[], String> {

	@Override
	public String convertToDatabaseColumn(Carrers[] carrers) {
		
		StringBuffer carrerStr = new StringBuffer();
		
		
		for(Carrers ca : carrers) {
			carrerStr.append(ca.getCarrer());
			carrerStr.append(",");
		}
		
		if(carrerStr.length()>0) {
			carrerStr.deleteCharAt(carrerStr.lastIndexOf(","));
		}		
		return carrerStr.toString();
	}

	@Override
	public Carrers[] convertToEntityAttribute(String dbData) {
		
		String[] carrersStr = dbData.split(",");
		Carrers[] carrers  = null;
		if(carrersStr.length>0) {
			
			carrers  = new Carrers[carrersStr.length];
			for (int i=0; i <carrersStr.length;i++) {
				carrers[i] = Carrers.valueOf(carrersStr[i]);
			}
			
		}
		return carrers ;
	}

}
