/**
 * Created by xufangchao on 2016/4/7.
 */
public class Sushu {
    public static void main(String[] args) {
        for (int i=101;i<=200;i+=2){
            for(int j=2;j<=i/2+1;j++){
                if(i%j==0){
                    break;
                }
                if(j==i/2+1){
                    System.out.println(i);
                }
            }
        }
    }
}