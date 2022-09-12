import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int first_num = Integer.parseInt(br.readLine());
        int second_num = Integer.parseInt(br.readLine());

        int start_num = first_num - (first_num % 100);
        int end_num = start_num + 99;
        for(int i=start_num; i<end_num; i++){
            if(i%second_num == 0){
                answer = i%100;
                break;
            }
        }

        System.out.println(String.format("%02d", answer));

    }}
