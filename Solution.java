class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiop";
        a += a.toUpperCase();
        String b = "asdfghjkl";
        b += b.toUpperCase();
        String c = "zxcvbnm";
        c += c.toUpperCase();
        List<String> temp = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            

            int j = 0;
            for(j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(!a.contains(ch+"")){
                    break;
                }
            }
            if(j == words[i].length()){
                temp.add(words[i]);
                continue;
            }

            for(j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(!b.contains(ch+"")){
                    break;
                }
            }
            if(j == words[i].length()){
                temp.add(words[i]);
                continue;
            }

            for(j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(!c.contains(ch+"")){
                    break;
                }
            }
            if(j == words[i].length()){
                temp.add(words[i]);
                continue;
            }
        }
        String[] out = new String[temp.size()];
        for(int i=0; i<temp.size(); i++){
            out[i] = temp.get(i);
        }
        return out;
    }
}
