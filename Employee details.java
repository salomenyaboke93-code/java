// J77-10533-2024 Salome Nyaboke
import java.util.Scanner;
//super class
class Employee{
    String name;
    double salary;

    //constructor
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
   }

   //method to display employee details
   void displayDetails(){
       System.out.println("Name:"+name);
       System.out.println("Salary:"+salary);

   }
}
//subclass
class Lecturer extends Employee{
    String department;
    // constructor
    Lecturer(String name,double salary,String department)
    {
    super(name,salary);// call superclass constructor
    this.department=department;
    }
    //overide method to display lecturer details
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department:"+department);
    }
    }
    //main class
    public class Employeedetails{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            //user input
            System.out.print("Enter lecturers name:");
            String name=input.nextLine();
            System.out.print("Enter their salary:");
            double salary=input.nextDouble();
            input.nextLine();//consumes nextline
            System.out.print("Enter their Department:");
            String department=input.nextLine();
            //lecturers object
            Lecturer lecturer=new Lecturer(name,salary,department);
            //display details
            System.out.println("\nLecturerDetails:");
            lecturer.displayDetails();
            input.close();
        }
            }