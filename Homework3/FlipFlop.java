public class FlipFlop {
   public static void main(String[] args){
      for(int x=1;x <=100; x++){
         if(((x%3) == 0) && ((x%5)== 0))
            System.out.println("FlipFlop");
         else if ((x%3)==0)
         System.out.println("Flip");
         else if ((x%5)==0)
         System.out.println("Flop");
         else
            System.out.println(x);
      }
   }
}
