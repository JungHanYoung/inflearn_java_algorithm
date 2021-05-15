package me.hanyoung.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int result = solution(s, t);
        System.out.println(result);
    }

    private static int solution(String s, String t) {

        int answer = 0;

        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            hashMapT.put(t.charAt(i), hashMapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length() - 1; i++) {

            hashMapS.put(s.charAt(i), hashMapS.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            hashMapS.put(s.charAt(rt), hashMapS.getOrDefault(s.charAt(rt), 0) + 1);
            found: {
                for (Map.Entry<Character, Integer> entry :
                        hashMapT.entrySet()) {
                    if(!hashMapS.containsKey(entry.getKey()) || !hashMapS.get(entry.getKey()).equals(entry.getValue())) {
                        break found;
                    }
                }
                answer++;
            }

            hashMapS.put(s.charAt(lt), hashMapS.get(s.charAt(lt)) - 1);
            if(hashMapS.get(s.charAt(lt)) == 0) {
                hashMapS.remove(s.charAt(lt));
            }
            lt++;
        }

        return answer;
    }
}
