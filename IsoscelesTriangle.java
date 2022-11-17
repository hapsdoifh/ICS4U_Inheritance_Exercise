public class IsoscelesTriangle extends Triangle {
    public double findAngle(int angle, boolean isVertex) {
        if(isVertex){
            if(angles[angle+1>0?angle-2:angle+1]!=0){
                return 180-2*angles[angle+1>0?angle-2:angle+1];
            }else{
                return 180-2*angles[angle+2>0?angle-1:angle+2];
            }
        }else{
            if(angles[angle+1>0?angle-2:angle+1]!=0){
                return angles[angle+1>0?angle-2:angle+1];
            }else{
                return angles[angle+2>0?angle-1:angle+2];
            }
        }
    }
    public double findSide(int side, boolean isBase) {
        if(isBase){
            if(sides[side+1>0?side-2:side+1]!=0){
                return 180-2*sides[side+1>0?side-2:side+1];
            }else{
                return 180-2*sides[side+2>0?side-1:side+2];
            }
        }else{
            if(sides[side+1>0?side-2:side+1]!=0){
                return sides[side+1>0?side-2:side+1];
            }else{
                return sides[side+2>0?side-1:side+2];
            }
        }
    }
}
