import java.io.*;
import java.lang.Math;


public class backjoon_1009 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i=1; i<=testCase; i++) {
        String line = br.readLine();
        String[] line_tokens = line.split(" ");
        int a = Integer.parseInt(line_tokens[0]);
        int b = Integer.parseInt(line_tokens[1]);
        int result = 0;
        switch(a%10){
            case 1:
            case 5:
            case 6:
                result = a%10;
                break;
            case 0: result = 10;
                break;
            case 4:
            case 9:
                if (b%2 == 0){ b = 2;} else{b= b%2;}
                result = (int)Math.pow(a%10, b) % 10;
                break;
            case 2:
            case 3:
            case 7:
            case 8:
                if (b%4 == 0){ b = 4;} else{b = b%4;}
                result = (int)Math.pow(a%10, b) %10;
                break;
        }
        System.out.println(result);

    }
    }

}
