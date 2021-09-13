package com.capgemini.ebs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.core.io.Resource;

import com.capgemini.ebs.entity.Bill;

public interface BillService {
	Resource downloadBill(String fileName);

	List<Bill> getBillHistory();

	Optional<Bill> getBillById(long consumerId);

	Optional<Bill> getBillByBillNumber(long billNumber);
}
