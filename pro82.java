class test{
int id;
String name;
static String college="MTIE";
static void change()
{
college="GOLD";
}
test(int id,String name){
this.id=id;
this.name=name;
}
void display(){
System.out.println(id+" "+name+" "+college);}
public static void main(String args[]){
test t1=new test(1,"madhu");
test t2=new test(2,"raj");
t1.display();
t2.display(); 
test.change();
test t3=new test(3,"king");
t1.display();
t2.display(); 
t3.display();
}
}