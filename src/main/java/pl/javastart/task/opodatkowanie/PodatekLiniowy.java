package pl.javastart.task.opodatkowanie;

public class PodatekLiniowy extends FormaOpodatkowania {
    private final String taxForm = "Podatek liniowy";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;
        return dochody * 0.19;
    }

    @Override
    public String podajFormeOpodatkowania() {
        return taxForm;
    }
}
