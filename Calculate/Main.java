package Calculate;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше выражение: ");
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }
    public static String calc (String input) {
        boolean d = false;
        boolean e = false;
        Num calk;
        String[] arr = input.split(" ");
        if (arr.length != 3) {
            throw new IllegalArgumentException("Не верно введено выражение");
        }
        try {
            if (Integer.parseInt(arr[0]) > 10 || Integer.parseInt(arr[0]) < 0 || Integer.parseInt(arr[2]) > 10 || Integer.parseInt(arr[2]) < 0) {
                throw new IllegalArgumentException("Не верно введено выражение");
            }
            calk = new Num(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]));
        } catch (NumberFormatException exception) {
            int g = 0;
            while (g < 11 || d == false && e == false) {
                if (arr[0].equals(RomeNum.getRoman()[g])) {
                    d = true;
                }
                if (arr[2].equals(RomeNum.getRoman()[g])) {
                    e = true;
                }
                g++;
            }
            if (d == true && e == true) {
                calk = new RomeNum(arr[0], arr[2]);
            } else {
                throw new NumberFormatException("Цифры введены не верно, разные цифры");
            }
        }

        char c = arr[1].charAt(0);
        switch (c) {
            case '+':
                calk.plus();
                break;
            case '-':
                calk.minus();
                break;
            case '*':
                calk.multiplication();
                break;
            case '/':
                calk.division();
                break;
            default:
                throw new IllegalArgumentException("Оператор введен не верно");
        }
        if (calk instanceof RomeNum) {
            ((RomeNum) calk).toRoman();
            return (((RomeNum) calk).getStringResult());
        } else {
            return String.valueOf(calk.getRes());
        }
    }
}
