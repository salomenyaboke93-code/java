// J77-10533-2024
//the parent class
class vehicle {
    String brand;
    int year;

    // method to display vehicle details
   void displayvehicleDetails() {
    System.out.println("Brand:"+brand);
    System.out.println("Year:"+year);
   }
}
//child class
class car extends vehicle{
    String feature;

    // display of car details
    void displayCarDetails () {
        displayvehicleDetails();
        System.out.println("feature:"+feature);

    }
}
// the main class
public class Main {
    public static void main(String[] args) {
   //create a car object
   car mycar= new car();
   mycar.brand="camri";
   mycar.year=2021;
   mycar.feature="sunroof";
   //display details
   mycar.displayCarDetails();   
    }
}