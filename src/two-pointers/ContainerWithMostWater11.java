public static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
        int currHeight = Math.min(height[left],height[right]);

        int currentArea = currHeight * (right - left);

        maxWater = Math.max(currentArea,maxWater);

        if(height[left] <= height[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return maxWater;
    }

public static void main (String args[]){
  int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
  System.out.println(maxArea(heights));
}
