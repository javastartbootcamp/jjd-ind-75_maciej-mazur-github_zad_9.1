package pl.javastart.task.opodatkowanie;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double PODATEK_LINIOWY = 0.19;

    private final String formaOpodatkowania = "Podatek liniowy";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;
        return dochody * PODATEK_LINIOWY;
    }

    @Override
    public String podajFormeOpodatkowania() {
        return formaOpodatkowania;
    }
}
