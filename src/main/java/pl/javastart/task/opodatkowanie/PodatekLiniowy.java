package pl.javastart.task.opodatkowanie;

public class PodatekLiniowy extends FormaOpodatkowania {
    private final String taxForm = "Podatek liniowy";

    @Override
    public double wyliczPodatek(double dochody) {
        return dochody * 0.19;
    }

    @Override
    public String getTaxForm() {
        return taxForm;
    }
}
