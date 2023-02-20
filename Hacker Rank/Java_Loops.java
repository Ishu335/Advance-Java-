import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;



public class Java_Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // System.out.print(N) ;
        for (int i=1;i<=10;i++)
        {
            System.err.printf("%d X %d = %d\n",N,i,N*i);
        }
        bufferedReader.close();
    }
}
