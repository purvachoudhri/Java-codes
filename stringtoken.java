import java.io.*;
import java.util.*;
class Stringdemo{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter your mall name, floor, purchase value,parking");
        String str=br.readLine();
        
        StringTokenizer obj = new StringTokenizer(str," ");
        String token1= obj.nextToken();
        int token2= Integer.parseInt(obj.nextToken());
        Float token3= Float.parseFloat(obj.nextToken());
        String token4= obj.nextToken();
        
        System. out. println("mall name "+token1 );
        System. out. println("floor "+token2 );
        System. out. println("purchase value "+token3 );
        System. out. println("parking "+ token4.charAt(0) );
    }
}