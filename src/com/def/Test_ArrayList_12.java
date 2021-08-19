package com.def;
import java.util.ArrayList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
//import java.util.Collection;
class Test_ArrayList_12
{
	public static void main(String[] args) 
	{
		ArrayList<Comparable> Al=new ArrayList<Comparable>();
		Al.add(100);
		Al.add("JAVA");
		Al.add('a');
		Al.add(null);
		Al.add(100);
		
		for(int i=0;i<Al.size();i++){
			Object ob=Al.get(0);
			System.out.println(ob);
		}
		System.out.println("Hello World!");
		int x=Al.size();
		System.out.println("Size"+x);
		
		//Collection Sort
		boolean b=Al.contains('a');
		System.out.println(b);
		
		Al.remove(0);
		System.out.println(Al);
		System.out.println(Al.size());
		
		//Coolection.Sort
		//Collection.sort();
		//ArrayList Add All
		ArrayList<Comparable> al2=new ArrayList<Comparable>();
		al2.addAll(Al);
		System.out.println(Al);
		
		boolean b1=Al.contains(20);
		System.out.println(b1);
		
		//i want add middle element
		Al.add(1,"pyton");
		System.out.println(Al);
		boolean b9=Al.removeAll(al2);
		System.out.println(b9);
		System.out.println(al2);
		
		LinkedList li=new LinkedList();
		li.add(45);
		li.add(60.0);
		li.add("Akasha");
		li.add("Nimma Avvan");
		li.add(45);
		li.add(60.0);
		li.add("Akasha");
		li.add("Nimma Avvan");
		System.out.println(li);
		Object ob=li.getLast();
		System.out.println(ob); 
		Object ob2=li.get(0);
		System.out.println(ob2);
		
		for(int i=0;i<li.size();i++){
			Object ob4=li.get(0);
			System.out.println(ob4);
		}
		boolean b2=li.contains(50);
		System.out.println(b2);
		
		
		
		
		li.add("Ajay");
		li.add("Ajay");
		li.add("Ajay");
		
		System.out.println(li);
		/*for(int i=0;i<li1.size();i++)
		{
			Object ob1=li.get(i);
			//Employee1 ee=(Employee1)ob1;
			/*if(ee.name.startsWith("A"))
			{
				System.out.println("Employee id:"+ee.id);
				System.out.println("Employee Name"+ee.name);
			}*/
		
		PriorityQueue q=new PriorityQueue();
		q.add(45);
		q.add(750);
		q.add(78);
		q.add(98);
		q.add(-1);
		//q.add(null);
		
		boolean bb=q.containsAll(q);
		System.out.println(bb);
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q);
		//Object on=q.poll();
		/*while(on!=null)
		{
			System.out.println(on);
			ob=q.poll();
		}
		System.out.println(q.size());*/
	}
}

class Employee1
{
	int id;
	String name;
	Employee1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}
