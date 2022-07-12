import java.util.Scanner;

public class Menu {

    public void displayOptions() {

        char option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===================================================");
            System.out.println("||                Select an option               ||");
            System.out.println("||                   A: Aviation                 ||");
            System.out.println("||              B: Maths Operations              ||");
            System.out.println("||            C: Electrical Circuits             ||");
            System.out.println("||                     D: EXIT                   ||");
            System.out.println("===================================================");

            option = scanner.next().charAt(0);
            App.clrscr();

            switch (option) {

                case 'a':
                    Scanner input = new Scanner(System.in);

                    System.out.println("Input Ed:");
                    double ed = input.nextDouble();

                    System.out.println("Input Me:");
                    double me = input.nextDouble();

                    System.out.println("Input Di:");
                    double di = input.nextDouble();

                    System.out.println("Input Pes:");
                    double pes = input.nextDouble();

                    System.out.println("Input Est:");
                    double est = input.nextDouble();

                    AircraftPerformance airper = new AircraftPerformance(ed, me, di, pes, est);
                    airper.showMenu();
                    break;

                case 'b':
                    do {
                        System.out.println("===================================================");
                        System.out.println("||                SELECT AN OPTION               ||");
                        System.out.println("||                   A: Matrix                   ||");
                        System.out.println("||             B: System of Equations            ||");
                        System.out.println("||               C: Taylor's Series              ||");
                        System.out.println("||          D: Return to previous menu           ||");
                        System.out.println("===================================================");

                        option = scanner.next().charAt(0);
                        App.clrscr();

                        switch (option) {
                            case 'a':
                                Scanner scan = new Scanner(System.in);

                                System.out.println("===================================================");
                                System.out.println("Enter size of the matrx:");
                                System.out.println("===================================================");

                                int n = scan.nextInt();
                                int array[][] = new int[n][n];

                                System.out.println("Enter values:\t");

                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {
                                        System.out.println("Array [" + i + "][" + j + "]:");
                                        array[i][j] = scan.nextInt();
                                    }
                                }
                                System.out.println("The determinant of the matrix is:"
                                        + MathOperations.determinantMatrix(array, n));
                                break;

                            case 'b':
                                MathOperations.equationSystem();
                                System.out.println("\n");
                                break;

                            case 'c':
                                Taylor.getTaylorSeries();
                                System.out.println("\n");
                                break;

                            default:
                                System.out.println("Invalid option, please try again");
                                break;
                        }

                    } while (Character.toLowerCase(option) != 'd');
                    break;

                case 'c':
                    ElectricalCircuits.imprimir();
                    break;

                default:
                    break;
            }

        } while (Character.toLowerCase(option) != 'd');

        scanner.close();
    }

}
