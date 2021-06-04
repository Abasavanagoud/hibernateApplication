package com.jpaidgen.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
@Data
@Entity
@Table(name = "bill_man_info")
//@SequenceGenerator(name = "my_seq" ,sequenceName = "bill_no_seq",allocationSize = 1,initialValue = 25)
@TableGenerator(name = "my_table_unique_values",table = "unique_val_table", pkColumnName = "pkkey",valueColumnName = "key_value",pkColumnValue = "bill-no")
public class BillManagement implements Serializable {
	@Id
	@Column(name = "bill_no")	
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "my_table_unique_values")
	private int billNo;
	@Column(name = "customer_nm")
	private String customerName;
	@Column(name = "bill_amount")
	private double billAmount;
}
