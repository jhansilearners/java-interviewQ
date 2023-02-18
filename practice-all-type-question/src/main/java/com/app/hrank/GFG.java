package com.app.hrank;

//Java Implementation of above approach
import java.util.*;

class GFG {

 // function to find minimum increment required
 static int minIncrementForUnique(int[] A)
 {
     // collect frequency of each element
     TreeMap<Integer, Integer> dict
         = new TreeMap<Integer, Integer>();
     HashSet<Integer> used = new HashSet<Integer>();

   // Load Frequency Map (Element -> Count) and Used Set
     for (int i : A) {
         if (dict.containsKey(i))
             dict.put(i, dict.get(i) + 1);
         else {
             dict.put(i, 1);
             used.add(i);
         }
     }

     int maxUsed = 0; // Works for +ve numbers
     int ans = 0;

     for (Map.Entry<Integer, Integer> entry :
          dict.entrySet()) {

         int value = entry.getKey();
         int freq = entry.getValue();

         if (freq <= 1) //If not a duplicate, skip
             continue;

         int duplicates = freq - 1; // Number of duplicates 1 less than count
        
       // Start with next best option for this duplicate:
       // CurNum + 1 or an earlier maximum number that has been used
         int cur = Math.max(value + 1, maxUsed);
         while (duplicates > 0) {
             if (!used.contains(cur)) {
                 ans += cur - value; // Number of increments = Available Spot - Duplicate Value
                 used.add(cur);
                 duplicates--;
                 maxUsed = cur;
             }
             cur++;
         }
     }

     // return answer
     return ans;
 }

 // Driver code

 public static void main(String[] args)
 {
     int[] A = {6,2,3,5,6,3}; //{ 3, 2, 1, 2, 1, 2, 6, 7 };
     System.out.println(Arrays.toString(A));
     System.out.print(minIncrementForUnique(A));
 }
}