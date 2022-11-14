import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static boolean check1;

    public static void main(String[] args) {


        System.out.println("choisissez une grandeur de convertion: 1-> Ohms 2->KOhms 3-> MegaOhms");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("conversion en ohms (case 1)");

                func(1);

            }
            case 2 -> {
                System.out.println(" conversion en kiloOhms (case 2)");
                func(1000);

            }
            case 3 -> {
                System.out.println("conversion en MegaOhms (case 3)");
                func(1000000);
            }
        }

    }


    public static void func(int s) {
        //input{{


        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextDouble();


        double a = s * y;
        double num3 = a * 100;
        Double num2 = a * 10;
        Double num1 = a;

        Double[] digitss = getDigits(num1.toString());
        Double[] digits = getDigits(num2.toString());
        Double[] digit = getDigits(Double.toString(num3));




                if (a < 1) {
                    if (a != 0.22 & a != 0.47) {
                        System.out.println("imp");
                    }
                }


                if (a < 1) {
                    Double b1 = digit[0];
                    if (b1 == 1) {
                        System.out.println("marron");
                    } else if (b1 == 2) {
                        System.out.println("rouge");
                    } else if (b1 == 3) {
                        System.out.println("orange");
                    } else if (b1 == 4) {
                        System.out.println("jaune");
                    } else if (b1 == 5) {
                        System.out.println("vert");
                    } else if (b1 == 6) {
                        System.out.println("bleu");
                    } else if (b1 == 7) {
                        System.out.println("violet");
                    } else if (b1 == 8) {
                        System.out.println("gris");
                    } else if (b1 == 9) {
                        System.out.println("blanc");
                    }


                    try {


                        Double nbre1 = digit[1];
                        if (nbre1 == 1) {
                            System.out.println("marron");
                        } else if (nbre1 == 2) {
                            System.out.println("rouge");
                        } else if (nbre1 == 3) {
                            System.out.println("orange");
                        } else if (nbre1 == 4) {
                            System.out.println("jaune");
                        } else if (nbre1 == 5) {
                            System.out.println("vert");
                        } else if (nbre1 == 6) {
                            System.out.println("bleu");
                        } else if (nbre1 == 7) {
                            System.out.println("violet");
                        } else if (nbre1 == 8) {
                            System.out.println("gris");
                        } else if (nbre1 == 9) {
                            System.out.println("blanc");
                        } else if (nbre1 == 0) {
                            System.out.println("noir");
                        }


                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("noir");
                    }


                }
                Double b1 = digitss[0];
                if (b1 == 1) {
                    System.out.println("marron");
                } else if (b1 == 2) {
                    System.out.println("rouge");
                } else if (b1 == 3) {
                    System.out.println("orange");
                } else if (b1 == 4) {
                    System.out.println("jaune");
                } else if (b1 == 5) {
                    System.out.println("vert");
                } else if (b1 == 6) {
                    System.out.println("bleu");
                } else if (b1 == 7) {
                    System.out.println("violet");
                } else if (b1 == 8) {
                    System.out.println("gris");
                } else if (b1 == 9) {
                    System.out.println("blanc");
                }
                try {
                    if (a < 10) {

                        Double nbre1 = digits[1];
                        if (nbre1 == 1) {
                            System.out.println("marron");
                        } else if (nbre1 == 2) {
                            System.out.println("rouge");
                        } else if (nbre1 == 3) {
                            System.out.println("orange");
                        } else if (nbre1 == 4) {
                            System.out.println("jaune");
                        } else if (nbre1 == 5) {
                            System.out.println("vert");
                        } else if (nbre1 == 6) {
                            System.out.println("bleu");
                        } else if (nbre1 == 7) {
                            System.out.println("violet");
                        } else if (nbre1 == 8) {
                            System.out.println("gris");
                        } else if (nbre1 == 9) {
                            System.out.println("blanc");
                        } else if (nbre1 == 0) {
                            System.out.println("noir");
                        }

                    }
                    Double nbre1 = digitss[1];
                    if (nbre1 == 1) {
                        System.out.println("marron");
                    } else if (nbre1 == 2) {
                        System.out.println("rouge");
                    } else if (nbre1 == 3) {
                        System.out.println("orange");
                    } else if (nbre1 == 4) {
                        System.out.println("jaune");
                    } else if (nbre1 == 5) {
                        System.out.println("vert");
                    } else if (nbre1 == 6) {
                        System.out.println("bleu");
                    } else if (nbre1 == 7) {
                        System.out.println("violet");
                    } else if (nbre1 == 8) {
                        System.out.println("gris");
                    } else if (nbre1 == 9) {
                        System.out.println("blanc");
                    } else if (nbre1 == 0) {
                        System.out.println("noir");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("noir");
                }

                if (num1 < 1) {
                    System.out.println("argent,");
                } else if (num1 < 10) {
                    System.out.println("or");
                } else if (num1 < 100) {
                    System.out.println("noir");
                } else if (num1 < 1000) {
                    System.out.println("marron");
                } else if (num1 < 10000) {
                    System.out.println("rouge");
                } else if (num1 < 100000) {
                    System.out.println("orange");
                } else if (num1 < 1000000) {
                    System.out.println("jaune");
                } else if (num1 < 10000000) {
                    System.out.println("vert");
                }


                System.out.println("or");
            }



        //fonction pou separe chaque chiffre
        public static Double[] getDigits (String number){
            List<Double> digits = new ArrayList<>();
            for (int i = 0; i < number.length(); i++) {
                double j = Character.digit(number.charAt(i), 10);
                digits.add(j);
            }
            return digits.toArray(new Double[]{});


        }


    }
