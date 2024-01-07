class A{
 static int data=30;
static class B
{void msg(){
System.out.println("data:"+data);
}
}
public static void main(String args[]){
A.B c=new A.B();
c.msg();
}
}