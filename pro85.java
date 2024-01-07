import java.util.Scanner;
class trainer{
private int tid;
public void set(int tid){ this.tid=tid;}
public int get(){return this.tid;}
public trainer(int tid){ this.tid=tid;}
public trainer(){this.tid=0;}
}
class demo{
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
System.out.println("Enter teacher id");
int tidn=sc.nextInt();
trainer t=new trainer(tidn);
System.out.println("teacher id:"+t.get());	
}
}

