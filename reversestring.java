import java.util.Scanner;
class reversestring {
    public String reverseWords(String s) {
        int n = s.length();
        String s1 ="";
        int i = n - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            if (s1.length() > 0) s1=s1+" ";
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            s1+=(s.substring(i + 1, j + 1));
        }

        return s1;
    }
    public static void main(String args[]){
        reversestring obj = new reversestring();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = obj.reverseWords(s);
        System.out.println("Reversed string: \"" + reversed + "\"");
    }
}