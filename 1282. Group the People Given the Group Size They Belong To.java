class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        ArrayList<List<Integer>> list =  new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        for(int i = 0 ; i < groupSizes.length; i++){
            if(hm.containsKey(groupSizes[i])){
                hm.get(groupSizes[i]).add(i);
            }
            else{
            	ArrayList<Integer> newL = new ArrayList<>();
            	newL.add(i);
                hm.put(groupSizes[i], newL);      
            }

            if(hm.get(groupSizes[i]).size() == groupSizes[i]){
                list.add(hm.get(groupSizes[i]));
                hm.remove(groupSizes[i]);
            }
        }
            
        return list;
    }
}
// UP-VOTE IF HELPFUL