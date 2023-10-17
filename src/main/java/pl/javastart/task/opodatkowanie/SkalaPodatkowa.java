package pl.javastart.task.opodatkowanie;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final double KWOTA_PIERWSZEGO_PROGU = 10000;
    private static final double KWOTA_DRUGIEGO_PROGU = 100000;
    private static final double PIERWSZY_PROG_PODATKOWY = 0.18;
    private static final double DRUGI_PROG_PODATKOWY = 0.32;
    private static final double TAX_FREE = 0;

    private final String formaOpodatkowania = "Skala podatkowa";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;

        if (dochody < KWOTA_PIERWSZEGO_PROGU) {
            return TAX_FREE;
        } else if (dochody >= KWOTA_PIERWSZEGO_PROGU && dochody < KWOTA_DRUGIEGO_PROGU) {
            return PIERWSZY_PROG_PODATKOWY * dochody;
        } else {
            return DRUGI_PROG_PODATKOWY * dochody;
        }
    }

    @Override
    public String podajFormeOpodatkowania() {
        return formaOpodatkowania;
    }
}
