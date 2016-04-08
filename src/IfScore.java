/**
 * Created by xufangchao on 2016/4/8.
 */
//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

import java.util.Scanner;

public class IfScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学习成绩：");
        int score = in.nextInt();
        if (score >= 90) {
            System.out.print("A");
        } else if (score >= 60) {
            System.out.print("B");
        } else {
            System.out.print("C");
        }
    }
}
