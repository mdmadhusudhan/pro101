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
student s1=new student();
student s2=new student();
student s3=new student();
student s4=new student();
student s5=new student();
s1.set(22);
s1.set("madhu");
System.out.println("ID:"+s1.get());
System.out.println("NAME:"+s1.geta());	
s2.set(10);
s2.set("raj");
System.out.println("ID:"+s2.get());
System.out.println("NAME:"+s2.geta());	
s3.set(16);
s3.set("kabbadi");
System.out.println("ID:"+s3.get());
System.out.println("NAME:"+s3.geta());	
s4.set(19);
s4.set("chatrapathi");
System.out.println("ID:"+s4.get());
System.out.println("NAME:"+s5.geta());	
s5.set(17);
s5.set("mine");
System.out.println("ID:"+s5.get());
System.out.println("NAME:"+s5.geta());	
}
}