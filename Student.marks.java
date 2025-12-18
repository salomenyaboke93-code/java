  J77-10533-2024 salome Nyaboke
  public class Studentmarks{
    public static void main(String[]args){
        //2d array for storing the student marks
        int[] [] marks={
            {75,80,90},//student 1
            {65,70,85},//student 2
            {88,92,81}//student 3
};
// print out marks
System.out.println("student marks:");
for(int i=0;i<marks.length;i++){
    for(int j=0;j<marks.length;j++){
    System.out.println(marks[i][j]+"\t");
    }
    System.out.println();
}
//calculate average of each student
int sum=0;
for(int j= 0;j<marks.length;j++)
{
    sum+=marks[2][j];
}
double average=sum/marks.length;
System.out.println("\n Average marks of student 3:"+average);
    }
}