package cone.demo01;


/*
* 要求 1.创建两个线程 线程的名字分别为网店1 和网店2 主线程为的线程名更改为 主网店
* 2. 3个网店分别卖100个乒乓球没卖出一个打印正在卖出第几个
    3.主网点一旦卖完其他两个网店就停止销售
 */
public class demo01 {
    public static void main(String[] args) {
        Thread wd1 = new Thread(new runable(),"网店1");
        Thread wd2 = new Thread(new runable(),"网店2");
        Thread.currentThread().setName("主网店");
        wd1.setDaemon(true);
        wd2.setDaemon(true);
        wd1.start();
        wd2.start();
        for (int i = 1; i < 51; i++) {
            System.out.println( Thread.currentThread().getName()+"当前已卖出"+i+"个");
        }
    }
}
