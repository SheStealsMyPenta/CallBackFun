package anotherImplement;

public class AnotherHelper {
    private MyCallBackListner listner;
    public AnotherHelper(MyCallBackListner listner){
        this.listner = listner;
    }
    public void doSomeThing(){
        System.out.println("i can  help any one who implement listener");
        listner.noticeFinish();
     }

    public void doTheThreadJob() {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(10000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               int i = 0 ;
               while(i<100){
                   i++;
               }
               listner.noticeThreadFinish(i);
           }
       };
       new Thread(runnable).start();
    }
}
