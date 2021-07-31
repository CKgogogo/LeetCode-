package Solution;

public class Solution171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int ans = 0;
        for(int i = 0;i < length;i++){
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' +1);
        }
        return ans;
    }
}
