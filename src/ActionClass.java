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
        double result = 100*petroluse/distance;
        //System.out.println(Math.round (result));
        //System.out.println(result);
        System.out.println(" Dear " + objectOne.returnName()  +  " your "  +  objectOne.returnCarName() + " carconsum is :  "  +  Math.round(result)  +  " liters petrol in 100 kilometers ");
        keyboerdInPut . close();


    }
}
