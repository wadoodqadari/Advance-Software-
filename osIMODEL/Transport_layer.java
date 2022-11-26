/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osIMODEL;

public class Transport_layer extends abstruct_layer{
     public Transport_layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        
        System.out.println("Layer   :: Transport_layer "+message);  
    }
}
