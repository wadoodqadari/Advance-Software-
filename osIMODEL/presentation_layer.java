/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osIMODEL;


public class presentation_layer extends abstruct_layer{

   public presentation_layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        System.out.println("Layer   :: presentation_layer "+message);  
    }
    
}
