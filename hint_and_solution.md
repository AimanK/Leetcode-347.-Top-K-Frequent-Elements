
HINT:
- Initialize a HashMap<Integer, Integer> to store each number as the Key, and the count as the Value (getOrDefault method)
- Initialize a PriorityQueue<Integer max heap to store the keys from our HashMap in descending order
- Create an int[] res array to store the top K values from the max heap.




SOLUTION:
- Initialize a HashMap<Integer, Integer>
-  Using a for each loop, loop through each element in nums and add it to 
- Initialize a PriorirtyQueue<Integer> that is made to be a max heap using our hashmap as its nodes.
- Using another for each loop, we will this type loop through each key in the hashmap by using hmap.keySet().
 
