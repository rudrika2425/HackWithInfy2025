package GreedyApproach;
import java.util.*;
class Pair{
        int s;
        int e;
        public Pair(int s,int e){
            this.s=s;
            this.e=e;
        }
    }
public class ActivitySelectionProblem {
    
    public static int findLongestChain(int[][] pairs) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.e-b.e);
        for(int i=0;i<pairs.length;i++){
            pq.add(new Pair(pairs[i][0],pairs[i][1]));
        }
        Pair curr=pq.poll();
        int count=1;
        int st=curr.s;
        int et=curr.e;
        while(!pq.isEmpty()){
            System.out.println(st+" "+et);
            Pair temp=pq.poll();
            if(temp.s>et){
                count++;
                st=temp.s;
                et=temp.e;
            }
        }
        
        return count;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pairs[][]=new int[n][2];
        for(int i=0;i<pairs.length;i++){
            pairs[i][0]=sc.nextInt();
            pairs[i][1]=sc.nextInt();
        }
        int ans=findLongestChain(pairs);
        System.out.println(ans);
    }
}