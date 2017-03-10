/**
 * Created by soma on 2017.03.10..
 */
public class Program {
    public static void main(String[] args) {
        System.out.println(new Inch(new Meter(1)));
        System.out.println(new Inch(new Foot(1).toMeter()));
    }
}
