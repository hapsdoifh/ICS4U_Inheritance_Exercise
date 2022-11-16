public class Main {
    public static void main(String[] args){
        Triangle test = new Triangle();
        test.setAngle(0,30);
        test.setSide(0,5);
        test.setAngle(1, 60);
        System.out.println(test.findSide(1));
    }
}
