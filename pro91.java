class demo{
final int a=4567;
void run(){
a=876;
System.out.println(a);
}
public static void main(String args[]){
demo d=new demo();
d.run();
}
}