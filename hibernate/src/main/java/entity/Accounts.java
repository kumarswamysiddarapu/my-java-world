package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {
	@Id
	private Integer id;
	private  String name;
	Integer balance;
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer d) {
		this.balance = d;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
