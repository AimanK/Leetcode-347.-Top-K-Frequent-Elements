import java.util.*;

class Main {
  public static void main(String[] args) {

    /**

    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

    Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

    OUTPUT: Output: [1,2];

    **/
    
    int[] nums = {1,1,1,2,2,3};
    
    int k = 2;

    System.out.println(Arrays.toString(topKFrequent(nums, k)));

    /**
      OUTPUT: Output: [1,2]

      SOLUTION:
      - Initialize a HashMap<Integer, Integer>
      - Using a for each loop, loop through each element in nums and add it to 
      - Initialize a PriorirtyQueue<Integer> that is made to be a max heap using our hashmap as its nodes.
      - Using another for each loop, we will this type loop through each key in the hashmap by using hmap.keySet().
      - 

    */
  }


  public static int[] topKFrequent(int[] nums, int k) 
  {
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for (int num : nums)
        {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> hmap.get(b) - hmap.get(a));

        for (int key : hmap.keySet())
        {
            maxHeap.add(key);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
        {
            res[i] = maxHeap.poll();
        }
        
        return res;
        
    }
}