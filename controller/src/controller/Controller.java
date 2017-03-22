/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kunal Sharma
 */
public class Controller implements variables{
    
    static int i=0;
    public static void main(String[] args)throws IOException {
        
        Customer[] add_name = new Customer[10];
     //   Customer[] add_id=new Customer[10];
		 ArrayList<Customer> customer_list = new ArrayList<Customer>();
                 int store_id[]= new int[10];
		 int random_id[] = new int[6];
           //      	 ArrayList<Customer> customer_list1 = new ArrayList<Customer>();
        System.out.println("Welcome !");
        	String Username;
	    String Password;
	    Password = "sharma";
	    Username = "kunal";
	    Scanner input1 = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    String username = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    String password = input2.next();
	    if (username.equals(Username) && password.equals(Password)) {

	        System.out.println("Access Granted! Welcome!");
	    }
	    else if (username.equals(Username)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(Password)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!");
	       
            } 
           
	    try {
	        Thread.sleep(2000);
	    } catch(InterruptedException ex) {
	        Thread.currentThread().interrupt();
	    }
            
            
	    for(int clear = 0; clear < 1000; clear++) {
		    System.out.println(" ") ;
	    }
            while(true){
	    System.out.println("Enter :   ");
	    System.out.println(" 1   for Add New Customer");
	    System.out.println(" 2   for Add new Car to an existing Customer");
	    System.out.println(" 3   for List all Customers with their cars sorted by name");
	    System.out.println(" 4   for List individual Customer based on ID");
	    System.out.println(" 5   for Generate prizes for customer");
            System.out.println(" 0   for exit:");
	    
	    Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();
	   int flag=0;
	    switch(choice){
                case zero:
                     
                    flag=1;
                    break;
                    
                case addCustomer:
                    add_name[i]=new Customer();
                 // add_id[i]=new Customer1();
                   customer_list.add(add_name[i]);
                   //customer_list1.add(add_id[i]);
                   i++;
                    break;
                case addNewCar:
                    	System.out.println("enter  id of customer:");
			
				int pass_id = sc.nextInt();
                                pass_id++;
			for(Customer counter: customer_list)
			{
				if(counter.id==pass_id)
				{
					int index = customer_list.indexOf(counter);// it returns the value of index;
					add_name[index].buycars();
				}
				
			}
                    
                    break;
                case listAllCustomers:
                    for(Customer counter: customer_list)
				{
					
					
					System.out.println(counter.name);
					System.out.println(counter.id);
						
					for(Car counter1: counter.car)
					{
						
						System.out.println(counter1.price);
						System.out.println(counter1.model);
                                                System.out.println(counter1.resaleValue);
					
					}
					
				}
				
                    break;
                case listIndivisualCustomer:
                    	System.out.println("enter id of customer");
				int id_recog= sc.nextInt();
				
				for(Customer counter: customer_list)
				{
				
					if(counter.id ==id_recog)
					{
						System.out.println(counter.name);
						System.out.println(counter.id);
						
						
						
					}
					
					
				}
				
                    break;
                case generatePrize:
                    int k=0;
				for(Customer counter:customer_list)
				{
					store_id[k] = counter.id;
					k++;
				}
				
				Random rand = new Random();
				k=0;
				for(int i=0;i<6;i++)
				{
					random_id[k] = rand.nextInt();
					k++;
				}
				
				System.out.println("enter 3 numbers: ");
			int first_num  = sc.nextInt();
				int second_num = sc.nextInt();
				int third_num = sc.nextInt();
				
				for(int i=0;i<6;i++)
				{
					if(random_id[i]==first_num || random_id[i]==second_num || random_id[i]==third_num)
					{
						System.out.println("customer with id is eligible: "+random_id[i] );
						
					}
						
				}
                    break;
               
            }
            if(flag==1)
			{
				System.out.println("exiting:");
				break;
			}
            } 	
    }
}

