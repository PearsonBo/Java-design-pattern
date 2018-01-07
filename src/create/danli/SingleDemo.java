package create.danli;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class SingleDemo {

    public static void main(String[] args) {
        NumThread threadA = new NumThread("ThreadA");
        NumThread threadB = new NumThread("ThreadB");
        threadA.start();
        threadB.start();

    }

    private static class NumThread extends Thread {
        private String threadName;

        public NumThread(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            GlobalNum gn = GlobalNum.getInstance();

            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + "第" + gn.getNum() + "次访问！");
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
