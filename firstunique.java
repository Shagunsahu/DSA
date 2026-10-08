import java.util.*;
class firstunique {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char a : s.toCharArray()) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        firstunique obj = new firstunique();
        int result = obj.firstUniqChar(s);
        System.out.println("Index of first unique character: " + result);
    }
}