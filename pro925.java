class C{
void printc(){
System.out.println("class C");}
}
class A extends C{
void printa(){
System.out.println("class A");}
}
class B extends C{
void printb(){
System.out.println("class B");}
}
class D extends A{
void printd(){
System.out.println("class D");}
}
class test{
public static void main(String args[]){
D d=new D();
B b=new B();
d.printa();
d.printc();
d.printd();
b.printb();
}
}