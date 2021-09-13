package com.capgemini.ebs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.config.EBSConstants;
import com.capgemini.ebs.entity.Consumer;
import com.capgemini.ebs.repository.ConnectionRepositoty;
import com.capgemini.ebs.service.ConnectionService;
import com.capgemini.ebs.utils.EBSUtility;

@Service
public class ConnectionServiceImpl implements ConnectionService{
	@Autowired
	private ConnectionRepositoty connectionRepositoty;
	@Override
	public void addConnection(Consumer consumer) {
		consumer.setConsumerNumber(Long.valueOf(EBSUtility.getConsumerNumber()));
		consumer.setCreatedOn(EBSUtility.getTodaysStringDate());
		consumer.setCreatedBy("ADMIN");
		consumer.setStatus(EBSConstants.NEWStatus);
		connectionRepositoty.saveAndFlush(consumer);
	}

	@Override
	public List<Consumer> getUsers() {
		return connectionRepositoty.findAll();
	}

}
