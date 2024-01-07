//using final key word to methods
final class animal{
 void eat(){System.out.println("eating......");}
}
class dog extends animal{
void eat(){
System.out.println("iam eating");}
}
class  test{
public static void main(String args[]){
dog d=new dog();
d.eat();
}
}