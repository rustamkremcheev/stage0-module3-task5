package lang.print.gaps.task5;

public class TimeConvertor {

    public final float secondCount = 60.0F;

    public void convert(float minutes) {
        float count = minutes * secondCount;
        System.out.println(count);
    }
}
