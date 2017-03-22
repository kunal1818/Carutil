/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Kunal Sharma
 */
public class Hyundai extends Car {
    //int resaleValue;
    Hyundai(String name, int price)
	{
		this.model = name; 
		this.price = price;
		resaleValue = this.price*80/100;
	}

    
}
