import java.io.*;
import java.util.*;
class demo{
public static boolean digit(char a){
	if(Character.isDigit(a)==false){
		return true;}
         return false; 
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
String res="VALID";
for(int i=0;i<=str.length()-1;i++)
{
      if(digit(str.charAt(i))){
       res="INVALID";break;}//if
 }//for
 System.out.println(res);
}//main()
}
