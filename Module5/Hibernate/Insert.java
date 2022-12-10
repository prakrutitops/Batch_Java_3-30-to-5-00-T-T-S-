package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Insert 
{
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = sc.next();

		
		System.out.println("Enter your Surname");
		String surname = sc.next();
	
		Person p =new Person();
		p.setName(name);
		p.setSurname(surname);
		
		new Dao().InsertData(p);
	}
}
