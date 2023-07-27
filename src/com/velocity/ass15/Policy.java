package com.velocity.ass15;

import java.util.Scanner;

// Design the Policy class that contain policy id, policy name, policy type, premium amount etc
// Design the below method into Policy class and which return the policy object
//Input should be taken from user and print that data into getPolicyDetails () method.
public class Policy {
 
	int id ;
	String Name ;
	String Type ;
	int premium ;
	int amount;
	
	public static Policy getPolicyDetails() {	
	return new Policy();	
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Policy policy = getPolicyDetails();
     
	  System.out.println("Enter Policy ID :");
	  policy.id=sc.nextInt();
	  System.out.println("Id : " +policy.id +"\n");
	  
	  System.out.println("Enter Policy Name here :");
	  policy.Name=sc.next();
	  System.out.println( "Name : "+policy.Name +"\n");
	  
	  System.out.println("Enter Policy Type here :");
	  policy.Type=sc.next();
	  System.out.println( "Type : "  +policy.Type +"\n");
	  
	  System.out.println("Enter Premium Amount :");
	  policy.premium=sc.nextInt();
	  System.out.println( "premium : " +policy.premium +" Rs");

	  System.out.println("Thank you for selecting this policy");


	  

<<<<<<< HEAD
	  System.out.println("Enter bank name :");
	  System.out.println("Enter bank work :");
	  System.out.println("Enter bank adress :");
=======
>>>>>>> master
	
	}
	
}
