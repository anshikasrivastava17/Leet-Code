class Solution {
    public int kthFactor(int n, int k) {
    List<Integer> list = factors(n);
      
        if (list.size() < k) 
            return -1; 
        
        return list.get(k - 1); 
    }

    List<Integer> factors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)   
                    list.add(i);
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);  
        return list;
        }
}
