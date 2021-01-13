import java.util.*;
class filip{
  public static void main(String[] args){
  Scanner kbd = new Scanner(System.in);
  int a = kbd.nextInt();
  int b = kbd.nextInt();
   int r,sum=0,sum1=0;
   if( a != b && a != 0 && b != 0){
    while(a> 0){
      r = a % 10;
      sum = sum*10 + r;
      a/=10;
    }
    while(b > 0){
      r = b % 10;
      sum1 = sum1 * 10 + r;
      b/=10;
    }
    if(sum > sum1)
      System.out.println(sum);
    else
      System.out.println(sum1);
  }
 }
}