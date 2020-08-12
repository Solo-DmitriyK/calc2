public class RomanToArabic {
    static String[] Rome = {"X", "IX", "V", "IV", "I"};
    static int[] Arab = {10, 9, 5, 4, 1};

    public int RomeToArab(String rome) {

            StringBuffer romeNumber = new StringBuffer(rome);
            int arabNumber = 0;
            int i = 0;
            if (romeNumber.length() > 0) {
                while (true) {
                    do {
                        if (Rome[i].length() <= romeNumber.length()) {
                            if (Rome[i].equals(romeNumber.substring(0, Rome[i].length()))) {
                                arabNumber += Arab[i];
                                romeNumber.delete(0, Rome[i].length());
                                if (romeNumber.length() == 0)
                                    return arabNumber;
                            } else break;
                        } else break;
                    } while (true && romeNumber.length() != 0);
                    i++;
                }
            }
            return 0;

        }
    }
