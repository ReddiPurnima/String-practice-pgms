import java.util.Scanner;
public class countingstringcharacters {
  public static void main(String[] args)
    {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String s=sc.nextLine();
      char ch;
      System.out.println("enter which character wants to count");
      char c = sc.next().charAt(0);
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)==c)
          {
            count++;
          }}
      System.out.println(count);
    }}
