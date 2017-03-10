/**
 * Created by soma on 2017.03.10..
 */
public class Inch extends BaseLength {


    public static final double ONE_INCH_IN_METERS = 0.0254;

    public Inch(double value) {
        this.value = value;
    }

    public Inch(Meter meter) {
        this.value = meter.getValue()/ ONE_INCH_IN_METERS;
    }

    @Override
    public Meter toMeter() {
        return new Meter(value* ONE_INCH_IN_METERS);
    }



    @Override
    public String toString(){
        return String.valueOf(value) + " inches";
    }
}
