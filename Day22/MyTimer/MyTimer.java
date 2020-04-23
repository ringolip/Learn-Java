package ringo.day22.MyTimer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 16:03
 */
public class MyTimer {

    public static void main(String[] args) {
        // 创建Timer对象
        Timer timer = new Timer();


        timer.schedule(new MyTimerTask(timer), 3000, 2000);


    }


    static class MyTimerTask extends TimerTask {

        private Timer t;

        public MyTimerTask() {
        }

        public MyTimerTask(Timer t) {
            this.t = t;
        }

        @Override
        public void run() {
            // 实现任务
            System.out.println("开始任务");
            for (int i = 0; i < 10; i++) {
                System.out.println("开始：" + i);
            }
        }
    }

}
