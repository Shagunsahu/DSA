import java.util.Scanner;
class remvparan {
    public String removeOuterParentheses(String s) {
        
        StringBuilder result = new StringBuilder();
        int p=0;
        for (char c : s.toCharArray()) {
 
            if (c == '(') {
                if ( p> 0) {
                   result.append(c);
                }
                p++;
            } 
            else { // c == ')'
                p--;
                if (p>0) {
                    result.append(c);
                }
            }
        }
    return result.toString();
}
public static void main(String args[]){
        remvparan obj = new remvparan();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = obj.removeOuterParentheses(s);
        System.out.println("Result string: \"" + result + "\"");
    }
}