import java.util.Scanner;
class student{
static String college_name="Mother theresa institute of engineering and technology";
static String college_add="Palamaner melumai-(517408)";
static int sy=2022;
static int ey=2026;
int id;
String name;
static String dpt="AI&DS";
String addar;

public void set1(int id){ 
this.id=id;}
public void seta(String name){
this.name=name;}
public void setb(String addar){
this.addar=addar;}
public int get1(){return this.id;}
public String geta(){return this.name;}
public String getb(){return this.addar;}
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
student[] a=new student[5]; 
for(int i=0;i<5;i++){
a[i]=new student();
}
System.out.println("name , addar , id");	
for(int i=0;i<5;i++){
a[i].seta(sc.next());
a[i].setb(sc.next());
a[i].set1(sc.nextInt());
}
for(int i=0;i<5;i++){
System.out.println(college_name);	
System.out.println("   "+college_add);	
System.out.println("\t"+" "+ sy+"-"+ey);	
System.out.println("\t"+"  "+a[i].get1());	
System.out.println("\t"+a[i].geta());
System.out.println("\t"+"  "+dpt);
System.out.println("\t"+a[i].getb());	
}
}
}

