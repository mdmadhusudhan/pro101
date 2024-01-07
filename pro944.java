class animal{
 final void eat(){System.out.println("eating......");}
}
class dog extends animal{
public static void main(String args[]){
dog d=new dog();
d.eat();
}
}