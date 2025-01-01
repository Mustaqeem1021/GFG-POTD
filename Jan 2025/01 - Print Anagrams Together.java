public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s: arr) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.computeIfAbsent(sorted, k -> new ArrayList<String>()).add(s);
        }
        
        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            ArrayList<String> l = entry.getValue();
            ans.add(l);
        }
        
        return ans;
    }

