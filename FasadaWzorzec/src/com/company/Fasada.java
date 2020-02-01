package com.company;

public class Fasada {
    private APINowyYork nowyYork;
    private APILondyn londyn;
    private APISingapur singapur;
    public Fasada(){
        nowyYork = new APINowyYork();
        londyn = new APILondyn();
        singapur = new APISingapur();
    }
    public void OblicRyzyko(String code, Integer days)
    {
        float srednieRyzyko=0;
        float sumaRyzyk=0;
        float liczbaPomiarow=0;
        Integer months=0;
        if (days>30)
            months = 2;
        else
            months = 1;
        float ryzykoNowyYork = nowyYork.companyTrustworthy(code, months);
        float ryzykoLondyn = londyn.getRisk(code, days);
        float ryzykoSingapur = londyn.getRisk(code, days);
        System.out.println("================Kalkulacja ryzyka================");
        // NOWY YORK
        if (ryzykoNowyYork!=-1) {
            System.out.println("Ryzyko Nowy York:   " + ryzykoNowyYork);
            sumaRyzyk = sumaRyzyk + ryzykoNowyYork;
            liczbaPomiarow++;
        }
        else{
            System.out.println("Dana firma nie wystepuje na gieldzie Nowy York");
        }
        // LONDYN
        if (ryzykoLondyn!=-1) {
            System.out.println("Ryzyko Londyn:      " + ryzykoLondyn);
            sumaRyzyk = sumaRyzyk + ryzykoLondyn;
            liczbaPomiarow++;
        }
        else{
            System.out.println("Dana firma nie wystepuje na gieldzie Londyn");
        }
        // SINGAPUR
        if (ryzykoSingapur!=-1) {
            System.out.println("Ryzyko Singapur:    " + ryzykoSingapur);
            sumaRyzyk += ryzykoSingapur;
            liczbaPomiarow++;
        }
        else{
            System.out.println("Dana firma nie wystepuje na gieldzie Singapur");
        }

        srednieRyzyko=sumaRyzyk/liczbaPomiarow;
        System.out.println("Srednie ryzyko dla firmy " + code + " to "+srednieRyzyko+ "%");
    }
}
