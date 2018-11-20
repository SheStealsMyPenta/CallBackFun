import anotherImplement.AnotherHelper;
import anotherImplement.AnotherOfficer;
import anotherImplement.MyCallBackListner;

public class TestForCode {
    public static void main(String[] args) {
//        int[][] testArray = new int[4][3];
//        System.out.println(testArray[1].length);
//        Officer officer =new Officer();
//        officer.finishThatTask();
           AnotherHelper helper = new AnotherHelper(new MyCallBackListner() {
               @Override
               public void noticeFinish() {
                   System.out.println("ok, i am the one who need your help");
               }

               @Override
               public void noticeThreadFinish(int i) {

               }
           });
           AnotherOfficer officer =new AnotherOfficer();
//           AnotherHelper helper1 = new AnotherHelper(officer);
//           helper.doSomeThing();
//           helper1.doSomeThing();
           officer.doTheThreadJob();
        float v = mV_2_db(1.1f);
        System.out.println(v);

    }
    public static float mV_2_db(float fVal) {
        //0dB对应的dBuV值
        float BaseValue = 7;
        //放大倍数
        float K = 100;
        //偏移值
        float B = 0;

        if (0.0f != fVal) {
            fVal = (float) (20 * Math.log10((fVal - B) / K * 1000) - BaseValue);
        }
        return fVal;
    }
}




