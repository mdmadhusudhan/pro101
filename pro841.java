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
student[] a=new student[5]; 
student s1=new student();
student s2=new student();
student s3=new student();
student s4=new student();
student s5=new student();
a[0]=s1;
a[1]=s2;
a[2]=s3;
a[3]=s4;
a[4]=s5;

a[0].set(22);
a[0].set("madhu");
System.out.println("ID:"+a[0].get());
System.out.println("NAME:"+a[0].geta());	
a[1].set(10);
a[1].set("raj");
System.out.println("ID:"+a[1].get());
System.out.println("NAME:"+a[1].geta());	
a[2].set(16);
a[2].set("kabbadi");
System.out.println("ID:"+a[2].get());
System.out.println("NAME:"+a[2].geta());	
a[3].set(19);
a[3].set("chatrapathi");
System.out.println("ID:"+a[3].get());
System.out.println("NAME:"+a[3].geta());	
a[4].set(17);
a[4].set("mine");
System.out.println("ID:"+a[4].get());
System.out.println("NAME:"+a[4].geta());	

}
}