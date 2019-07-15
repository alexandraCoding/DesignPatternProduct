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
public class Customer implements Observer {

    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void ckeckNewspapper(ArrayList<Newspapper> n) {
        for (int i = 0; i < n.size(); i++) {
            if (name.compareTo(n.get(i).receiverName) == 0) 
                System.out.println(name +":"+ n.get(i).content);
        
    

    
        
        
    }}
    
    public void update(Object obj) {
        if (obj instanceof Product) {
            Product po = (Product) obj;
            ckeckNewspapper(po.getState());
        }
    }
}
