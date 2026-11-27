import java.util.*;

class Solution {

    private void DFS(int source, ArrayList<ArrayList<Integer>> ad, boolean[] arr)
    {
        arr[source] = true;

        for(int i = 0; i < ad.get(source).size(); i++)
        {
            int val = ad.get(source).get(i);

            if(!arr[val])
            {
                DFS(val, ad, arr);
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[] arr = new boolean[n];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        DFS(source, adj, arr);

        return arr[destination];
    }
}
