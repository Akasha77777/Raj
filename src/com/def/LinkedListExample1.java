package com.def;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.LinkedList;
import java.util.Collection;


class Employee
{
	int id;
	String name;
	Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}
public class LinkedListExample1 {
public static void main(String args[])
{
	LinkedList<Employee> li=new LinkedList<Employee>();
	li.add(new Employee(5,"Akasha"));
	li.add(new Employee(6,"AjayKumar"));
	li.add(new Employee(7,"Anitha"));
	for(int i=0;i<li.size();i++)
	{
		Object ob=li.get(i);
		Employee ee=(Employee)ob;
		if(ee.name.startsWith("a"))
		{
			System.out.println("Employee id:"+ee.id);
			System.out.println("Employee Name"+ee.name);
		}
		}
	}
}

