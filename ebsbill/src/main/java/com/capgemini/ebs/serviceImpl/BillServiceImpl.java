package com.capgemini.ebs.serviceImpl;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.config.EBSConstants;
import com.capgemini.ebs.entity.Bill;
import com.capgemini.ebs.repository.BillRepositoty;
import com.capgemini.ebs.service.BillService;
import com.capgemini.ebs.utils.EBSUtility;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepositoty billRepositoty;

	public Resource downloadBill(String fileName) {
		fileName = fileName == null ? "spk_rel.pdf" : fileName;
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

	@Override
	public List<Bill> getBillHistory() {
		List<Bill> billHistory = billRepositoty.findAll();
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    //List<Bill> localDates = billHistory.stream().map(date -> LocalDate.parse(date.getBillDate(), formatter)).collect(Collectors.toList());
	    //System.out.println("LOCAL DATES---"+localDates);
		
		
		/*for (Bill bill : billHistory) {
			String d1 = null, d2 = null;

			System.out.println("BILLDATE : " + bill.getBillDate());
			d1 = EBSUtility.getFormattedDate(bill.getBillDate());
			d2 = EBSUtility.getFormattedDate(bill.getDueDate());

			bill.setBillDate(d1);
			bill.setDueDate(d2);
			billHistory.add(bill);
		}*/

		/*
		 * for (int i = 0; i < billHistory.size(); i++) { Bill lValue =
		 * billHistory.get(i); // if(lValue.equals("")) // {
		 * lValue.setBillDate(EBSUtility.getFormattedDate(lValue.getBillDate()));
		 * lValue.setDueDate(EBSUtility.getFormattedDate(lValue.getBillDate()));
		 * //billHistory.remove(lValue.getBillDate());
		 * //billHistory.remove(lValue.getDueDate()); //i--; // }
		 * billHistory.add(lValue); }
		 */
		
		return billHistory;
	}

	@Override
	public Optional<Bill> getBillById(long consumerId) {
		return billRepositoty.findByConsumerNumber(consumerId);
	}

	public static void main(String[] args) throws ParseException {
		DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S", Locale.ENGLISH);
		DateFormat targetFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = originalFormat.parse("2021-09-01 12:12:12.0");
		String formattedDate = targetFormat.format(date);
		System.out.println(formattedDate);
	}
	
	public Optional<Bill> getBillByBillNumber(long billNumber) {
		System.out.println(billNumber);
		return billRepositoty.findById(billNumber);
	}
}
