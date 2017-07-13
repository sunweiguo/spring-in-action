package com.njupt.swg.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	@Size(min=3,max=10,message="{username.size}")
	private String name;
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="time")
	private	Date registerTime;
	@NotNull
	private double salary;
	public int getId() {
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
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", registerTime=" + registerTime + ", salary=" + salary + "]";
	}
}
