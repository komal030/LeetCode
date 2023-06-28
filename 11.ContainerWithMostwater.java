class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            int d = ((r - l) * min);
            area = Math.max(area, d);
            if (height[l] < height[r])
            l++;
                    else
            r--;
        }
        return area;
    }
}
