// J77-10533-2024 Salome Nyaboke
public class Array{
    public static void main (String[]args){
        int[] numbers ={5,10,15,20,25};
        int sum =0;
        for(int i=0;i<5;i++)
        {
            System.out.println(numbers[i]);
            sum=sum+numbers[i];
        }
        //display sum
        System.out.println("sum is:"+sum);
    }
}