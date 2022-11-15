import java.util.*;
import java.math.*;

public class Triangle {
    public String name;
    private double[] sides = new double[3];
    private double[] angles = new double[3];
    private double base = 0;
    private double height;
    
    //Getters Setters
    public double getSide(int which){
        return sides[which];
    }
    public double getAngle(int which){
        return angles[which];
    }
    public void setSide(int which, double value){
        sides[which] = value;
    }
    public void setAngle(int which, double value){
        angles[which] = value;
    }

    public double findArea(double base, double height){
        return base*height/2;
    }
    public double findParam(double[] sides){
        return sides[0]+sides[1]+sides[2];
    }
    public double FindSide(int side){

        int wS = side;
        //sin law
        if(angles[side] != 0){
            for(int i = 0; i<2; i++){
                wS = (wS+1)>3?3-wS:wS;
                if(angles[wS] !=0 && sides[wS] !=0){
                    return angles[side] * sides[wS]/angles[wS];
                }
            }
        }
        //cosine Law
        int tempA = (side+1)>3?3-side:side;
        int tempB = (side+2)>3?3-side:side;
        if(angles[side] != 0 && sides[tempA] !=0 && sides[tempB] !=0){ //checks to see if the other two sides are not 0\
            return Math.sqrt(Math.pow(sides[tempA], 2) + Math.pow(sides[tempA],2) - 2*sides[tempA]*sides[tempB]*Math.cos(angles[side]));
        }
        
        return 0;
    }
}
