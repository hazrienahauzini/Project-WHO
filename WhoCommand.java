import java.io.*;

public class WhoCommand {

public static void main (String args[]) {

String s = null;

try {

Process p = Runtime.getRuntime().exec("w");

StringBuilder output = new StringBuilder();

BufferedReader stdInput = new BufferedReader(new 
InputStreamReader(p.getInputStream()));

BufferedReader stdError = new BufferedReader(new 
InputStreamReader(p.getErrorStream()));

System.out.println("\n List of machines logged in :\n");
while ((s = stdInput.readLine()) != null)
{ System.out.println(s + "\n");
}

System.out.println("\n List of errors (if any) :\n");
while ((s = stdError.readLine()) != null) {
System.out.println(s);
}
System.exit(0);


}

catch (IOException error) {

System.out.println("Exception happened.\n");
error.printStackTrace();
System.exit(-1);
}
}
}
