// Salome Nyaboke J77-10533-2024
import java.util.Scanner;
class product{
    // the attributes
    private String name;
    private double price;
    //constructor
    public product (String name,double price){
        this.name=name;
        this.price=price;
    }
    //discount method
    public double applydiscount(double percentage){
        double discountamount=(price*percentage)/100;
        price=price-discountamount;
        return price;
    }
    //method to get the price
    public double getprice(){
        return price;
    }
}
//main method
class main{
public static void main(String[] args){
    Scanner Scan=new Scanner(System.in);
    //prompt user to enter details
    System.out.println("Enter product name:");
    String name=Scan.nextLine();
    System.out.println("Enter product price:");
    double price=Scan.nextDouble();
    System.out.println("Enter discount percentage:");
    double percentage=Scan.nextDouble();
    //product object
    product prod=new product(name,price);
    //Apply discount
    double finalprice=prod.applydiscount(percentage);
    //Display final product price
    System.out.println("Final price after discount:"+finalprice);
    Scan.close();
}

}