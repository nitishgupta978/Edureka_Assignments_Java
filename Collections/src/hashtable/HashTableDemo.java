package hashtable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 
 * @author nitish.gupta_spicemo
 *
 */
public class HashTableDemo {

public static void main(String args[]) throws IOException
{
String str;
Hashtable<String,Integer> stud = new Hashtable<String,Integer>();
Enumeration<String> names;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter How many Records ");
int n=Integer.parseInt(br.readLine());

for (int i=1;i<=n;i++)
{
System.out.println("Enter Name Of "+ i+" Student");
str=br.readLine();
System.out.println("Enter Marks Of "+ i+" Student");
int marks=Integer.parseInt(br.readLine());
stud.put(str, marks);
}

int maxmarks=0;
names = stud.keys();

while(names.hasMoreElements())
{
str = (String) names.nextElement();
System.out.println(str + ":" + stud.get(str));

if(maxmarks<stud.get(str))
{
maxmarks=stud.get(str);
}
}
System.out.println(" Maximum Marks Is "+maxmarks);
}
}
