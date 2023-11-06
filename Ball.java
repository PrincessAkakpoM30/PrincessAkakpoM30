/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.akakpoassign4;

import java.util.Scanner;

/**
 *
 * @author Princess Akakpo
 */
public class Ball
{
    //double angle, double velocity, double height(itis int meters per second)
    private double hDist;
    private double vDist;
    private double hSpeed;
    private double vSpeed;
    
    public void initilaize(double angle, double velocity,double height){
        hDist=0;
        vDist= height;
        hSpeed=velocity*Math.cos(Math.toRadians(angle));
        vSpeed=velocity*Math.sin(Math.toRadians(angle));
    }
    public void update(double time){
        hDist+=hSpeed*time;
        vSpeed-=9.8*time;
        vDist+= (vSpeed + (vSpeed +9.8*time))/2*time;//this is the calculation
        //vDist is old VSpeed and(+) new vSpeed multiple by time
        //and the adding the it to vDist.
    }
    
  //input outout, getters and setters.   
    public double getHDist(){
            return hDist;
    }
    public double getVDist(){
        return vDist;
       
    }
    
    
}
