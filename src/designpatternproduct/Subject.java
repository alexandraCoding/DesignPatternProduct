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
public interface Subject {
    
    void Attach(Observer o);
    void Dettach(Observer o);
    void Notify();
    
    
    
}
