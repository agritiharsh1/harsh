import java.util.*;
class Scan{
public static void main(String[]args){
Scanner scn =new Scanner(System.in);
System.out.println("Enter Student number");
int sno=scn.nextInt();
scn.nextLine();
System.out.println("Enter Student name");
String sname=scn.nextLine();
System.out.println(sno);
System.out.println(sname);
}
}