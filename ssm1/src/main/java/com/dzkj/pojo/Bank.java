package com.dzkj.pojo;

public class Bank {
private int b_id;
private String b_name;
private int b_money;
public int getB_id() {
	return b_id;
}
public void setB_id(int b_id) {
	this.b_id = b_id;
}
public String getB_name() {
	return b_name;
}
public void setB_name(String b_name) {
	this.b_name = b_name;
}
public int getB_money() {
	return b_money;
}
public void setB_money(int b_money) {
	this.b_money = b_money;
}
@Override
public String toString() {
	return "Bank [b_id=" + b_id + ", b_name=" + b_name + ", b_money=" + b_money + "]";
}

}
