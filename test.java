import java.util.Scanner;
class hellow{
public static void run(int a){
int count=0;
while(a>0){
if(a%10==3||a/10==3){
count++;
a=a/10;
}
System.out.println(count);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++){
    run(i);
}
}
}