class A{
 static int data=30;
static class B
{
static void msg(){
System.out.println("data:"+data);
}
}
public static void main(String args[]){
A.B.msg();
}
}