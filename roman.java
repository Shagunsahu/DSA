import java.util.*;
class roman{
    public int romanToInt(String s) {
          HashMap<Character,Integer>
         map=new HashMap<>();
 
        map.put('I',1);
        map.put('V',5);
        map.put('X',fr10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
 
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&map.get(s.charAt(i))<map.get(s.charAt(i+1)))
                ans-=map.get(s.charAt(i));
            else
                ans+=map.get(s.charAt(i));
                
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String s = sc.nextLine();
        roman obj = new roman();
        int result = obj.romanToInt(s);
        System.out.println("Integer value: " + result);
    }
}