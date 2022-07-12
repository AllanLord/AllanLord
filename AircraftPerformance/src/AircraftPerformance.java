import java.util.Scanner;

public class AircraftPerformance {

    private double Ed; // 27
    private double Me; // 12
    private double Di; // 15
    private double Pes; // 85
    private double Est; // 1.65

    // INICIALIAZING VARIABLES FOR CASES B AND C
    private double p = 1.225;
    private double n = 46.6666;
    private double Dh = 1.65;
    private double Cto = 0.14;
    private double Ctd = 0.1;
    private double Cdt = 0.059;
    private double g = 9.81;
    private double h = 15.24;
    private double M = 0.045;
    private double CL = 0.72;

    public AircraftPerformance(double ed, double me, double di, double pes, double est) {
        Ed = ed;
        Me = me;
        Di = di;
        Pes = pes;
        Est = est;
    }

    public double getEd() {
        return Ed;
    }

    public double getMe() {
        return Me;
    }

    public double getDi() {
        return Di;
    }

    public double getPes() {
        return Pes;
    }

    public double getEst() {
        return Est;
    }

    // CASE A: AIRCRAFT PERFORMANCE
    double wingTaper() {
        return Ed / Pes;
    }

    double wingSurface() {
        return Ed;
    }

    double wingSpan() {
        return (Est) * 7;
    }

    double rootChord() {
        return (4 * (wingSurface())) / (Math.PI * (wingSpan()));
    }

    double tipChord() {
        return (wingTaper()) * (rootChord());
    }

    double meanAeroChord() {
        return (0.6) * (rootChord()) * ((Math.pow(wingTaper(), 2)) + (wingTaper()) + 1) / ((wingTaper()) + 1);
    }

    double elongation() {
        return (Math.pow((wingSpan()), 2)) / (wingSurface());

    }

    double leadingEdgAng() {
        return (Math.atan(((rootChord()) - (tipChord())) / ((wingSpan()) / 2)));
    }

    double convertToDegrees() {
        return leadingEdgAng() * (180 / Math.PI);
    }

    double oswaldFactor() {
        if (convertToDegrees() < 30) {
            return (1.78 * (1 - 0.045 * (Math.pow(elongation(), 0.68))) - 0.64);

        } else {
            return (4.61 * (1 - 0.045 * Math.pow(elongation(), 0.68)) * (Math.cos(Math.pow(convertToDegrees(), 0.15)))
                    - 3.1);
        }
    }

    double speed() {
        return (Ed) * 1.2;
    }

    double dynamicLift() {
        return (0.5 * (p) * (Math.pow(speed(), 2)) * (wingSurface()) * (CL));
    }

    // CASE B: TAKEOFF PERFORMANCE
    double weight() {
        return (Pes) * 20;
    }

    double newtonWeight() {
        return (weight() * (g));
    }

    double To() {
        return ((p) * (Math.pow(n, 2)) * (Math.pow(Dh, 4)) * Cto);
    }

    double Td() {
        return ((p) * (Math.pow(n, 2)) * (Math.pow(Dh, 4)) * Ctd);
    }

    double Dd() {
        return (((p) * (Math.pow(speed(), 2)) * (wingSurface()) * Cdt)) / (2);
    }

    double Ffo() {
        return ((M) * (newtonWeight()));
    }

    double Ffd() {
        return ((M) * ((newtonWeight()) - (dynamicLift())));
    }

    double Fo() {
        return ((To()) - (Ffo()));
    }

    double Fd() {
        return ((Td()) - (Dd()) - (Ffd()));
    }

    // CASE C: FLIGHT PERFORMANCE
    double ascendingAngle() {
        return ((Td()) - (Dd())) / (newtonWeight());
    }

    double angleToDegrees() {
        return ascendingAngle() * (180 / (Math.PI));
    }

    double ascendingRadius() {
        return ((Math.pow(speed(), 2))) / (0.44 * (g));
    }

    double St() {
        return ((ascendingRadius()) * (ascendingAngle()));
    }

    double hT() {
        return ((ascendingAngle()) * (St())) / (2);
    }

    double Sa() {
        return ((h) - (hT())) / (ascendingAngle());
    }

    double Fm() {
        return ((Fo()) - (Fd())) / Math.log((Fo()) / (Fd()));
    }

    double Sh() {
        return ((newtonWeight()) * (Math.pow(speed(), 2)) / (2 * (g) * (Fm())));
    }

    // SHOW MENU
    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===================================================");
            System.out.println("||                WELCOME ABOARD                 ||");
            System.out.println("===================================================");
            System.out.println("\n");
            System.out.println("===================================================");
            System.out.println("||           A: Aircraft Performance             ||");
            System.out.println("||            B: Takeoff Performance             ||");
            System.out.println("||             C: Flight Performance             ||");
            System.out.println("||                D: Flight Back!                ||");
            System.out.println("===================================================");

            option = scanner.next().charAt(0);
            App.clrscr();

