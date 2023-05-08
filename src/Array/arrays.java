package Array;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        colors[3] = "yellow";
        colors[4] = "pink";
        System.out.println(Arrays.toString(colors));

        for (String color : colors) System.out.println(color);
        int[] numbers = {100,200};

        for(int i = colors.length-1;  i >=0; i--) System.out.println(colors[i]);
        Arrays.stream(colors).forEach(System.out::println);
    }
}
