/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter_Design_Pattren;


public class WallSocketimp implements WallSocket{
    @Override
    public Volt getVolts() {
        return new Volt(240);
    }
}
