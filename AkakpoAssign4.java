/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.akakpoassign4;

import java.util.Scanner;

/**
 *
 * @author Princess Akakpo
 */
public class AkakpoAssign4 
{

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello Welcome to Princess's ball simulator");
        
        System.out.println("Please enter the angle in degree: ");
        double angle=scanner.nextDouble();
        
        System.out.println("Please enter the velocity in meter/seconds: ");
        double velocity=scanner.nextDouble();
        
        System.out.println("Please enter the height in meters: ");
        double height=scanner.nextDouble();
        
        System.out.println("Please enter the time interval in seconds: ");
        double timeInterval=scanner.nextDouble();
        
        Ball ball = new Ball();
        ball.initilaize(angle, velocity, height);

        while (ball.getVDist() > 0) 
        {
            ball.update(timeInterval);
           // System.out.printf("Ball changed: hdist %.2f vdist %.2f \n",
                    //ball.getHDist(),ball.getVDist() );
        }
        System.out.println("\n Distance traveled :"+ball.getHDist()+"meters");
        
    }
}
