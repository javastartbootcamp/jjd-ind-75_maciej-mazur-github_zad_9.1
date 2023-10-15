package pl.javastart.task.opodatkowanie;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private final String taxForm = "Ryczałt ewidencjonowany";

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.15;
    }

    @Override
    public String getTaxForm() {
        return taxForm;
    }
}
