import java.io.IOException;
import java.util.Scanner;

public class Calc2 {
    private static int num1;
    private static int num2;
    private static char operacion;
    private static String resultRoma;


    public static void main(String[] args) throws IOException {
        RomanToArabic conver = new RomanToArabic();
        ArabicToRoman convert = new ArabicToRoman();
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] s = text.split("[/*+-]");
        operacion = text.charAt(s[0].length());
            if (s[0].equals(roman[0]) || (s[0].equals(roman[1]))||(s[0].equals(roman[2]))||(s[0].equals(roman[3]))||(s[0].equals(roman[4]))||(s[0].equals(roman[5]))||(s[0].equals(roman[6]))||(s[0].equals(roman[7]))||(s[0].equals(roman[8]))||(s[0].equals(roman[9])) ) {
                num1 = conver.RomeToArab(s[0]);
                num2 = conver.RomeToArab(s[1]);

            } else {
                num1 = Integer.parseInt(s[0]);
                num2 = Integer.parseInt(s[1]);

            }
            try {
                if ((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)) {
                    throw new IllegalArgumentException();
                }
            } catch (RuntimeException e) {
                throw new IllegalArgumentException("калькулятор принимает на вход числа от 1 до 10 включительно");

            }

            int result;

            switch (operacion) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + operacion);
            }
            if (s[0].equals(roman[0]) || (s[0].equals(roman[1]))||(s[0].equals(roman[2]))||(s[0].equals(roman[3]))||(s[0].equals(roman[4]))||(s[0].equals(roman[5]))||(s[0].equals(roman[6]))||(s[0].equals(roman[7]))||(s[0].equals(roman[8]))||(s[0].equals(roman[9])) ) {
                resultRoma = convert.ArabToRome(result);
                System.out.println(resultRoma);

            } else
                System.out.println(result);



        }
    }








