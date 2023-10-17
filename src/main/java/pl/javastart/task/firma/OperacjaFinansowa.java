package pl.javastart.task.firma;

class OperacjaFinansowa {
    private final String nazwa;
    private final double kwota;

    OperacjaFinansowa(String nazwa, double kwota) {
        this.nazwa = nazwa;
        this.kwota = kwota;
    }

    public double getKwota() {
        return kwota;
    }
}
