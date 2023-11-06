import java.util.Scanner;
class countingtheString{
    public static void main(String args[]) {
      int upper=0,lower=0,special=0,digits=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      String a=sc.nextLine();
      for(int i=0;i<a.length();i++){
        char ch=a.charAt(i);
        if(ch>='A' && ch<='Z')
        upper++;
        else if(ch>='a'&& ch<='z')
          lower++;
        else if(ch>='1'&& ch<='9')
          digits++;
        else
        special++;}
      System.out.println("upper: "+upper);
      System.out.println("lower: "+lower);
      System.out.println("digits: "+digits);
      System.out.println("special: "+special);
      
          
          }    
}
    
    
  

      
      
      
      
      

    