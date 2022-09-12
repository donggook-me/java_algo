import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class backjoon_1058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max_friend_count = 0;
        int testCase = Integer.parseInt(br.readLine());
        String[] friend_list = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            friend_list[i] = br.readLine().replace("Y", "1").replace("N", "0");
        }

        for (int i = 0; i < testCase; i++) {
            StringBuilder sb = new StringBuilder(friend_list[i]);
            for (int j = 0; j < testCase; j++) {
                if (friend_list[i].charAt(j) == '1') {
                    for (int k = 0; k < testCase; k++) {
                        if (friend_list[j].charAt(k) == '1') {
                            sb.replace(k, k + 1, "1");
                        }
                    }

                }
                ;
            }
            sb.replace(i, i+1, "0");
            int friend_count = 0;
            for (int v = 0; v < sb.toString().length(); v++) {
                if (sb.toString().charAt(v) == '1') {
                    friend_count++;
                }
                if (friend_count > max_friend_count) {
                    max_friend_count = friend_count;
                }
            }
        }
        System.out.println(max_friend_count);

    }}