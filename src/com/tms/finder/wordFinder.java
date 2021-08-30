package com.tms.finder;

public class wordFinder {
    /**
     * Метод позволяет найти последнее самое длинное слово с заданной строке
     *
     * @param str - принимаемая на вход строка
     * @return - возвращает строку
     */

    public static void findLongestWord(String str) {
        String longest = "";
        if (isValid(str)) {
            String[] strArray = str.split(" ");
            longest = strArray[0];
            for (int i = 1; i < strArray.length; i++) {
                if (strArray[i].length() >= longest.length()) {
                    longest = strArray[i];
                }
            }
        }
        System.out.println(longest);
    }

    /**
     * Метод позволяет найти последнее самое короткое слово с заданной строке
     *
     * @param str - принимаемая на вход строка
     * @return - возвращает строку
     */

    public static void findLastShortestWord(String str) {
        String shortest = "";
        if (isValid(str)) {
            String[] strArray = str.split(" ");
            shortest = strArray[0];
            for (int i = 1; i < strArray.length; i++) {
                if (strArray[i].length() <= shortest.length()) {
                    shortest = strArray[i];
                }
            }
        }
        System.out.println(shortest);
    }

    /**
     * Метод позволяет найти в строке слово с минимальным кол-вом различных символов
     *
     * @param str - принимаемая нв вход строка
     */
    public static void findWordWithMinSameChars(String str) {
        if (isValid(str)) {
            String[] wordArray = str.split(" ");
            String wordWithMinSameChars = "";
            int count = Integer.MAX_VALUE;
            for (int i = 0; i < wordArray.length; i++) {
                String temporaryString = wordArray[i];
                int temporaryCounter = 0;
                while (!temporaryString.isEmpty()) {
                    if (temporaryString.length() > 1) {
                        temporaryString = temporaryString.replace("" + temporaryString.charAt(0), "");
                        temporaryCounter++;
                    } else {
                        break;
                    }
                }
                if (temporaryCounter < count && temporaryCounter > 0) {
                    count = temporaryCounter;
                    wordWithMinSameChars = wordArray[i];
                }
            }
            System.out.println(wordWithMinSameChars);
        }
    }


    /**
     * Метод позволяяет определить, явялется ли выбранное слово полиндромом
     *
     * @param str        - принимаемая на вход строка
     * @param wordNumber - порядковый номер выбранного слова
     */
    public static void checkForPolindrom(String str, int wordNumber) {
        if (isValid(str)) {
            String reverseString = "";
            String[] wordArray = str.split(" ");
            if (wordNumber >= 0 && wordNumber <= wordArray.length) {
                for (int i = wordArray[wordNumber - 1].length() - 1; i >= 0; i--) {
                    reverseString = reverseString + wordArray[wordNumber - 1].charAt(i);
                }
                System.out.println("Выбранное слово - " + wordArray[wordNumber - 1]);
                System.out.println("Перевернутое значение - " + reverseString);

                if (reverseString.equals(wordArray[wordNumber - 1])) {
                    System.out.println("Введенное значение является палиндромом");
                } else {
                    System.out.println("Введенное значение не является палиндромом");
                }
            } else {
                System.out.println("Вы ввели недопустимое значение");
            }
        }
    }

    /**
     * Данный метод проверяет, корректно ли введена строка
     *
     * @param str - принимает введенную строку
     * @return - возвращает булево значние
     */
    private static boolean isValid(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        } else {
            System.out.print("Введенное значение не корректно. Строка пуста или null");
            return false;
        }
    }
}
