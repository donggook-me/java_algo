import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class backjoon_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> color_list = new ArrayList<>(Arrays.asList("black", "brown", "red", "orange","yellow","green","blue","violet","grey","white"));


        String first_color = br.readLine();
        String second_color = br.readLine();
        String third_color = br.readLine();

        String first_value = String.valueOf(color_list.indexOf(first_color));
        String second_value = String.valueOf(color_list.indexOf(second_color));
        long combined_value = Long.parseLong(first_value + second_value + ("0".repeat(color_list.indexOf(third_color) )));
        System.out.println(combined_value);


    }}
