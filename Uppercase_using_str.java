public class Uppercase_using_str
{
  public static void main(String[] args) {
    String s="purnima@21";
    String[] s1=s.split(" ");
    StringBuilder s2=new StringBuilder();
    for(String s3:s1)
    {
        if(!s3.isEmpty()){
            char c=Character.toUpperCase(s3.charAt(0));
            String r=s3.substring(1).toLowerCase();
            s2.append(c).append(r).append(" ");
        }
    }
    String c=s2.toString().trim();
    System.out.println("input :"+s);
    System.out.println(c);
  }
}