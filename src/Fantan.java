/**
 * Created by xufangchao on 2016/4/8.
 */
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class Fantan {
    public static void main(String[] args) {
        double length = 0;
        double high = 100;
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                length = length + high;
                high = high / 2;
            }
            if (i > 1) {
                length = length + high * 2;
                high = high / 2;
            }
        }
        System.out.println(length);
        System.out.println(high);
    }
}
