package com.demo.service;

import java.util.Scanner;

import com.demo.array.ArrayStudent;
import com.demo.beans.Student;

public class StudentServiceImpl implements StudentService {

	private ArrayStudent arrstd;

	public StudentServiceImpl() {
		super();
		arrstd=new ArrayStudent(5);
	}

	@Override
	public void addstudent(int[] arr,int pos) {			//accept student details
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id");
		int id = sc.nextInt();
		System.out.println("Enter student name");
		String nm = sc.next();
		System.out.println("Enter marks");
		int mrk =sc.nextInt();
		Student ob = new Student(id,nm,mrk);
				
		arrstd.saveStudent(ob,pos);
		
	}

	@Override
	public void displayAllStudent() {
		arrstd.showAll();
		
	}

	@Override
	public void student98Mark(int[] arr) {
		arrstd.student98MarkList(arr);
		
	}

	@Override
	public void student60_70Mark(int[] arr) {
		arrstd.student60_70MarkList(arr);
		
	}
	
	
}
