//to refer current class instance variable
class student{
int id;
String name;
static String college="MTIE";
student(int id,String name ){
this.id=id;
this.name=name;
}
void display(){
System.out.println(id+"    "+name+"    "+college);
}
public static void main(String args[]){     
student s1=new student(22,"madhu");
student s2=new student(10,"raj");
s1.display();
s2.display();
}
}