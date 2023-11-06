import java.util.Scanner;
class Reverseofstring
  {
    public static void main(String [] args)
    {
      int upper=0,lower=0,special=0,digits=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
    String a=sc.nextLine();
      String result=" ";
      for(int i=a.length()-1;i>=0;i--){
        char ch=a.charAt(i);
        result=result+ch;
      }
      System.out.println(result);
    }
  }