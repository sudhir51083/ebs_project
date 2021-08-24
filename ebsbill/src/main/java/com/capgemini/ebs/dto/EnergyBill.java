package com.capgemini.ebs.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EnergyBill {
	@Id
	@Column
	private long billNumber;

}
