package model;

public class Account {
private long accNo;
private String name;
private String mobNo;
private String addharNo;
private String gender;
private byte age;
private double balance=1000;
public long getAccNo() {
	return accNo;
}
public void setAccNo(long accNo) {
	this.accNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobNo() {
	return mobNo;
}
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
public String getAddharNo() {
	return addharNo;
}
public void setAddharNo(String addharNo) {
	this.addharNo = addharNo;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public byte getAge() {
	return age;
}
public void setAge(byte age) {
	this.age = age;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
