class Testimmutablestring{
public static void main(String args[]){
String s="Sachin";
s.concat("Tendulkar");
System.out.println(s);
String s1=s.concat("Tendulkar");
s=s.concat("Tendulkar");
System.out.println(s1);
System.out.println(s);
}
}