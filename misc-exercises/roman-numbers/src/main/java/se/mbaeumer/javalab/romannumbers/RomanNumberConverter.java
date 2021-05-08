package se.mbaeumer.javalab.romannumbers;

public class RomanNumberConverter {
    public static String getRomanNumber(final int number){
        if (number <= 3){
            return calculateToThree(number);
        }

        int remainder = number % 5;
        int division = number / 5;

        if (division == 0){
            if (remainder < 4){
                return calculateToThree(remainder);
            }else{
                StringBuilder sb = new StringBuilder();
                return sb.append(calculateToThree(5 - remainder)).append("V").toString();
            }
        }else if (division == 1){
            if (remainder == 0){
                return "V";
            }else if (remainder <= 3){
                StringBuilder sb = new StringBuilder();
                return sb.append("V").append(calculateToThree(remainder)).toString();
            }else{
                StringBuilder sb = new StringBuilder();
                return sb.append(calculateToThree(1)).append("X").toString();
            }
        }

        remainder = number % 10;
        division = number / 10;

        if (division == 1){
            if (remainder == 0){
                return "X";
            }
        }

        return null;
    }

    private static String calculateToThree(int number) {
        int i=1;
        StringBuilder sb = new StringBuilder();
        while (i <= number){
            sb.append("I");
            i++;
        }
        return sb.toString();
    }
}