            switch (option) {
                case 'a':
                    do {
                        System.out.println("===================================================");
                        System.out.println("||               SELECT AN OPTION                ||");
                        System.out.println("||      A: Aerodynamic technical information     ||");
                        System.out.println("||          B: Elongation                        ||");
                        System.out.println("||          C: Leading Edge Angle                ||");
                        System.out.println("||          D: Oswald Efficient Factor           ||");
                        System.out.println("||          E: Dynamic Lifting                   ||");
                        System.out.println("||          F: Return to previous Menu           ||");
                        System.out.println("===================================================");

                        option = scanner.next().charAt(0);
                        App.clrscr();

                        switch (option) {
                            case 'a':
                                System.out.println("===================================================");
                                System.out.println("Wing Taper: " + wingTaper());
                                System.out.println("Wing Surface: " + wingSurface() + " " + "m2");
                                System.out.println("Wing Span:" + wingSpan() + " " + "m");
                                System.out.println("Root chord:" + rootChord() + " " + "m");
                                System.out.println("Tip chord: " + tipChord() + " " + "m");
                                System.out.println("MAC: " + meanAeroChord() + " " + "M");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'b':
                                System.out.println("===================================================");
                                System.out.println("Elongation: " + elongation());
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'c':
                                System.out.println("===================================================");
                                System.out.println("Leading Edge Angle: " + convertToDegrees() + "° degrees");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'd':
                                System.out.println("===================================================");
                                System.out.println("Oswald efficient factor: " + oswaldFactor());
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'e':
                                System.out.println("===================================================");
                                System.out.println("Dynamic Lifting: " + dynamicLift());
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            default:
                                System.out.println("Invalid option! Please try again");
                                break;
                        }

                    } while (Character.toLowerCase(option) != 'f');
                    break;

                case 'b':
                    do {
                        System.out.println("===================================================");
                        System.out.println("||            A: Static Traction                 ||");
                        System.out.println("||            B: Dynamic Traction                ||");
                        System.out.println("||            C: Drag                            ||");
                        System.out.println("||            D: Static Friction                 ||");
                        System.out.println("||            E: Dynamic Friction                ||");
                        System.out.println("||            F: Static Force                    ||");
                        System.out.println("||            G: Dynamic Force                   ||");
                        System.out.println("||            H: Return to previous menu         ||");
                        System.out.println("===================================================");

                        option = scanner.next().charAt(0);
                        App.clrscr();

                        switch (option) {
                            case 'a':
                                System.out.println("===================================================");
                                System.out.println("Traction when S=0:" + " " + To() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'b':
                                System.out.println("===================================================");
                                System.out.println("Traction when S=ds:" + " " + Td() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'c':
                                System.out.println("===================================================");
                                System.out.println("Drag: " + " " + Dd() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'd':
                                System.out.println("===================================================");
                                System.out.println("Friction Coefficient when S=0:" + " " + Ffo() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'e':
                                System.out.println("===================================================");
                                System.out.println("Friction Coefficient when S=ds:" + " " + Ffd() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");

                            case 'f':
                                System.out.println("===================================================");
                                System.out.println("Force when S=0: " + " " + Fo() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");

                            case 'g':
                                System.out.println("===================================================");
                                System.out.println("Force when S=ds: " + " " + Fd() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");

                            default:
                                System.out.println("Invalid option! Please try again");
                                break;
                        }

                    } while (Character.toLowerCase(option) != 'h');
                    break;

                case 'c':
                    do {
                        System.out.println("===================================================");
                        System.out.println("||            A: Climb Angle                     ||");
                        System.out.println("||            B: Climb Radius                    ||");
                        System.out.println("||            C: Transition Segment              ||");
                        System.out.println("||            D: Transition Height               ||");
                        System.out.println("||            E: Climb Segment                   ||");
                        System.out.println("||            F: Medium Force                    ||");
                        System.out.println("||            G: Horizontal Segment               ||");
                        System.out.println("||            H: Return to previous menu         ||");
                        System.out.println("===================================================");

                        option = scanner.next().charAt(0);
                        App.clrscr();

                        switch (option) {
                            case 'a':
                                System.out.println("===================================================");
                                System.out.println("Climb angle: " + " " + angleToDegrees() + "° degrees");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'b':
                                System.out.println("===================================================");
                                System.out.println("Climb radius: " + " " + ascendingRadius() + " " + "m");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'c':
                                System.out.println("===================================================");
                                System.out.println("Transition segment: " + " " + St() + " " + "m");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'd':
                                System.out.println("===================================================");
                                System.out.println("Transition height: " + " " + hT() + " " + "m");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'e':
                                System.out.println("===================================================");
                                System.out.println("Climb segment: " + " " + Sa() + " " + "m");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'f':
                                System.out.println("===================================================");
                                System.out.println("Medium force: " + " " + Fm() + " " + "N");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            case 'g':
                                System.out.println("===================================================");
                                System.out.println("Horizontal segment: " + " " + Sh() + " " + "m");
                                System.out.println("===================================================");
                                System.out.println("\n");
                                break;

                            default:
                                System.out.println("Invalid option! Please try again");
                                break;
                        }

                    } while (Character.toLowerCase(option) != 'h');
                    break;

                case 'd':
                    Menu display = new Menu();
                    display.displayOptions();
                    System.out.println("Come back soon!");
                    break;

                default:
                    System.out.println("Invalid option, please try again");
                    break;

            }
        } while (Character.toLowerCase(option) != 'd');
        System.out.println("Thank you for calculate with us!");

        scanner.close();
    }
}
