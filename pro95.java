
//super key word using invoke the immediate class instance methods
class A{
	void eat(){System.out.println("starving......");}
} 
class animal extends A{
	void eat(){super.eat();System.out.println("eating...........");}
}
class dog extends animal{
	void eat(){System.out.println("eating bread....");}
	void barking(){System.out.println("barking......");}
void work(){
	super.eat();
	barking();
	}
}
class test{
	public static void main(String args[]){
		dog d=new dog();
		d.work();
	}
}