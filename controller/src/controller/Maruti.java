/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Kunal Sharma
 */
public class Maruti extends Car{
    
    //int resaleValue;
    Maruti(String name,int price)
    {
        this.model=name;
        this.price=price;
        resaleValue=this.price*60/100;
    }
    
}
