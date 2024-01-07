class Address{
	String city,state,contry;
        Address(String city,String state,String contry){
	this. city=city;
	this.state=state;
	this.contry=contry;
	}
}
class emp{
int id;
String name;
Address ad;
emp(int id,String name,Address ad){
this. id=id;
this.name=name;
this. ad=ad;
}
void display(){
System.out.println(id+" "+name);
System.out.println(ad.city+"  "+ad.state+"  "+ad.contry);
}
public static void main(String args[]){
Address a1=new Address("chittor","ap","india");
Address a2=new Address("cdp","ap","india");

emp e1=new emp(22,"madhu",a1);
emp e2=new emp(10,"Raj",a2);
e1.display();
e2.display();
}
}