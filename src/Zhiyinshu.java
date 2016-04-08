/**
 * Created by xufangchao on 2016/4/7.
 */
//将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。

import java.util.Scanner;

public class Zhiyinshu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = in.nextInt();
        int k = 2;
        System.out.print(num + "=");
        while (num > k) {
            if (num % k == 0) {
                System.out.print(k + "×");
                num = num / k;
            }
            if (num % k != 0) {
                k++;
            }
        }
        System.out.print(k);//最后一个乘数
    }
}
