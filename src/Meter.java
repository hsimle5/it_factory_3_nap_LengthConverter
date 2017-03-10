/**
 * Created by soma on 2017.03.10..
 */
public class Meter extends BaseLength{





    public Meter(double value) {
        this.value = value;
    }

    public Meter(Meter meter){
        this.value=meter.value;
    }


    @Override
    public Meter toMeter() {
        return this;
    }



    @Override
    public String toString(){
        return String.valueOf(value) + " m";
    }
}
