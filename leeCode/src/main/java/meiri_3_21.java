public class meiri_3_21 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 4;
        boolean result = canMeasureWater( x,  y,  z);
        System.out.println(result);
    }

    private static boolean canMeasureWater(int x, int y, int z) {
        if (z == x || z == y){
            return true;
        }
        if (z>x && z%x==0){
            return true;
        }
        if (z>y && z%y == 0){
            return true;
        }
        if (z>x&&z>y){
            if (z>x+y&&z%(x+y)==0){
                return true;
            }
            int a = x-y>0?x-y:y-x;
            if (z>a&&z%a==0){
                return true;
            }
        }
        return false;

    }
}
