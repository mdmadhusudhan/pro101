class person{
int id;
String name;
person(int id,String name){
this.id=id;
this.name=name;
}
}
class emp extends person{
float salary;
emp(int id,String name,float salary){
super(id,name);
this.salary=salary;
}
void display(){
System.out.println(name+" "+id+" "+salary);
}
}
class test{
public static void main(String args[]){
emp e=new emp(22,"madhu",34580);
e.display();
}
}