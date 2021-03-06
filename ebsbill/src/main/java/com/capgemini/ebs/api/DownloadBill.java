
package com.capgemini.ebs.api;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ebs.config.EBSConstants;
import com.capgemini.ebs.service.BillGenerator;
import com.capgemini.ebs.service.BillService;
import com.lowagie.text.DocumentException;

@RestController
@RequestMapping(value = "/ebsbill/download")
public class DownloadBill {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DownloadBill.class);
	
	@Autowired
	BillService billService;
	

	@GetMapping("/{fileName}")
	public ResponseEntity<Resource> downloadFileFromLocal(@PathVariable(name = "fileName", required = false) String fileName) {
		Resource resource = billService.downloadBill(fileName);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(EBSConstants.contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
	
	@GetMapping("/users/export/pdf")
    public void exportToPDF(HttpServletResponse response, long billNumber) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
        String fileName = "bill_" + currentDateTime + ".pdf"; 
        log.info("FILENAME : "+fileName);
        System.out.println("FILENAME : "+fileName);
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename="+fileName;
        		//+ "//bill_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        //List<User> listUsers = service.listAll();
         
        BillGenerator exporter = new BillGenerator();
        exporter.export(response, billNumber);
         
    }
	
	/*
	 * @GetMapping("/bill-history") public List<User> getBillHistory() {
	 * System.out.println("---------------"); return billService.getBillHistory(); }
	 * 
	 * @GetMapping("/consumer-bill/{consumerId}") public Optional<User>
	 * getBillById(@PathVariable int consumerId) {
	 * System.out.println("---------------"); return
	 * billService.getBillById(consumerId); }
	 */
}
