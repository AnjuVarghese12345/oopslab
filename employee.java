import java.util.Scanner;
class emp{
int eno,esalary;
String ename;
void reademp(){
Scanner rdint = new Scanner(System.in);
Scanner rdstr = new Scanner(System.in);
System.out.println("Enter Employee No :");
eno=rdint.nextInt();

System.out.println("Enter Employee Name :");
ename=rdstr.nextLine();

System.out.println("Enter Employee Salary :");
esalary=rdint.nextInt();
}
void display(){

System.out.println(eno+" "+ename+" "+esalary);

}
}
class employee{
public static void main(String[] args){
int n=0;
Scanner rdint2 = new Scanner(System.in);
System.out.println("Enter No:");
n=rdint2.nextInt();
emp obj[]=new emp[n];
for(int i=0;i<n;i++){
obj[i]= new emp();
obj[i].reademp();
}
for(int i=0;i<n;i++){
obj[i].display();
}
}
}
