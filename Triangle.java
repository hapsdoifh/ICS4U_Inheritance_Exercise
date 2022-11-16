import java.util.*;
import java.math.*;

public class Triangle {
    public String name;
    protected double[] sides = new double[3];
    protected double[] angles = new double[3];
    protected double base = 0;
    protected double height;
    
    //Getters Setters
    public double getSide(int which){
        return sides[which-1];
    }
    public double getAngle(int which){
        return angles[which-1];
    }
    public void setSide(int which, double value){
        sides[which-1] = value;
    }
    public void setAngle(int which, double value){
        angles[which-1] = value;
    }

    protected double findArea(){
        return base*height/2;
    }
    protected double findParam(){
        return sides[0]+sides[1]+sides[2];
    }
    
    public double findSide(int side){
        side--;
        int wS = side;
        //sin law
        if(angles[side] != 0){
            for(int i = 0; i<2; i++){
                wS = (wS+1)>2?wS-2:wS+1;
                if(angles[wS] !=0 && sides[wS] !=0){
                    return Math.sin(Math.toRadians(angles[side])) * sides[wS]/Math.sin(Math.toRadians(angles[wS]));
                }
            }
        }
        //cosine Law
        int tempA = (side+1)>2?side-2:side+1;
        int tempB = (side+2)>2?side-1:side+2;
        if(angles[side] != 0 && sides[tempA] !=0 && sides[tempB] !=0){ //checks to see if the other two sides are not 0\
            return Math.sqrt(Math.pow(sides[tempA], 2) + Math.pow(sides[tempB],2) - 2*sides[tempA]*sides[tempB]*Math.cos(Math.toRadians(angles[side])));
        }
        return -1;
    }

    public double findAngle(int angle){
        angle--;
        int wA = angle;
        //sin law
        if(sides[angle] != 0){
            for(int i = 0; i<2; i++){
                wA = (wA+1)>2?wA-2:wA+1;
                if(sides[wA] !=0 && angles[wA] !=0){
                    return Math.toDegrees(Math.asin(sides[angle] * Math.sin(Math.toRadians(angles[wA]))/sides[wA]));
                }
            }
        }
        //cosine Law
        int tempA = (angle+1)>2?angle-2:angle+1;
        int tempB = (angle+2)>2?angle-1:angle+2;
        if(sides[angle] != 0 && sides[tempA] !=0 && sides[tempB] !=0){ //checks to see if the other two sides are not 0\
            //return Math.sqrt(Math.pow(sides[tempA], 2) + Math.pow(sides[tempA],2) - 2*sides[tempA]*sides[tempB]*Math.cos(angles[side]));
            return Math.toDegrees(Math.acos((Math.pow(sides[tempA],2)+Math.pow(sides[tempB], 2)-Math.pow(sides[angle],2))/(2*sides[tempA]*sides[tempB])));
        }
        return -1;
    }
}
