/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author Kunal Sharma
 */
public class Toyota extends Car{
     //int resaleValue;
     Toyota(String name,int price){
        this.model=name;
        this.price=price;
        resaleValue=this.price*40/100;
     }
}
