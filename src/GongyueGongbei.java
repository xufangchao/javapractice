/**
 * Created by xufangchao on 2016/4/8.
 */
//输入两个正整数m和n，求其最大公约数和最小公倍数。

import java.util.Scanner;

public class GongyueGongbei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入正整数m：");
        int m = in.nextInt();
        System.out.println("请输入正整数n：");
        int n = in.nextInt();
        int c = m * n;
        if (m < n) {
            int a = m;
            m = n;
            n = a;
        }
        if (m > n) {
            while (m % n != 0) {
                int b = m % n;
                m = n;
                n = b;
            }
            System.out.println("最大公约数是：" + n);
        }
        System.out.print("最大公倍数是：" + c / n);//公倍数就是两个数相乘除以最大公约数
    }
}
