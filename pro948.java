class pan{
int cube(final int n){
//n=n+2 cantbe change
return n*n*n;
} 
public static void main(String args[]){
pan p=new pan();
int res=p.cube(5);
System.out.println(res);
}
}