public class rettangolo {

        double altezza;
        double larghezza;

        public rettangolo(double altezza, double larghezza) {
            this.altezza=altezza;
            this.larghezza=larghezza;
        }

        public double calcolaPerimetro() {
            return (larghezza + altezza) * 2;
        }
        public double calcolaArea() {
            return larghezza * altezza;
        }
        public static void stampaRettangolo(rettangolo rettangolo) {

            System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcolaPerimetro());
            System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        }
        public static void stampaDueRettangoli(rettangolo r1, rettangolo r2) {

            System.out.println("Il perimetro del rettangolo è: " + r1.calcolaPerimetro());
            System.out.println("L'area del rettangolo è: " + r1.calcolaArea());
            System.out.println("Il perimetro del rettangolo è: " + r2.calcolaPerimetro());
            System.out.println("L'area del rettangolo è: " + r2.calcolaArea());
            System.out.println("La somma dei perimetri dei due rettangoli è: " +r1.calcolaPerimetro()+r2.calcolaPerimetro());
            System.out.println("La somma delle aree dei due rettangoli è: " +r1.calcolaArea()+r2.calcolaArea());

        }
    }
