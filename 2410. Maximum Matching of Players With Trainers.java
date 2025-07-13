class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int res=0,i=0,j=0,p=players.length,t=trainers.length;
        Arrays.sort(players); Arrays.sort(trainers);
        while(i<p && j<t){
            if(players[i]<=trainers[j]){
                res++;
                i++;
                j++;
            }else if(players[i]>trainers[j]){
                j++;
            }
        }
        return res;
    }
}