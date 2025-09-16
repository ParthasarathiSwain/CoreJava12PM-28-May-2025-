package entity;

public class Customer {
	private int custId;
	private String  custName;
	private String  custEmail;
	private String  custPass;
	private String  custAdd;
	private String  custGen;
	private String  custPhone;
	private String  custDob;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	public String getCustAdd() {
		return custAdd;
	}
	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}
	public String getCustGen() {
		return custGen;
	}
	public void setCustGen(String custGen) {
		this.custGen = custGen;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustDob() {
		return custDob;
	}
	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custPass="
				+ custPass + ", custAdd=" + custAdd + ", custGen=" + custGen + ", custPhone=" + custPhone + ", custDob="
				+ custDob + "]";
	}
	
	
}
