
import java.*;
class a{
public static void main(String args[])
throwsIOException
{
BufferedReader br=new BufferedReader(InputStreamReader(System.in));
System.out.println("enter employee id");
int id=Integer.parseInt(br.readLine());

System.out.println("Enter employee gender");
char g=(char) br.readLine();

System.out.println("Enter employee name");
String name=br.readLine();

System.out.println("the employee id"+id);
System.out.println("the employee gender"+g);
System.out.println("the employee name"+name);
}
}