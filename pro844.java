import java.util.Scanner;
class student{
private int id;
private String name;
private String dpt;
public void set(int id){ 
this.id=id;}
public void set(String name){
this.name=name;
}
public void seta(String dpt){
this.dpt=dpt;
}
public int get(){return this.id;}
public String geta(){return this.name;}
public String getb(){return this.dpt;}
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
a[i].set(sc.next());
a[i].seta(sc.next());
}
for(int i=0;i<5;i++){
System.out.println("ID:"+a[i].get());
System.out.println("NAME:"+a[i].geta());
System.out.println("DEPARTMENT:"+a[i].getb());	
}
}
}

