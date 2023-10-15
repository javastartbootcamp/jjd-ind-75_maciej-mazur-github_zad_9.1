package pl.javastart.task.firma;

import pl.javastart.task.opodatkowanie.*;

import java.util.Arrays;

public class Firma {

    private static final int ILOSC_ELEMENTOW_TABLICY = 10;

    private final String nazwa;
    private final FormaOpodatkowania formaOpodatkowania;

    private OperacjaFinansowa[] przychody = new OperacjaFinansowa[ILOSC_ELEMENTOW_TABLICY];
    private OperacjaFinansowa[] wydatki = new OperacjaFinansowa[ILOSC_ELEMENTOW_TABLICY];
    private int aktualnaIloscPrzychodow = 0;
    private int aktualnaIloscWydatkow = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getTaxForm());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);

        double kwotaBazowa;

        if (formaOpodatkowania instanceof NaCzarno || formaOpodatkowania instanceof RyczaltEwidencjonowany) {
            kwotaBazowa = sumaPrzychodow;
        } else {
            kwotaBazowa = sumaPrzychodow - sumaWydatkow;
        }

        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(kwotaBazowa));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double suma = 0;

        for (int i = 0; i < aktualnaIloscWydatkow; i++) {
            suma += wydatki[i].getKwota();
        }

        return suma;
    }

    private double zsumujPrzychody() {
        double suma = 0;

        for (int i = 0; i < aktualnaIloscPrzychodow; i++) {
            suma += przychody[i].getKwota();
        }

        return suma;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        if (aktualnaIloscPrzychodow >= przychody.length) {
            poszerzTablice(przychody);
        }

        przychody[aktualnaIloscPrzychodow++] = new OperacjaFinansowa(nazwa, wartosc);
    }

    private void poszerzTablice(OperacjaFinansowa[] tablica) {
        tablica = Arrays.copyOf(tablica, tablica.length);
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        if (aktualnaIloscWydatkow >= wydatki.length) {
            poszerzTablice(wydatki);
        }

        wydatki[aktualnaIloscWydatkow++] = new OperacjaFinansowa(nazwa, wartosc);
    }
}
