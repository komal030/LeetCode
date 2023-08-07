class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalgas = 0, totalcost = 0;
        for (int i = 0; i < n; i++) {
            totalcost += cost[i];
            totalgas += gas[i];
        }
        if (totalgas < totalcost)
            return -1;
        int diff = 0;
        int v = 0,i;
        for (i = 0; i < n; i++) {
            int t = gas[i] - cost[i];
            diff += t;
            if (diff < 0) {
                v = i + 1;
                diff = 0;
            }
        }
        if (i == n)
            return v;
        else
            return -1;
    }
}
