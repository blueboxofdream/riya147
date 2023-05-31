class Solution {
    public int[] twoSum(int[] num, int target) {
        int sum=0,i,j;
        int arr[]=new int[2];
        for(i=0;i<num.length-1;i++)
        {
            for(j=i+1;j<num.length;j++)
            {
                sum=num[i]+num[j];
                if(sum==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    sum=0;
                    break;
                }
            }
        }
        return arr;
   }
}
