//J77-10533-2024 Salome Nyaboke
public class SupermarketApp{
    public static void main(String[]args){
        //declare and initialize
        int[] prices={120,80,150,60,200,90};
        int total=0;
        //print all item prices
        System.out.println("Item prices:");
        for(int i=0;i<prices.length;i++){
            System.out.println(prices[i]);
            total=total+prices[i];
        }
        //display total amount
        System.out.println("total amount to pay:"+total);
        
    }
}