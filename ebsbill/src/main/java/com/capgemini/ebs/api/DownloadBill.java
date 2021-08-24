
package com.capgemini.ebs.api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
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
	@Autowired
	BillService billService;

	@GetMapping("/{fileName}")
	public ResponseEntity downloadFileFromLocal(@PathVariable(name = "fileName", required = false) String fileName) {
		Resource resource = billService.downloadBill(fileName);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(EBSConstants.contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
	
	@GetMapping("/users/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=bill_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        //List<User> listUsers = service.listAll();
         
        BillGenerator exporter = new BillGenerator();
        exporter.export(response);
         
    }
}
