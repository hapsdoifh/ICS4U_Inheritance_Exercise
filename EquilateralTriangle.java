public class EquilateralTriangle extends IsoscelesTriangle {
    public double Area(){
        for(double i : sides){
            if(i != 0){
                return i*Math.sqrt(3)/2*i;
            }
        }
        return -1;
    }
    public double findAngle(){
        return 60;
    }
    public double findSide(){
        for(double i : sides){
            if(i != 0){
                return i;
            }
        }
        return -1;
    }
}
