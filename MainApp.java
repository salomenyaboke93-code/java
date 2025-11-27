import java.util.Scanner;
 class student{
    String name;
    double marks;
    // constructor
    student(String name,double marks){
        this.name=name;
        this.marks=marks;
    }

    //display student details
    public void display(){
        System.out.println("students name"+name);
        System.out.println("student marks"+marks);
    }
}

     class Gradecalculator{
        //calculate grade based on marks
        public String calculatorgrade(double marks){
            if(marks>=90){
                return "A"; }

         else if (marks>=75){
            return"B";}

         else if(marks>=50){
            return"C";}
         else{
            return"D";}
        }
    }
// Main class

            public class MainApp{
                public static void main(String[] args) {
                    Scanner input=new Scanner (System.in);
                    
                    //user input
                    System.out.print("Enter Student name:");

                    String name = input.nextLine();

                    System.out.println ("Enter Student Marks:");
                    double marks = input.nextDouble();

                    //create student object
                    student student=new student(name,marks);

                    //create calculator object 
                    Gradecalculator Calculator=new Gradecalculator();
                    
                    //Calculate grade
                    String grade=Calculator.calculatorgrade(student.marks);
                     
                     //display student details
                     student.display();
                     System.out.println("student grade:"+grade);
                     
                }
    
                
                }
            
         
        
    