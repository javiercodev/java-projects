import java.util.Scanner;

public class CalendarValidator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the day int/: ");
        int day = s.nextInt();
        System.out.print("Enter the month /n/: ");
        int month = s.nextInt();
        System.out.print("Enter the year /nnnn: ");
        int year = s.nextInt();

        // Entry verify date.
        if ((day <= 0 || day > 31) || (month <=0 || month > 12) || (year < 0)) {
            System.out.print("Invalid date.");
            return;
        }

        if ((day == 30 || day == 31) && month == 2) {
            System.out.print("Invalid date.");
            return;
        }

        switch(day) {
            case 28:
            case 29:
                if (month != 2) {
                System.out.println("Entered date: " + day + " " + month + " " + year);
                day++;
                System.out.println("Updated date: " + day + " " + month + " " + year);
                return ;
                }
                // Leap year.
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && month == 2) {
                    System.out.println("Entered date: " + day + " " + month + " " + year);
                    if (day == 28) {
                        day++;
                    } else if (day == 29) {
                        day = 1;
                        month++;
                    }
                    System.out.println("Updated date: " + day + " " + month + " " + year);
                    break;
                    // Not leap year.
                } else if ((day == 28) && ((year % 4 != 0) || (year % 100 == 0 || year % 400 != 0) && month == 2)) {
                    System.out.println("Entered date: " + day + " " + month + " " + year);
                    day = 1;
                    month++;
                    System.out.println("Updated date: " + day + " " + month + " " + year);
                    break;
                } else if ((day == 29) && ((year % 4 != 0) || (year % 100 == 0 || year % 400 != 0) && month == 2)) {
                    System.out.print("Invalid date.");
                    return;
                } 
            case 30:
            case 31:
                // 31 days months.
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    System.out.println("Entered date: " + day + " " + month + " " + year);
                    if (day == 30) {
                        day ++;
                    } else if (day == 31) {
                        day = 1;
                        if (month == 12) {
                            month = 1;
                            year++;
                        } else if (month < 12) {
                            month++;
                        }
                    } 
                    System.out.println("Updated date: " + day + " " + month + " " + year);
                    break;
                    // 30 days months.
            } else if (month != 1 || month != 3 || month != 5 || month != 7 || month != 8 || month != 10 || month != 12){
                    if (day == 30) {
                        System.out.println("Entered date: " + day + " " + month + " " + year);
                        day = 1;
                        if (month == 12) {
                            month = 1;
                            year++;
                        } else if (month < 12) {
                            month++;
                        }
                        System.out.println("Updated date: " + day + " " + month + " " + year);
                        break;
                    } else if (day == 31) {
                        System.out.print("Invalid date.");
                        return;
                    }
                }
            default:
                System.out.println("Entered date: " + day + " " + month + " " + year);
                day++;
                System.out.println("Updated date: " + day + " " + month + " " + year);
            }
        }   
    }