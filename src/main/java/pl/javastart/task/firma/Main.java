package pl.javastart.task.firma;

import pl.javastart.task.opodatkowanie.NaCzarno;
import pl.javastart.task.opodatkowanie.PodatekLiniowy;
import pl.javastart.task.opodatkowanie.RyczaltEwidencjonowany;
import pl.javastart.task.opodatkowanie.SkalaPodatkowa;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma warzywniakKowalski = new Firma("Karol Kowalski Warzywa i owoce", new SkalaPodatkowa());

        //warzywniakKowalski.dodajPrzychod("Handel", 9500);
        //warzywniakKowalski.dodajPrzychod("Handel", 13000);
        warzywniakKowalski.dodajPrzychod("Handel", 120000);
        warzywniakKowalski.dodajWydatek("Pensja dla ekspedientki", 2000);

        warzywniakKowalski.wyswietlPodsumowanie();

        Firma kominiarz = new Firma("Czyszczenie i naprawa kominów", new PodatekLiniowy());

        kominiarz.dodajPrzychod("Naprawa komina ciepłowni", 100000);
        kominiarz.dodajWydatek("Liny zabezpieczające", 2000);

        kominiarz.wyswietlPodsumowanie();
    }

}
