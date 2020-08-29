/**
 * [编程题]比特币最佳买卖时机
 *
 * 给定一个正整数数组，它的第 i 个元素是比特币第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入比特币前卖出。
 */
public class bishi8_30 {
    public static void main(String[] args) {
        int max = 0;
        int a [] = {0,7,1,5,6,4,7};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (max<a[j]-a[i]){
                    max = a[j] - a[i];
                }
            }
        }
        System.out.println(max);

    }
}
