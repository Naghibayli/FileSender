package IOUtil;

import java.util.Scanner;

public class UInput {

    public static String requireString(String title){
        System.out.print(title);
        return new Scanner(System.in).nextLine();
    }
}
