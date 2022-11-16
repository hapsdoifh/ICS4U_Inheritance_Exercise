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
        return sides[which-1];
    }
    public double getAngle(int which){
        return angles[which-1];
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
    public double findSide(int side){
        side--;
        int wS = side;
        //sin law
        if(angles[side] != 0){
            for(int i = 0; i<2; i++){
                wS = (wS+1)>2?2-wS:wS+1;
                if(angles[wS] !=0 && sides[wS] !=0){
                    return Math.sin(angles[side]) * sides[wS]/Math.sin(angles[wS]);
                }
            }
        }
        //cosine Law
        int tempA = (side+1)>3?3-side:side;
        int tempB = (side+2)>3?3-side:side;
        if(angles[side] != 0 && sides[tempA] !=0 && sides[tempB] !=0){ //checks to see if the other two sides are not 0\
            return Math.sqrt(Math.pow(sides[tempA], 2) + Math.pow(sides[tempA],2) - 2*sides[tempA]*sides[tempB]*Math.cos(angles[side]));
        }
        return -1;
    }

    public double findAngle(int angle){
        angle--;
        int wA = angle;
        //sin law
        if(sides[angle] != 0){
            for(int i = 0; i<2; i++){
                wA = (wA+1)>3?3-wA:wA;
                if(sides[wA] !=0 && angles[wA] !=0){
                    return Math.asin(sides[angle] * Math.sin(angles[wA])/sides[wA]);
                }
            }
        }
        //cosine Law
        int tempA = (angle+1)>3?3-angle:angle;
        int tempB = (angle+2)>3?3-angle:angle;
        if(sides[angle] != 0 && sides[tempA] !=0 && sides[tempB] !=0){ //checks to see if the other two sides are not 0\
            //return Math.sqrt(Math.pow(sides[tempA], 2) + Math.pow(sides[tempA],2) - 2*sides[tempA]*sides[tempB]*Math.cos(angles[side]));
            return Math.acos((Math.pow(sides[tempA],2)+Math.pow(sides[tempB], 2)-Math.pow(sides[angle],2))/(2*sides[tempA]*sides[tempB]));
        }
        return -1;
    }
}
