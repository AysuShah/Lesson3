import java.sql.SQLOutput;

public class RelationalOperations {
    public static void main(String[] args) {
//        int countOfRooms = 5;
//        int countOfComputers = 15;
//
//        boolean isCountOfRoomsGreaterThanCountOfComputers = countOfRooms > countOfComputers;
//        System.out.println(isCountOfRoomsGreaterThanCountOfComputers);
//
//        boolean isCountOfRoomsLessThanCountOfComputers =countOfRooms < countOfComputers;
//        System.out.println(isCountOfRoomsLessThanCountOfComputers);
//
//        boolean isCountOfRoomsGreaterThanOrEqualCountOfComputers = countOfRooms >= countOfComputers;
//        System.out.println(isCountOfRoomsGreaterThanOrEqualCountOfComputers);
//
//        boolean isCountOfRoomsLessThanOrEqualCountOfComputers = countOfRooms <= countOfComputers;
//        System.out.println(isCountOfRoomsLessThanOrEqualCountOfComputers);
//
//        boolean isEqual = countOfRooms == countOfComputers;
//        System.out.println(isEqual);
//
//        boolean isNotEqual = countOfRooms != countOfComputers;
//        System.out.println(isNotEqual);


//        char vitamin = 'A';
//        char vitamin2 = 'B';
//
//        boolean isVitaminsEquals = vitamin == vitamin2;
//        boolean isVitaminsNotEquals = vitamin != vitamin2;
//
//        System.out.println(isVitaminsEquals);
//        System.out.println(isVitaminsNotEquals);
//    }
//}
//
//
//        double number1 = 10.5;
//        double number2 = 20.8;
//
//        boolean isNumber1LessThanNumber2 = number1 <number2;
//
//        System.out.println(isNumber1LessThanNumber2);
//
//
//        double a = 0.5;
//        double b = 0.8;
//
//
//        boolean isLessThan = a < b;
//        System.out.println(isLessThan);
//
//        boolean a = true;
//        boolean b = false;
//        boolean c = true;
//        boolean d = false;

//        boolean b1 = a & b; //false
//        boolean b2 = b & a;//false
//        boolean b3 = a & c;//true
//        boolean b4 = b & d; //false
//
//        boolean b5 = a | b;//true
//        boolean b6 = b | a; //true
//        boolean b7 = a | c;//true
//        boolean b8 = b | d; //false
//
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//
//        System.out.println();
//
//        System.out.println(b5);
//        System.out.println(b6);
//        System.out.println(b7);
//        System.out.println(b8);
//
//
//        boolean b9 = (a | c & b) & (a | c & b);
//        System.out.println(b9);
//    }
//}

//
//        boolean b10 = true || true || false || true;
//        boolean b11 = true && false && true && false;
//        System.out.println(b10);
//        System.out.println(b11);
//
//
//        int age = 23;
//        System.out.println("Age before :" + age);
//        boolean b12 = true || (++age < 5);
//        System.out.println("Age after :" + age);
//
//        int age2 = 23;
//        System.out.println("Age2 before :" + age2);
//        boolean b13 = true && (++age2 > 5) && (age2++ > 5) && (age2++ > 5);
//        System.out.println("Age2 after :" + age2);
//
//
//        if (age > age2) {
//            System.out.println("hello");
//
//        } else if (age == age2) {
//            System.out.println("Goodbye");
//        } else {
//            System.out.println("welcome");
//        }
//
//
//        if (5 == 6) {
//            System.out.println("hi");
//        }
//
//
//        String result = 5 == 6 ? "hi" : "bye";
//        System.out.println(result);
//
//
//        int sum = 5;
//
//        boolean b14 = -5 > 0 || (23 == 23 ? false : 45 > 41 ? false : true);
//        System.out.println("b14 :" + b14);
//
//        boolean b15 = -5 > 0 || (23 == 23 ? false : 45 > 41 ? false : true);;
//
//        int day = 5;
//
//        switch (day) { // long v' float switch case ile olmur
//            case 1:
//                System.out.println("1ci gun");
//                break;
//            case 2:
//                System.out.println("2ci gun");
//                break;
//            case 3:
//                System.out.println("3ci gun");
//                break;
//            case 4:
//                System.out.println("4ci gun");
//                break;
//            case 5:
//                System.out.println("5ci gun");
//                break;
//            case 6:
//                System.out.println("6ci gun");
//                break;
//            case 7:
//                System.out.println("7ci gun");
//                break;
//            default:
//                System.out.println("zaman dayanib");
//        }
//
//        if (day == 1) {
//            System.out.println("1ci gun");
//        } else if (day == 2) {
//            System.out.println("2ci gun");
//        } else if (day == 3) {
//            System.out.println("3ci gun");
//        } else if (day == 4) {
//            System.out.println("4ci gun");
//        } else if (day == 5) {
//            System.out.println("5ci gun");
//        } else if (day == 6) {
//            System.out.println("6ci gun");
//        } else if (day == 7) {
//            System.out.println("7ci gun");
//        } else {
//            System.out.println("zaman dayanib");
//        }


//
//
//        int number = 4;
//
//        if (number > 0) {
//            System.out.println("Positive");
//
//        } else if (number < 0) {
//            System.out.println("Negative");
//
//        } else {
//            System.out.println("0");
//        }
//
//
//
//
//
//        int a = 8;
//        int b = 18;
//        int c = 58;
//        int d;
//        int result;
//
//        d = a > b ? a : b;
//        result = d > c ? d : c;
//
//        System.out.println("Largest : " + result);
//
//
//
//
//
//        int numberA = 7;
//
//        if (numberA % 2 == 0) {
//            System.out.println("Even");
//
//        } else {
//            System.out.println("Odd");
//        }
//
//
//
//
//
//        int seasons = 4;
//
//        switch (seasons) {
//            case 1:
//                System.out.println("Autumn is rainy");
//                break;
//            case 2:
//                System.out.println("Winter is freezing");
//                break;
//            case 3:
//                System.out.println("Spring is chilly and warm");
//                break;
//            case 4:
//                System.out.println("Summer is hot and sunny");
//                break;
//            default:
//                System.out.println("No Seasons");
//        }
//    }
//}

//    int num1 =7;
//    int num2=3;
//    int num3 =124;
//
//     int largest = num1 > num2 && num1 > num3 ? num1 : num2 > num1 && num2 >num3 ? num2 : num3;
//
//        System.out.println(largest);



