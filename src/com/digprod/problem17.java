package com.digprod;

/**
 * Created by dylan on 9/9/16.
 */
public class problem17 {

    private static int numToNumLetters(int num) {
        int letterCount = 0;

        if (num == 1000) return 11;

        int onesDigit = num % 10;
        switch (onesDigit) {
            case 1: letterCount += 3;
                break;
            case 2: letterCount += 3;
                break;
            case 3: letterCount += 5;
                break;
            case 4: letterCount += 4;
                break;
            case 5: letterCount += 4;
                break;
            case 6: letterCount += 3;
                break;
            case 7: letterCount += 5;
                break;
            case 8: letterCount += 5;
                break;
            case 9: letterCount += 4;
                break;
            default:
                break;
        }

        int tensDigit = num % 100 - onesDigit;

        if (tensDigit < 20 && tensDigit > 9) {
            letterCount = 0;

            switch (num % 100) {
                case 10: letterCount += 3;
                    break;
                case 11: letterCount += 6;
                    break;
                case 12: letterCount += 6;
                    break;
                case 13: letterCount += 8;
                    break;
                case 14: letterCount += 8;
                    break;
                case 15: letterCount += 7;
                    break;
                case 16: letterCount += 7;
                    break;
                case 17: letterCount += 9;
                    break;
                case 18: letterCount += 8;
                    break;
                case 19: letterCount += 8;
                    break;
                default:
                    break;
            }
        }

        else {
            switch (tensDigit) {
                case 20:
                    letterCount += 6;
                    break;
                case 30:
                    letterCount += 6;
                    break;
                case 40:
                    letterCount += 5;
                    break;
                case 50:
                    letterCount += 5;
                    break;
                case 60:
                    letterCount += 5;
                    break;
                case 70:
                    letterCount += 7;
                    break;
                case 80:
                    letterCount += 6;
                    break;
                case 90:
                    letterCount += 6;
                    break;
                default:
                    break;
            }
        }

        int hundredsDigit = num % 1000 - tensDigit - onesDigit;
        switch (hundredsDigit) {
            case 100: letterCount += 10;
                break;
            case 200: letterCount += 10;
                break;
            case 300: letterCount += 12;
                break;
            case 400: letterCount += 11;
                break;
            case 500: letterCount += 11;
                break;
            case 600: letterCount += 10;
                break;
            case 700: letterCount += 12;
                break;
            case 800: letterCount += 12;
                break;
            case 900: letterCount += 11;
                break;
            default:
                break;
        }

        if (hundredsDigit > 0 && (tensDigit != 0 || onesDigit != 0)) letterCount += 3;

        return letterCount;
    }

    public static long solve() {
        long letterSum = 0L;

        for (int i = 1; i <= 1000; i++) {
            letterSum += numToNumLetters(i);
        }

        return letterSum;
    }
}
