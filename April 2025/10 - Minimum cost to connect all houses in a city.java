class Solution {

    public int minCost(int[][] houses) {
        // code here
        int n = houses.length;
        List<Edge> edges = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int cost = Math.abs(houses[i][0] - houses[j][0]) + Math.abs(houses[i][1] - houses[j][1]);
                edges.add(new Edge(i, j, cost));
            }
        }
        
        Collections.sort(edges, (a, b) -> a.cost - b.cost);
        
        UnionFind uf = new UnionFind(n);
        int totalCost = 0;
        
        for(Edge edge : edges){
            if(uf.union(edge.u, edge.v)){
                totalCost += edge.cost;
            }
        }
        
        return totalCost;
    }
    
    class Edge{
        int u, v, cost;
        Edge(int u, int v, int cost){
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }
    
    class UnionFind{
        int[] parent, rank;
        
        UnionFind(int n){
            parent = new int[n];
            rank = new int[n];
            
            for(int i=0; i<n; i++){
                parent[i] = i;
                rank[i] = 0;
            }
        }
        
        int find(int u){
            if(parent[u] != u){
                parent[u] = find(parent[u]);
            }
            
            return parent[u];
        }
        
        boolean union(int u, int v){
            int rootU = find(u);
            int rootV = find(v);
            
            if(rootU !=  rootV){
                if(rank[rootU] > rank[rootV]){
                    parent[rootV] = rootU;
                }else if(rank[rootU] < rank[rootV]){
                    parent[rootU] = rootV;
                }else{
                    parent[rootV] = rootU;
                    rank[rootU]++;
                }
                
                return true;
            }
            
            return false;
        }
    }
}
