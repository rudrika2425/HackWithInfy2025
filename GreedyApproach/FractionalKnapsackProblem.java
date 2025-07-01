package GreedyApproach;
import java.util.*;
class FractionalKnapsackProblem {
    public int maximumUnits(int[][] arr, int truckSize) {
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int boxCount=arr[i][0];
            int unitsPerBox=arr[i][1];

            if (truckSize>=boxCount) {
                ans+=boxCount*unitsPerBox;
                truckSize-=boxCount;
            } else {
                ans+=truckSize*unitsPerBox;
                break;
            }
        }

        return ans;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pairs[][]=new int[n][2];
        for(int i=0;i<pairs.length;i++){
            pairs[i][0]=sc.nextInt();
            pairs[i][1]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=maximumUnits(arr,k);
        System.out.println(ans);
    }
}

