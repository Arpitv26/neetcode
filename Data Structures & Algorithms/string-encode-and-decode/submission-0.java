class Solution {

    public String encode(List<String> strs) {
        String encString = "";

        for (String s : strs){
            int l = s.length();
            encString = encString + l + "#" + s;
        }
        return encString;
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            // find where the # is
            while (str.charAt(j) != '#') {
                j++;
            }

            // length is from i up to j, not including j
            int x = Integer.parseInt(str.substring(i, j));

            // actual word starts after #
            String word = str.substring(j + 1, j + 1 + x);

            list.add(word);

            // move i to the start of the next encoded string
            i = j + 1 + x;
        }

        return list;
    }
}
