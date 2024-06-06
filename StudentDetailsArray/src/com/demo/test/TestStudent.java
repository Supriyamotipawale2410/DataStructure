//Create a array to store student information, and find all students who secure 98 marks
//find all students who secure marks >60 and < 70

package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		StudentService sservice= new StudentServiceImpl();
		
		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.Add Student detail\n2.Diaplay all students\n3.Student having marks 98 above");
			System.out.println("4.Students who secure marks >60 and <70\n5.Exit\nEnter choice");
			choice=sc.nextInt();
			switch(choice) {
			
			//Add Student detail
			case 1:
				int pos =0;
				sservice.addstudent(arr,pos);
				break;
				
			//Diaplay all students	
			case 2:
				sservice.displayAllStudent();
				break;
			
			//Student having marks 98 above	
			case 3:
				sservice.student98Mark(arr);
				break;
			
			//Students who secure marks >60 and <70	
			case 4:
				sservice.student60_70Mark(arr);
				break;
			
			//Exit	
			case 5:
				System.out.println("Exit.............");
				break;
			//default case	
			default:
				System.out.println("Invalid choice...");
			}
		}while(choice!=5);
	}

}
