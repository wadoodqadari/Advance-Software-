/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Design_Pattren;


public interface Computer {

    public abstract String Ram();

    public abstract String HDD();

    public abstract String CPU();

    boolean ISgraphicsenabled();

    boolean IsBluetoothenabled();
}
