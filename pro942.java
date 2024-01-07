
//super key word using invoke the immediate class instance constuctor
class animal{
animal(){System.out.println("animal is created");}
}
class dog extends animal{
dog(){
System.out.println("dog is created");
}
}
class test{
public static void main(String args[]){
dog d=new dog();
}
}