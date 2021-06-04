package com.idgenarators.entities;

import java.io.Serializable;

import lombok.Data;
@Data
public class Outlet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int outletNo;
	private String outletName;
	private String outletDescription;
	private String location;
	private String contactNo;
}
