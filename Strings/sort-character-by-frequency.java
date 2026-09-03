class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) ->map.get(b)-map.get(a));
        StringBuilder res=new StringBuilder();
        for(char c:list){
            int freq=map.get(c);
            while(freq>0){
                res.append(c);
                freq--;
            }
        }
        return res.toString();
    }
}