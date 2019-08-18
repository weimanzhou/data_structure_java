package xyz.snowflake.ch1.ex16;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-08-18 16:45
 */
public class Ex16 {

    public static void main(String[] args) {
        new Ex16().permute("abc");
    }

    public void permute(String str) {
        permute(str.toCharArray(), 0, str.length() - 1, new StringBuilder());
    }

    /**
     * 输出 str 的全部组合
     *
     *
     * @param str   字符数组
     * @param low   起始下标
     * @param high  终止下标
     */
    private void permute(char[] str, int low, int high, StringBuilder sb) {
        if (high - low >= 1) {

            permute(str, low, high - 1, sb);
        } else {
            System.out.print(str[low]);
        }
    }


}
