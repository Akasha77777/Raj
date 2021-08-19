package com.def;
class StudentList
{
	int id;
	String stu_name;
	double marks;
	StudentList(int a,String b,double c)
	{
		id=a;
		stu_name=b;
		marks=c;
	}
}
   class MainStudent
   {
   
	public static void main(String[] args) 
	{
         StudentList[] stu=new StudentList[15];
		 stu[0]=new StudentList(1,"Ajay",50.0);
		 stu[2]=new StudentList(2,"Akasha",60.0);
		 stu[6]=new StudentList(3,"Ankith",70.0);
		 
		int count=0;
        /* if(stu[i].stu_name=="Ajay" && stu[i].marks==50.0)
		{
			 System.out.println(stu[0].marks);
		System.out.println("Hello World!");
		 }
		 else{
			 System.out.println(stu[1].marks);
		 }*/
		 for(int i=0;i<=stu.length;i++)
		{
			 if(stu[i]!=null)
			{
				 count++;
			}
		}
	        System.out.println(count);
	}
   }
	

