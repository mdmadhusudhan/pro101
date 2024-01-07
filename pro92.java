class dad{
float sal=234567;
}
class demo extends dad{
 int a=4567;
public static void main(String args[]){
demo d=new demo();
System.out.println("programmers salary:"+d.sal);
System.out.println("bonus of the perogrammer:"+d.a);
}
}