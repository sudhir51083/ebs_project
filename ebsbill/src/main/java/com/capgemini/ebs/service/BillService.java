package com.capgemini.ebs.service;

import org.springframework.core.io.Resource;

public interface BillService {
	Resource downloadBill(String fileName);
}
