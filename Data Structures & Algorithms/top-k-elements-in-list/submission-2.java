class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        /**
        nums = [1,2,2,3,3,3]
        k=2
        1=>1
        2=>2
        3=>3
        [2, 3] [3, 2]
        []
        1=>1
        2=>1
        2=>2
        3=>1
        3=>2
        3=>3
        [2, 3]
        
        */

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int num: nums){

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        //declare queue and its condition

        Queue<Integer> heap= new PriorityQueue<>(
            (a, b)-> Integer.compare(map.get(a), map.get(b))
        );

        //for loop add values to the queueu
        for(int n: map.keySet()){
             
             heap.add(n);

             if(heap.size()>k){
                heap.poll();
             }

        }

        int[] ans= new int[k];

      

        for(int i=0 ; i<k; i++){

            ans[i]=heap.poll();
        }

        return ans;


    }
}
