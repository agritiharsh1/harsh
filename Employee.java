import java.io.*;
class Employee{
 public static void main(String[]args) throws IOException{
 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter Eno:");
 int Eno=Integer.parseInt(br.readLine());
System.out.print("Enter Ename:");
 String Ename=br.readLine();
 System.out.print("Enter Sal:");
 double Sal=Double.parseDouble(br.readLine());
 System.out.print("Enter Mobileno:");
 long Mobileno=Long.parseLong(br.readLine());
 System.out.print("Enter Dept:");
 String Dept=br.readLine();
 System.out.print("Enter Gender:");
 char Gender=br.readLine().charAt(0);
 System.out.print("Enter Status:");
 boolean Status=Boolean.parseBoolean(br.readLine());
}
}





