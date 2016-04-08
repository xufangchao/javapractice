/**
 * Created by xufangchao on 2016/4/8.
 */
//随机生成[1,20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），并判断两种方法的效率和分布。

import java.util.Random;

public class Suijishu {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            Random in = new Random();
            int num = in.nextInt(20)+ 1;
            System.out.println(num);
        }
        for (int i = 1; i <= 1000; i++) {
            int num=(int)(Math.random()*20)+1;
            System.out.println(num);
        }
    }
}
