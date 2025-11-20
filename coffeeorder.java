// Salome Nyaboke J77-10533-2024
import java.util.Scanner;
public class coffeeorder{
    //the attributes
    String size;
    double price;
    //the constructor
public coffeeorder(String size,double price){
    this.size=size;
    this.price=price;
}
// method to display the order details
public void displayorder(){
    System.out.println("coffee size:"+ size);
    System.out.println("coffee price:"+price);
}
//MAIN METHOD
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
//user input
System.out.println("Enter coffee size of order 1:");
String size1=input.nextLine();  
System.out.println("Enter coffee priceof order1:");
double price1=input.nextDouble();
System.out.println("enter coffee size of order2:");
String size2=input.nextLine();
System.out.println("Enter coffee price of order2:");
double price2=input.nextDouble();
    //create objects
    coffeeorder order1=new coffeeorder(size1,price1);
    coffeeorder order2=new coffeeorder(size2,price2);
    //display orders
    System.out.println("Order 1 details:");
    System.out.println("size:"+size1);
    System.out.println("price:"+price1);
    System.out.println("Order 2 details:");
    System.out.println("size:"+size2);
    System.out.println("price:"+price2);
    input.close();

}
}