import anotherImplement.MyCallBackListner;

public class Helper  {
    public void helpDoThatThing(MyCallBackListner listner){
        System.out.println("i am help him to finish the thing");
        listner.noticeFinish();
    }
}
