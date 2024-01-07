
//super key word using invoke the immediate class instance variable
class animal{
String colour="green";
}
class dog extends animal{
String colour="red";
void display(){
System.out.println(colour);
System.out.println(super.colour);
}
}
class test{
public static void main(String args[]){
dog d=new dog();
d.display();
}
}