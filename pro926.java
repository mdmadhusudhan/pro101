class C{
void print(){
System.out.println("class C");}
}
class A extends C{
void print(){
super.print();
System.out.println("class A");}
}
class B extends C{
void print(){
System.out.println("class D");}
}
class D extends A{
void print(){
super.print();
System.out.println("class D");}
}
class test{
public static void main(String args[]){
D d=new D();
B b=new B();
d.print();
b.print();
}
}