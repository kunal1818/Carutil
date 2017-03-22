/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kunal Sharma
 */
public class Customer {
     int id;
    String name;
    ArrayList<Car> car=new ArrayList<Car>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner st=new Scanner(System.in);
    String car_name;
    int car_price;
    
    Customer() throws IOException
    {
        System.out.println("enter name ");
                name=br.readLine();
                System.out.println("enter id ");
                id=st.nextInt();
        
               
    }
    void buycars() throws IOException//x is my id;
	{
		//Scanner scan = new Scanner(System.in);
		System.out.println("enter company");
		
		System.out.println("enter 1 for toyota");
		System.out.println("enter 2 for maruti");
		System.out.println("enter 3 for hyundai");
                System.out.println("enter any no to exit");
		
	int  ch = 	st.nextInt();
	
		switch(ch)
		{
		
		case 1:
			System.out.println("enter your car name");
			car_name  = br.readLine();
			System.out.println("enter car price: ");
			car_price = st.nextInt();
			Toyota obj1 = new Toyota(car_name,car_price);
			car.add(obj1);
			break;
			
		case 2:
			System.out.println("enter your car name");
			car_name  = br.readLine();
			System.out.println("enter car price: ");
			car_price = st.nextInt();
			Maruti obj2 = new Maruti(car_name,car_price);
		car.add(obj2);	
		break;
			
		case 3:
			System.out.println("enter your car name: ");
			car_name  = br.readLine();
			System.out.println("enter car price: ");
			car_price = st.nextInt();
			Hyundai obj3 = new Hyundai(car_name,car_price);
			car.add(obj3);
			break;
                //default:
                  //  return;
                    
                        
		}
		
		
		
	}
    private Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
