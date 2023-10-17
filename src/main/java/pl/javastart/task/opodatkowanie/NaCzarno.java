package pl.javastart.task.opodatkowanie;

public class NaCzarno extends FormaOpodatkowania {
    private final String formaOpodatkowania = "Na czarno";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return 0;
    }

    @Override
    public String podajFormeOpodatkowania() {
        return formaOpodatkowania;
    }
}
