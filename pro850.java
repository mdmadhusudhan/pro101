import java.util.Scanner;
class trainer{
private int tid;
private String name;
public void set(int tid){ this.tid=tid;}
public int get(){return this.tid;}
public void set(String name){ this.name=name;}
public String gets(){return this.name;}
public trainer(int tid,String name){ this.tid=tid;
 this.name=name;}
public trainer(){this.tid=0;
this.name=null;}
}
class demo{
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
System.out.println("Enter teacher id");
int tidn=sc.nextInt();
System.out.println("Enter teacher id");
String tname=sc.next();
trainer t=new trainer(tidn,tname);
System.out.println("Teacher id:"+t.get()+"\n"+"TSeacher name:"+t.gets());	
}
}

