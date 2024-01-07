class operation{
	int square(int x){
	return x*x;
	}
}
class circle{
operation op;
double p=3.14;
	double area(int r){
		op=new operation();
		int rs=op.square(r);
		return p*rs;
	}
public static void main(String args[]){
circle c=new circle();
double res=c.area(5);
System.out.println(res);
}
}