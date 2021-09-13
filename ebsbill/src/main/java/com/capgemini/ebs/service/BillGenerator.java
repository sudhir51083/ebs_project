package com.capgemini.ebs.service;

import java.awt.Color;
import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.entity.Bill;
import com.capgemini.ebs.repository.BillRepositoty;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class BillGenerator {
	
	@Autowired
	BillRepositoty billRepositoty;
	@Autowired
	private BillService billService;
	
	private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(6);
         
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
        
        cell.setPhrase(new Phrase("Bill Number", font));
        table.addCell(cell);
        
        cell.setPhrase(new Phrase("Consumer Number", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Consumer Name", font));
        table.addCell(cell);
        
        cell.setPhrase(new Phrase("Bill Amount", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Bill Date", font));
        table.addCell(cell);
        
        cell.setPhrase(new Phrase("Units", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Address", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Mobile Number", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Email", font));
        table.addCell(cell);       
    }
     
    private void writeBillData(PdfPTable table, long billNumber) {
    	//Optional<Bill> bill = billService.getBillByBillNumber(billNumber);
    	//System.out.println(bill.get().getConsumerNumber());
    	//long billNumber1 = bill.get().getBillNumber();
    	//System.out.println(bill.get().getBillAmount());
        //for (User user : listUsers) {
            table.addCell(String.valueOf(billNumber));
            table.addCell("123456789101");
            table.addCell("Sudhir Khobragade");
            table.addCell("306.00");
            table.addCell("01 Sept 2021");
            table.addCell("104");
            table.addCell("Mohali Chandraour");
            table.addCell("9021494615");
            table.addCell("sudhir51083@gmail.com");
        //}
    }
     
    public void export(HttpServletResponse response, long billNumber) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
         
        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(14);
        font.setColor(Color.BLUE);
         
        Paragraph paragraph = new Paragraph("E-Bill Of Aug2021", font);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
         
        document.add(paragraph);
         
        PdfPTable table = new PdfPTable(9);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 1.5f, 1.5f,1.5f, 1.5f, 1.5f});
        table.setSpacingBefore(10);
         
        writeTableHeader(table);
        writeBillData(table, billNumber);
         
        document.add(table);
         
        document.close();
         
    }
}
