package com.capgemini.ebs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "energy_bill")
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name = "bill_number")
	private long billNumber;
	@Column(name = "bill_reference_id")
	private String billReferenceRd;
	@Column(name = "consumer_number")
	private long consumerNumber;
	@Column(name = "reading_id")
	private String readingId;
	@Column(name = "units_consumed")
	private String unitsConsumed;
	@Column(name = "bill_date")
	private String billDate;
	@Column(name = "bill_amount")
	private String billAmount;
	@Column(name = "due_date")
	private String dueDate;
	@Column(name = "bill_amount_dpc")
	private String billAmountDpc;
	@Column(name = "total_bill_amount")
	private String totalBillAmount;
	@Column(name = "paid_amount")
	private String paidAmount;
	@Column(name = "balance_amount")
	private String balanceAmount;
	@Column(name = "payment_mode")
	private String paymentMode;
	@Column(name = "bill_status")
	private String billStatus;
	@Column(name = "created_on")
	private String createdOn;
	public int length;

	public long getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(long billNumber) {
		this.billNumber = billNumber;
	}
	public String getBillReferenceRd() {
		return billReferenceRd;
	}
	public void setBillReferenceRd(String billReferenceRd) {
		this.billReferenceRd = billReferenceRd;
	}
	
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public String getReadingId() {
		return readingId;
	}
	public void setReadingId(String readingId) {
		this.readingId = readingId;
	}
	public String getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(String unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	/*
	 * public Date getBillDate() { return billDate; } public void setBillDate(Date
	 * billDate) { this.billDate = billDate; }
	 */
	public String getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	/*
	 * public Date getDueDate() { return dueDate; } public void setDueDate(Date
	 * dueDate) { this.dueDate = dueDate; }
	 */
	public String getBillAmountDpc() {
		return billAmountDpc;
	}
	public void setBillAmountDpc(String billAmountDpc) {
		this.billAmountDpc = billAmountDpc;
	}
	public String getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(String totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public String getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	/*
	 * public Date getCreatedOn() { return createdOn; } public void
	 * setCreatedOn(Date createdOn) { this.createdOn = createdOn; }
	 */
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	
	
}
