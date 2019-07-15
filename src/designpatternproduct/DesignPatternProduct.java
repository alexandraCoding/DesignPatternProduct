/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternproduct;

/**
 *
 * @author alexa
 */
public class DesignPatternProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Product product= new Product() ;
        Customer Max= new Customer("Max");
        
        Customer Tom= new Customer("Tom");
        Newspapper n= new Newspapper("Max","Glasgow","You ve got a new newpapper edition");
        
        product.Attach(Max);
         product.Attach(Tom);
         
         product.addNewspapper(n);
        
    }
    
}
