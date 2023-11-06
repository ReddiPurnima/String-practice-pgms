import java.util.Scanner;
public class vowelcount_str{
    public static void main(String[] args) {
        int vowel=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowel++;
        }
        }
        System.out.println("vowelcount: "+vowel);
    }
}