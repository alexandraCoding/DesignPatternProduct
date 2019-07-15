/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternproduct;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Product implements Subject {
    
    
    private ArrayList<Newspapper>allNewspapper;
     private ArrayList<Observer>observers;
    
    public Product()
    {
    allNewspapper=new ArrayList();
    observers = new ArrayList();
    
    }
    public void addNewspapper(Newspapper n){
    allNewspapper.add(n);
    Notify();
    
    }
    public ArrayList<Newspapper> getState(){
   return allNewspapper; }
    
    public void Attach(Observer o){
    observers.add(o);}
 
    
    public void Dettach(Observer o){
    observers.remove(o);}
    
    public void Notify(){
        for (int i=0; i< observers.size(); i++){
         observers.get(i).update(this);}
    }
}    








