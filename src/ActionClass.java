import java.util.Scanner;
public class ActionClass {
    public static void main(String[] args) {
        Scanner keyboerdInPut= new Scanner(System.in);
        System.out.print("Enter your name : ");
        String username = keyboerdInPut .next();
        System.out.print("enter your car type : ");
        String usercarName = keyboerdInPut .next();
        FuelConsumption objectOne = new FuelConsumption(username , usercarName );
        System.out.print("Haw many kilometers did you go with your car?");
        double distance = keyboerdInPut . nextDouble();
        System.out.print("How much petrol did your car ? ");
        double petroluse = keyboerdInPut . nextDouble();
        keyboerdInPut . close();


    }
}
