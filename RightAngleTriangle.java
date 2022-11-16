public class RightAngleTriangle extends Triangle {
    public double findSide(int side,boolean isHypot){        
        side--;
        if(isHypot){
            return Math.sqrt(Math.pow(sides[side+1>2?side-2:side+1], 2)+Math.pow(sides[side+2>2?side-1:side+2],2));
        }else{
            return Math.sqrt(Math.abs(Math.pow(sides[side+1>2?side-2:side+1], 2)-Math.pow(sides[side+2>2?side-1:side+2],2)));
        }
    }
}
