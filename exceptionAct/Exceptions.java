package exceptionAct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptions {
    static class Smartphone{
String model;
int price;
public Smartphone(String model, int price){
     this.model = model;
    this.price = price;
}   
public String getModel(){
    return model;
}
public void setModel(String model){
    this.model= model; 
}
public int getPrice(){
    return price;
}
public void setPrice(int price){
    this.price= price; 
}
public String toString(){
    return "Model Name:" + model + "Price:₱"+ String.format("%,.2f",price) ;
}

    } 
    public static class SmartphoneException extends Exception{
public SmartphoneException(String message){
    super(message);
}
    }


    
 



    public static void main(String[] args) {
        List<Smartphone> Smartphones = new ArrayList<Smartphone>();
        System.out.println("Input how many smartphones to create: ");
   
        try (Scanner s = new Scanner(System.in)) {
            int size = s.nextInt();
            for(int i = 0; i<size;i++){
                try {
                System.out.println("Input the Model Name:");
                String modelName = s.next();
                System.out.println("How much are you gonna sell this phone?:");
                int price = s.nextInt();
                if(price< 0){
                    throw new SmartphoneException("Prices cannot be zero"); 
                }
                Smartphone phone = new Smartphone(modelName,price);
                Smartphones.add(phone);
                } catch (SmartphoneException e) {
                  
                    System.out.println("error! Please input price!");
                }
                
               
        }
        }
        
        
    }

    }

