package day10_Switch_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {
        /*
        int number = 4;
        String days = "";
        switch (number){
            case 1 :
                days="Monday";
                break;
            case 2:
                days="Tuesday";
                break;
            case 3 :
                days="Wednesday";
                break;
            case 4 :
                days="Thursday";
                break;
            case 5 :
                days="Friday";
                break;
            case 6 :
                days="Saturday";
                break;
            case 7 :
                days="Sunday";
                break;
            default:
                System.out.println("invalid");
                break;
        }
        System.out.println(days);
    }

         */

            int number = 8;

            switch(number) {
                case 1:
                    System.out.println("Monday");

                case 2:
                    System.out.println("Tuesday");


                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                default:
                    System.out.println("Invalid");

                case 7:
                    System.out.println("Sunday");
                    break;

            }

        }
    }

