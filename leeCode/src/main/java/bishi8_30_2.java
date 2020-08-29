import java.util.List;
import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/336d00e600f8496287d0d472678da774?answerType=1&f=discussion
 * 来源：牛客网
 *
 * 小招喵喜欢吃喵粮。这里有 N 堆喵粮，第 i 堆中有 p[i] 粒喵粮。喵主人离开了，将在 H 小时后回来。
 *
 * 小招喵可以决定她吃喵粮的速度 K （单位：粒/小时）。每个小时，她将会选择一堆喵粮，从中吃掉 K 粒。如果这堆喵粮少于 K 粒，她将吃掉这堆的所有喵粮，然后这一小时内不会再吃更多的喵粮。
 *
 * 小招喵喜欢慢慢吃，但仍然想在喵主人回来前吃掉所有的喵粮。
 *
 * 返回她可以在 H 小时内吃掉所有喵粮的最小速度 K（K 为整数）。
 */
public class bishi8_30_2 {
    public static void main(String[] args) {

/*        *//**
         * 笔试输入法
         *//*
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int h = Integer.parseInt(sc.nextLine());
        int[] data = new int[s.length];*/

        int liangshi [] = {3,6,7,11};
        int hour = 8;
        // todo 二分查找
        int max = 0;
        int min = 0;
        int mid =0;
        int sum =0;

        for (int i = 0; i < liangshi.length; i++) {
            max=Math.max(max,liangshi[i]);//理论最大速度
            sum +=liangshi[i];
        }
        min = (sum%hour==0) ? sum/hour : sum/hour+1;//理论最小速度
        while (min <max){
            mid = (max+min)/2;
            if (vertify(liangshi,liangshi.length,mid,hour)){
                max = mid;
            }else {
                min = mid+1;
            }
            if (vertify(liangshi,liangshi.length,min,hour)){
                //todo 如果最小的速度小于用的时间小于需要的时间，时间符合
                System.out.println(min);
                break;
            }
        }

    }

    private static boolean vertify(int[] liangshi, int length, int mid, int hour) {
        int res = 0;
        for (int i = 0; i < length; i++) {
            res += (liangshi[i]/mid==0) ? liangshi[i]/mid : liangshi[i]/mid+1;
        }
        return res<=hour;//todo 需要8小时，结果三小时吃完，速度可以更小，二分树向左找
    }
}
