package anotherImplement;


public class AnotherOfficer implements MyCallBackListner {

    private AnotherHelper helper = new AnotherHelper(this);

    @Override
    public void noticeFinish() {
        System.out.println(" i  am the officer who need your help !");
    }

    @Override
    public void noticeThreadFinish(int i) {
        System.out.println("after thread calculate the result is " + i);
    }

    public void doTheThreadJob() {
        helper.doTheThreadJob();
        System.out.println("i am doing another things but i don't have to wait for the reuslt");
    }

}
