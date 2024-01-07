class animal{
void eat(){System.out.println("eating......");}
}
class dog extends animal{
void bark(){System.out.println("barking......");}
}
class cat extends animal{
void meow(){System.out.println("meowing......");}
}

class test{
public static void main(String args[]){
dog d=new dog();
d.eat();
d.bark(); 
cat c=new cat();
c.eat();
c.meow(); 
}
}