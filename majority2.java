import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class majority2 {
    public List<Integer> majorityElementTwo(int[] nums) {
        int  el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int c1=0,c2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(c1==0&&nums[i]!=el2)
            {
                c1++;
                el1=nums[i];
                
            }
            else if(c2==0&&nums[i]!=el1)
            {
                c2++;
                el2=nums[i];

            }
             
            else if(nums[i]==el1)
            c1++;
            else if(nums[i]==el2)
            c2++;
            else{
                c1--;
                c2--;
            }

        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el1)
            c1++;
            if(nums[i]==el2)
            c2++;
        }
        int mini = n / 3 + 1;
        List<Integer> result = new ArrayList<>(); 
        if (c1 >= mini) result.add(el1);
        if (c2 >= mini && el1 != el2) result.add(el2);

        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int n=sc.nextInt();
        int num[]=new int[n];
           System.out.print("enter elements of array");
           for(int i=0;i<n;i++){
            num[i]=sc.nextInt();}
            majority2 ob=new majority2();
             List<Integer> ans = ob.majorityElementTwo(num);
                  
        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
           }
    

           