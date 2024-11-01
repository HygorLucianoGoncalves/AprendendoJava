package org.example.JavaFundamentals;

public class Conditionals {

    public static void main(String[] args) {

        // IF, ELSE AND ELSE IF
        int year;
        year = 19;

        if (year < 18) {
            System.out.println("Menor de idade");
        } else if (year > 10 && year < 18) {
            System.out.println("Já pode estudar");
        } else {
            System.out.println("Maior de idade");
        }

        // Use ?,: o operador para especificar uma condição de linha:

        double salario = 1000;
        double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
        System.out.println(bonus);


        //      SWITCH
        int month = 8;
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(monthString);
    }

}
 /* int month = 8;
String monthString;
        switch (month) {
        case 1:
monthString = "January";
        break;
        case 2:
monthString = "February";
        break;
        case 3:
monthString = "March";
        break;
        case 4:
monthString = "April";
        break;
        case 5:
monthString = "May";
        break;
        case 6:
monthString = "June";
        break;
        case 7:
monthString = "July";
        break;
        case 8:
monthString = "August";
        break;
        case 9:
monthString = "September";
        break;
        case 10:
monthString = "October";
        break;
        case 11:
monthString = "November";
        break;
        case 12:
monthString = "December";
        break;
default:
monthString = "Invalid month";
        break;
        }
        System.out.println(monthString); */