package com.beautyparlour.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beautyparlour.entity.ParlourEntity;

@Repository
@Transactional
public class ParlourRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void save(ParlourEntity parlourEntity) {
		hibernateTemplate.save(parlourEntity);
	}

	

}
