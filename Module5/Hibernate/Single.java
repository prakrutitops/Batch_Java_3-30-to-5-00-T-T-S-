package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Single {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter id:");
		p.setId(sc.nextInt());
		Person per = new Dao().getSingle(p);
	System.out.println("ID: "+per.getId()+"\tName: "+per.getName()+"\tPassword: "+per.getSurname());
		
		
	}
	
}
