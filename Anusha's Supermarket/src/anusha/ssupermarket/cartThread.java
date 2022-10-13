/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anusha.ssupermarket;

/**
 *
 * @author faraz
 */
public class cartThread extends Thread {
    public int[] amount = {0,0,0,0,0,0,0,0,0};
    public String[] item = {"","","","","","","","",""};
    public int[] price = {0,0,0,0,0,0,0,0,0};
    public cartThread(){
        
    }
    @Override
    public void run(){
        
    }
    
    public void additem(int Amount,String Item,int Price,int count){
        
        this.amount[count]=Amount;
        this.item[count]=Item;
        this.price[count]=Price;
        
    }
    public void clear(){
        for(int i=0;i<9;i++){
    amount[i]=0;
    item[i]="";    
    price[i]=0;
        }}
    
    
}
