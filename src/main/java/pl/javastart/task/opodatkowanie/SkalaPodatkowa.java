package pl.javastart.task.opodatkowanie;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private final String taxForm = "Skala podatkowa";

    @Override
    public double wyliczPodatek(double dochody) {
        if (dochody < 10000) {
            return 0;
        } else if (dochody >= 10000 && dochody < 100000) {
            return 0.18 * dochody;
        } else {
            return 0.32 * dochody;
        }
    }

    @Override
    public String getTaxForm() {
        return taxForm;
    }
}
