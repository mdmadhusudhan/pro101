class test{
//int count;
static int count=0;
test(){
count++;
System.out.println(count);
}
public static void main(String args[]){     
test s1=new test();
test s2=new test();
test s3=new test();
}
}