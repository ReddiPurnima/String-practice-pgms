import java.util.Scanner;
public class freq_of_each_char
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=sc.nextLine();
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++){
		    int count=1;
		    for(int j=i+1;j<c.length;j++){
		    if(c[i]==c[j] && c[i]!=0){
		        count++;
		        c[j]=0;
		    }}
		    if(c[i]!=0)
		    System.out.println(c[i]+"-"+count);
	}
	}
}

