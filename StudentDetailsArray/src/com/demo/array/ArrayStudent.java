package com.demo.array;

import com.demo.beans.Student;
public class ArrayStudent {

	Node[] head;
	
	 public ArrayStudent(int size) {
		 head=new Node[size];
		 for(int i=0;i<head.length;i++) {
			 head[i]=null;
		 }
	 }
	 
	class Node{
		Student data;
		Node next;
		
		public Node(Student ob) {
			data=ob;
			next=null;
		}
	}
	
	public void saveStudent(Student ob, int pos) {		//add new student
		Node newNode =new Node(ob);
		if(head[pos]==null) {
			head[pos]=newNode;
			
		}else
		{
			newNode.next=head[pos];
			head[pos]=newNode;
		}
		System.out.println("Student detail added");
	}
		
	public void showAll() {								//print all student detail
		System.out.println("Student Details:");
		for(int i=0;i<head.length;i++) {
			for(Node temp=head[i];temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
		}
		System.out.println("------------------------------------------------------");
	}

	public void student98MarkList(int[] arr) {			//print student having marks equal and above 98
		for(int i=0;i<head.length;i++) {
			for(Node temp=head[i];temp!=null;temp=temp.next) {
				if(temp.data.getMarks()>=98)
				System.out.println(temp.data);
			}
		}
	}

	public void student60_70MarkList(int[] arr) {		//print student having marks between 60-70
		for(int i=0;i<head.length;i++) {
			for(Node temp=head[i];temp!=null;temp=temp.next) {
				if(temp.data.getMarks()>=60 && temp.data.getMarks()<=70)
				System.out.println(temp.data);
			}
		}
	}
}
