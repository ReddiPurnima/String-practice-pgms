import java.util.*;
class Anagram
  {
    public static void main(String [] args)
    {
      String s="Ant";
      String s1="Tan";
      s=s.toLowerCase();
      s1=s1.toLowerCase();
      if(s.length()==s1.length()){
        char [] ch1 = s.toCharArray();
        char [] ch2 = s1.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      boolean result=Arrays.equals(ch1,ch2);
      if(result)
      {
        System.out.println("anagram");
      }
     else{
       System.out.println("not anagram");
     }
    }
  }
  }