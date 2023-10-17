package pl.javastart.task.opodatkowanie;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private static final double RYCZALT_EWIDENCJOWANY = 0.15;

    private final String formaOpodatkowania = "Ryczałt ewidencjonowany";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * RYCZALT_EWIDENCJOWANY;
    }

    @Override
    public String podajFormeOpodatkowania() {
        return formaOpodatkowania;
    }
}
