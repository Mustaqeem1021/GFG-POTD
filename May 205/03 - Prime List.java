class Solution {
    Node primeList(Node head) {
        // code here
        Node res = new Node(0);
        Node temp = res;
        
        while(head != null){
            int leftPrime = getLeftPrime(head.val);
            int rightPrime = getRightPrime(head.val  + 1);
            //System.out.println(leftPrime +" " + rightPrime);
            if((Math.abs(head.val - leftPrime) <= Math.abs(head.val - rightPrime))){
                temp.next = new Node(leftPrime);
                temp = temp.next;
            }else{
                temp.next = new Node(rightPrime);
                temp = temp.next;
            }
            head = head.next;
        }
        return res.next;
        
        
    }
    int getLeftPrime(int n){
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(prime[i]){
                for(int j=i*i; j<=n; j += i){
                    prime[j] = false;
                }
            }
        }
        for(int i=n; i>=0; i--){
            if(prime[i])return i;
        }
        return -1;
    }
    int getRightPrime(int n){
        
        while(true){
            if(isPrime(n)) return n;
            n++;
        }
    }
    private boolean isPrime(int n ){
        for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0)return false;
            }
            return true;
    }
}
