
import java.util.Scanner;
class oddstring {    
    public String largeOddNum(String s) {
        s = s.replaceFirst("^0+", "");
         if(s.isEmpty()){
            return "";
         }
         
        
         for(int i=s.length()-1;i>=0;i--){
            int digit = s.charAt(i) - '0';
            if(digit%2 != 0){
                return s.substring(0,i+1);
            }
         }
         
       
         return "";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        oddstring obj = new oddstring();
        String result = obj.largeOddNum(s);
        System.out.println("Largest odd number: " + result);
    }
}