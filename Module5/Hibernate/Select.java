package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Person;

public class Select 
{
	public static void main(String[] args) {
		
		List<Person> list = new Dao().viewRecords();
		System.out.println("ID\t|\tName\t|\tSurname");
		int i=0;
		for (Person person : list) 
		{
			i++;
			System.out.println(person.getId()+"\t|\t"+person.getName()+"\t|\t"+person.getSurname());
		}
		
		
	}
}
