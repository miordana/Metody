package homework4;

public class Zoo {
    public static void main(String[] args) {
        int bears = 6;
        int tigers = 15;
        int parrots = 21;
        int elephants = 8;
        int raccoons = 29;
        int porcupines = 11;

        int allAnimals = bears + tigers + parrots + elephants + raccoons + porcupines;

        double a = 0.3;
        double b = 0.2;
        double c = 0.4;
        double d = 0.05;
        double x = 0.8;
        double z = 0.15;

        int bearsNextYear = (int) (bears * a);
        int tigersNextYear = (int) (tigers * b);
        int parrotsNextYear = (int) (parrots * c);
        int elephantsNextYear = (int) (elephants * d);
        int raccoonsNextYear = (int) (raccoons * x);
        int porcupinesNextYear = (int) (porcupines * z);

        int allAnimalsNextYear = bearsNextYear + tigersNextYear + parrotsNextYear + elephantsNextYear +
                raccoonsNextYear + porcupinesNextYear;


        System.out.println(" bears: " + bears + " tigers: " + tigers + " parrots: " + parrots +
                " elephants: " + elephants + " raccoons: " + raccoons + " porcupines: " + porcupines);

        System.out.println("allAnimals: " + allAnimals);

        System.out.println("bearsNextYear: " + bearsNextYear + " tigersNextYear: " + tigersNextYear +
                " parrotsNextYear: " + parrotsNextYear + " elephantsNextYear: " +
                elephantsNextYear + " raccoonsNextYear: " + raccoonsNextYear +
                " porcupinesNextYear: " + porcupinesNextYear);

        System.out.println("allAnimalsNextYear: " + allAnimalsNextYear);

    }

    public static void countAnimals(int allAnimals ) {

        System.out.println("allAnimals: " + allAnimals);
    }

    public static void countAnimalsNextYear(int allAnimalsNextYear) {

        System.out.println("allAnimalsNextYear: " + allAnimalsNextYear);

    }

}
