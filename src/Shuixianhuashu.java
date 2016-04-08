/**
 * Created by xufangchao on 2016/4/7.
 */
//打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个“水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方。
public class Shuixianhuashu {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            int a=i%10;
            int b=i%100/10;
            int c=i/100;
            if(i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
                System.out.println(i);
            }
        }
    }
}
