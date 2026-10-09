 import java.util.*;
class adjduplicate {
 
 public String removeDuplicates(String s, int k) {
        
        Stack<Character> charSt=new Stack<>();
        Stack<Integer> countSt=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(charSt.size()>0 && charSt.peek()==ch) countSt.push(countSt.peek()+1);
            else countSt.push(1);
            
            charSt.push(ch);
            if(countSt.peek()==k){
                for(int i=0;i<k;i++){
                    charSt.pop();
                    countSt.pop();
                }
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(charSt.size()>0) sb.append(charSt.pop());
        return sb.reverse().toString();
    }
    public static void main(String args[]) {
       
        String s = "";
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        System.out.print("Enter the value of k: ");
        k = sc.nextInt();
        adjduplicate obj = new adjduplicate();
        String result = obj.removeDuplicates(s, k);
        System.out.println("String after removing adjacent duplicates: " + result);
    }



}