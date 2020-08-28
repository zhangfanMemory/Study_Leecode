/**
 * 农场有n只鸡鸭排为一个队伍，鸡用“C”表示，鸭用“D”表示。当鸡鸭挨着时会产生矛盾。需要对所排的队伍进行调整，使鸡鸭各在一边。
 * 每次调整只能让相邻的鸡和鸭交换位置，现在需要尽快完成队伍调整，你需要计算出最少需要调整多少次可以让上述情况最少。
 * 例如：CCDCC->CCCDC->CCCCD这样就能使之前的两处鸡鸭相邻变为一处鸡鸭相邻，需要调整队形两次。
 */
public class bishi8_28 {
    public static int num = 0;
    public static void main(String[] args) {
/*        *//**
         * 冒泡
         *//*
        char a [] = {'C','D','D','D','C'};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    num++;
                    char tm = a[i];
                    a[i] = a[j];
                    a[j] = tm;
                }
            }
        }*/
        String b [] = {"C","C","D","D","C"};
        System.out.println(Math.min(movetoleft(b,"C"), movetoleft(b,"D")));
    }

    public static int movetoleft(String[]a,String type){
        int sum = 0;
        int other = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i].equals(type)){
                if (other>0){
                    sum+=other;
                }
            }else {
                other++;
            }
        }
             return sum;
    }
}
