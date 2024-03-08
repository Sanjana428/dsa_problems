//Nair is given an array of numbers. All numbers occur twice in the array except one number. Nair has been assigned the task to find that number occurring only once.//

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=scn.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
          ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
