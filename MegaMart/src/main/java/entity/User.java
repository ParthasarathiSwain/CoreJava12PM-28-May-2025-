package entity;

import lombok.Data;

@Data
public class User {
	private int uId;
	private String  uName;
	private String  uEmail;
	private String  uPass;
	private String  uAdd;
	private String  uPhone;
	private String  uImg;
	private String  createdDate;
	private String  status;
	private String role;
}
