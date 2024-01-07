class animal{
String name="dog";
void eat(){System.out.println("eating......");}
}
class dog extends animal{
void display(){
System.out.println(name);
}
}
class  test{
public static void main(String args[]){
dog d=new dog();
d.display();
d.eat();
}
}