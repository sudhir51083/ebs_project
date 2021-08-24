package com.capgemini.ebs.serviceImpl;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.config.EBSConstants;
import com.capgemini.ebs.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	public Resource downloadBill(String fileName) {
		fileName = fileName == null? "spk_rel.pdf": fileName;
		Path path = Paths.get(EBSConstants.fileBasePath + fileName);
		System.out.println("BILL FILENAME : " + fileName);
		Resource resource = null;
		try {
			resource = new UrlResource(path.toUri());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return resource;
	}

}
