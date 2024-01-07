import java.util.Scanner;
class student{
private String college_name;
private String college_add;
private int sy;
private int ey;
private int id;
private String name;
private String dpt;
private String addar;
public void set1(int id){ 
this.id=id;}
public void set2(int sy){
this.sy=sy;}
public void set3(int ey){
this.ey=ey;
}
public void seta(String name){
this.name=name;}
public void setb(String college_name){
this.college_name=college_name;}
public void setc(String college_add){
this.college_add=college_add;}
public void setd(String dpt){
this.dpt=dpt;}
public void sete(String addar){
this.addar=addar;
}
public int get1(){return this.id;}
public int get2(){return this.sy;}
public int get3(){return this.ey;}
public String geta(){return this.name;}
public String getb(){return this.college_name;}
public String getc(){return this.college_add;}
public String getd(){return this.dpt;}
public String gete(){return this.addar;}
}
class demo{
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
student[] a=new student[5]; 
for(int i=0;i<5;i++){
a[i]=new student();
}
System.out.println("name , college name , id , start-y , end-y , college-add , dpt , addar");	
for(int i=0;i<5;i++){
a[i].seta(sc.next());
a[i].setb(sc.next());
a[i].set1(sc.nextInt());
a[i].set2(sc.nextInt());
a[i].set3(sc.nextInt());
a[i].setc(sc.next());
a[i].setd(sc.next());
a[i].sete(sc.next());
}
for(int i=0;i<5;i++){
System.out.println(a[i].getb());	
System.out.println("   "+a[i].getc());	
System.out.println("  "+a[i].get2()+"-"+a[i].get3());	
System.out.println("    "+a[i].get1());	
System.out.println("\t"+a[i].geta());
System.out.println("  "+a[i].getd());
System.out.println("\t"+a[i].gete());	
}
}
}

