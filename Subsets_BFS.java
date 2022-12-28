class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();

        //add the empty set
        resList.add(new ArrayList<>());

        //Using BFS Approach
        for(int num: nums) { //O(n)
            int n = resList.size(); // use this to copy and add new elements to make unique set
            for(int i = 0; i < n; i++) { //O(2^n)
                List<Integer> copyList = new ArrayList<>(resList.get(i)); 
                copyList.add(num);
                resList.add(copyList);
            }
        }

        return resList; //O(n2^n)
        
    }
}
