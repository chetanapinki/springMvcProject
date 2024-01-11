package com.beautyparlour.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beautyparlour.beans.Parlour;
import com.beautyparlour.entity.ParlourEntity;
import com.beautyparlour.repository.ParlourRepository;

@Service
public class ParlourServiceImp implements ParlourService {
	private static Logger log = org.slf4j.LoggerFactory
			.getLogger(ParlourServiceImp.class.getSimpleName());

	@Autowired
	private ParlourRepository parlourRepository;

	@Override
	public void save(Parlour parlour) {
		ParlourEntity parlourEntity=new ParlourEntity();
		parlourEntity.setParlour_name(parlour.getParlour_name());
		parlourEntity.setLocation(parlour.getLocation());
		parlourEntity.setFees(parlour.getFees());
		
		parlourRepository.save(parlourEntity);
		log.info("Parlour save-", parlour);
	}

}
