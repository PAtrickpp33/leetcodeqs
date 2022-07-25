class Solution {
    public String removeDuplicates(String s) {
        int left = 0;
        int right = 0;
        int length = s.length();
        char[] chars = s.toCharArray();
        while (right < length) {
            chars[left] = chars[right];
            if (left > 0 && chars[left - 1] == chars[left])
                left -= 2;
            ++right;
            ++left;
        }
        return new String(chars, 0, left);
    }

    }