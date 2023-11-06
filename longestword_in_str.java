import java.util.*;
public class longestword_in_str{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        String s=sc.nextLine();
        String [] b=s.split(" ");
        String l=b[0];
        for(String b1:b){
            if(s.length()>l.length()){
                l=b1;
            }
        }
        System.out.println("the longest word is: "+l);
}
}

