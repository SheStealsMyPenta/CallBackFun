import anotherImplement.MyCallBackListner;

public class Officer implements MyCallBackListner {

    private Helper helper = new Helper();
    public void finishThatTask(){
        helper.helpDoThatThing(this);
    }
    @Override
    public void noticeFinish() {
        System.out.println("Done!");
    }

    @Override
    public void noticeThreadFinish(int i) {

    }
}
