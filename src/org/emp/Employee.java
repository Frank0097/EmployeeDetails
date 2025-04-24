package org.emp;

public class Employee 
{
	public void empId(int id)
	{
		System.out.println("enter id:" +id);
	}

	public static void main(String[] args) {
	

		Employee em=new Employee();
		em.empId(1);
		em.empId(2);
		em.empId(3);
		em.empId(4);
		em.empId(5);
		em.empId(6);
		
	}

}
