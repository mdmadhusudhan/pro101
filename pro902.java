class Author{
	String aname,place;
	int age;
        Author(String aname,int age,String place){
	this. aname=aname;
	this.age=age;
	this.place=place;
	}
}
class book{
int price;
String name;
Author au;
book(String name,int price,Author au){
this. price=price;
this.name=name;
this. au=au;
}
public static void main(String args[]){
Author a1=new Author("Nannaya",45,"chittor");
book b1=new book("mounaragam",765,a1);
System.out.println("Authorname: "+b1.name);
System.out.println("Book price:"+b1.price);
System.out.println(".............Author details...........");
System.out.println("Authorname: "+b1.au.aname);
System.out.println("Book price:"+b1.au.age);
System.out.println("Authorname: "+b1.au.place);

}
}