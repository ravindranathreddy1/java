import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String l=null;
        int i=1;
        Scanner input=new Scanner(System.in);
        while(input.hasNextLine()){
            l=input.nextLine();
            System.out.println(i+" "+l);
            i++;
        }
        
    }
}
