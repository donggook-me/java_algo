import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] testSize = br.readLine().split(" ");
        int firstSize = Integer.parseInt(testSize[0]);
        int secondSize = Integer.parseInt(testSize[1]);
        int squareLength = 1;

        String[] numArray = new String[firstSize];
        for (int i = 1; i <= firstSize; i++) {
            numArray[i-1] = br.readLine();
        }
        loop:
        for (int i = firstSize; i >= 1;  i--) {
            for(int k = 0; k<=firstSize-i; k++){
                for (int j=0; j<=secondSize-i; j++){
                    char key = numArray[k].charAt(j);
                    if( numArray[k].charAt(j+i-1) == key &&
                        numArray[k+i-1].charAt(j) == key &&
                     numArray[k+i-1].charAt(j+i-1) ==key){
                        squareLength = i;
                        break loop;
                    }
                }
            }

        }

        System.out.println(squareLength * squareLength);

    }}
