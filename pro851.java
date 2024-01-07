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
trainer[] t=new trainer[5];
for(int i=0;i<5;i++){
trainer t[i]=new trainer(sc.nextInt(),sc.next());
System.out.println("Teacher id:"+t.get()+"\n"+"TSeacher name:"+t.gets());	
}
}
}

