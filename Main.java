public class Main {
    public static void main(String[] args){
        RightAngleTriangle test = new RightAngleTriangle();
        test.setSide(1, 1);
        test.setAngle(1, 45);
        test.setSide(3, Math.sqrt(2));
        System.out.println(test.findAngle(3));
        test.setSide(1, 3);
        test.setSide(2, 4);
        System.out.println(test.findSide(3,true));
    }
}
