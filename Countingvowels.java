import java.util.Scanner;
class Countingvowels{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch[]={'a','e','i','o','u','A','E','I','O','U'};
int n[]={'0','1','2','3','4','5','6','7','8','9'};
int count=0,countn=0;
String str=sc.nextLine();
for(int i=0;i<=ch.length-1;i++){
for(int j=0;j<=str.length()-1;j++){
if(str.charAt(j)==ch[i]){
count++;
}
else if(str.charAt(j)==n[i]){
countn++;
}
}
}
System.out.println("number of vowels in a string is :"+count);
System.out.println("number of Digits in a string is :"+countn);
}
}