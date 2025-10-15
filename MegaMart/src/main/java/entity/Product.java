package entity;

import lombok.Data;

@Data
public class Product {
	private int pId;
	private String  pName;
	private String  pDesc;
	private String  pImg;
	private String  createdDate;
	private String  status;
	private int qty;
	private double price;
	private int catId;
	private int comId;
}
