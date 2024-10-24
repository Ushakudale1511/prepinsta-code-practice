public class Main {
public static void main(String[] args) {
int x=12,y=13,hcf=0;
for (int i=1;i<=x;i++){
if(x%i==0){
if(y%i==0){
hcf=i;
}
}
}
System.out.println(hcf);

}

Type 2 :
  public class Pract {
static Scanner sc=new Scanner(System.in);

public static void main(String[] args) {
System.out.println(“enter the first number..”);
int n1=sc.nextInt();
System.out.println(“enter the second number..”);
int n2=sc.nextInt();
System.out.println(“enter the third number..”);
int n3=sc.nextInt();
int g=0;
for(int i=1;i<n1;i++) {
if(n1%i==0 && n2%i==0 &&n3%i==0)

g=i;
}
System.out.println(g);

}
}
