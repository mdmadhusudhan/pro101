import java.util.Scanner;
class student{
private int id;
private String name;
public void set(int id){ 
this.id=id;}
public void set(String name){
this.name=name;
}
public int get(){return this.id;}
public String geta(){return this.name;}
}
class demo{
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
student[] a=new student[5]; 
for(int i=0;i<5;i++){
a[i]=new student();
}
for(int i=0;i<5;i++){
a[i].set(sc.nextInt());
a[i].set(sc.next());}
for(int i=0;i<5;i++){
System.out.println("ID:"+a[i].get());
System.out.println("NAME:"+a[i].geta());	
}
}
}

