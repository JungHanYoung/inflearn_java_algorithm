package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0, rt = chars.length - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }
}

/**     lt
 *      *   *   *   *   *
 *                      rt
 */