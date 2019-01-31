package com.exampl.LessonString;

import java.util.Scanner;

public class LessonString {
//Дан массив из N строк.  Строки имеют произвольную длину.  Строки  содержат  слова,
// состоящие   из произвольных  символов,  разделенных  символами  '  '   ','   '.'
// N<=10. Необходимо написать методы:
//1) сортировка строк массива по количеству слов в строке.
//2) выводящий значения длин всех строк массива.
//3) выводящий строки с i по j из массива.
//4) выводящий номер строки с максимальной цифрой.
//5) удаляющий из i-ой  строки все заглавные буквы.
//6) удаляющий из i-ой  строки все символы не буквы и не цифры.
//7) выводящий из i-ой  строки все слова, содержащие только цифры.
//8) вычисляющий сумму всех цифр i-ой  строки.
//9) выводящий из массива  все  слова,  содержащие   только прописные буквы.
//10) выводящий все числа из строк.
//11) удаляющий  из строку часть, заключенную между двумя сим-волами, которые
// вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).
//12) определяющий сколько в массиве одинаковых строк.
//13) определяющий сколько в массиве одинаковых слов (выводить слово и количество повторений).
//14) метод, объединяющий в одну строку строки с i по j.
//15) метод, преобразовывающий i-ую  строку так, чтобы все слова начинались с заглавной буквы.
//16) метод вносящий изменение в i-ую  строку (предается номер строки и новое содержание)





        private String[] stringMass;
        private String[] stringWorld;
        private int num, sum, x = 0;
        int numStr;
        int i = 0;
        int j = 0;
        private String nama;
        private String namb;
        private int numupp;

        public LessonString() {
            this.sum = sum;
            this.namb = namb;
            this.nama = nama;
        }

        public static void main(String[] args) {
            LessonString r = new LessonString();
            r.initArray();
            r.newContent();
            // r.stringUpCase();
            //r.stringConcatenation();
            // r.noname();
            // r.searchWorld();
            //r.deleter();
            //r.delLetr();
            //r.sumAllNumb();
            // r.delUpandDigletr();
            // r.notChrNum();
            // r.onlyNumber();
            // r.sortStr();
            //r.write();
            //r.getIJ();
            // r.uppercase();
            // r.compare();
            // r.thryElements();
            // r.toUp();
            //r.words();
            // r.toNumber();
        }

        private void initArray() {
            num = 10;
            stringMass = new String[num];
            stringMass[0] = "Аргумент 4 Довод 45 аргумент переменной длины,8 можно перегружать.";
            stringMass[1] = "Типы его параметра vararg 12 могут быть различными . ";
            stringMass[2] = "Именно это имеет место 45 в вариантах vaRest int  и vaTest boolean .";
            stringMass[3] = "Помните, что конструкция ... вынуждает 678 компилятор обрабатывать параметр как массив указанного типа. ";
            stringMass[4] = "Поэтому, 4 подобно тому, как 11  можно выполнять перегрузку методов, 89 используя различные типы параметров массива, ";
            stringMass[5] = "можно выполнять 34 перегрузку методов 56  vararg, используя 67 различные типы аргументов 2 переменной длины.";
            stringMass[6] = "В этом 1 случае система 13 Java использует различие 54  в типах для определения нужного7  варианта перегруженного метода. ";
            stringMass[7] = "Второй 4 способ перегрузки 11 метода vararg – добавление 67 обычного параметра. ";
            stringMass[8] = "Именно это 453  было сделано 5  для vaTest 67 (String, int ). ";
            stringMass[9] = "В данном случае для  34 определения нужного метода 232  система Java использует и количество 90 аргументов, и их тип. ";


        }
        private void newContent(){
            int n=0;int n1=0;
            String[] str;
            String[] str1;
            System.out.println("Введите номер строки");
            inputNumber();
            str = stringMass[numStr].split(" ");
            n= (int)(Math.random()*10);
            str1=stringMass[n].split(" ");

            for (int i=0;i<4;i++){
                n= (int)(Math.random()*str.length);
                n1=(int)(Math.random()*str1.length);
                stringMass[numStr]=stringMass[numStr].replaceFirst(str[n],str1[n1]);
                // System.out.println("Строка:"+numStr+" " +stringWorld[numStr]);
            } System.out.println("Строка:"+numStr+" " +stringMass[numStr]);
        }
        private void stringUpCase() {
            //char qwerty = a;
            String[] str;
            System.out.println("Введите номер строки");
            inputNumber();
            str = stringMass[numStr].split(" ");


            for (String word : str) {
                if (word == null || word.length() < 1 || word.contains("/*")|| word.contains(" ")|| word.contains("(")|| word.contains(")")) {
                    System.out.print(word + " ");
                }
                System.out.print(word.replaceFirst(String.valueOf(word.toCharArray()[0]), String.valueOf(word.toCharArray()[0]).toUpperCase()) + " ");
            }
        }


        private void stringConcatenation() {
            String[][] str = new String[stringMass.length][];
            int n = 0;
            int n1 = 0;
            System.out.println("Введите номера объединяемых строк ");
            Scanner sc = new Scanner(System.in);
            System.out.println();
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            if (sc.hasNextInt()) {
                n1 = sc.nextInt();
            }
            for (int i = n; i <= n1; i++) {
                str[i] = stringMass[i].split(" ");

            }
            for (int i = n; i <= n1; i++) {
                for (int j = 0; j < str[i].length; j++) {
                    if (str[i][j] == ".") {
                        break;
                    }

                    System.out.print(" " + str[i][j]);
                }
            }
        }

        private void noname() {


            String[][] newArray = new String[stringMass.length][];
            for (int i = 0; i < stringMass.length; i++) {
                newArray[i] = stringMass[i].split(" ");
            }
            boolean isActiv = false;
            do {
                String current = null;
                int counter = 0;
                isActiv = false;
                for (int i = 0; i < newArray.length; i++) {
                    for (int j = 0; j < newArray[i].length; j++) {
                        if (current == null && newArray[i][j] != null) {
                            current = newArray[i][j];
                            counter = 1;
                        }
                        if (newArray[i][j] != null) {
                            isActiv = true;
                        }
                        if (newArray[i][j] != null && newArray[i][j].equals(current)) {
                            counter++;
                            newArray[i][j] = null;
                        }
                    }
                }
                if (current != null) {
                    System.out.println(current + " : " + counter);
                }
            } while (isActiv);
        }


        private void searchWorld() {
            int n = 0;
            Character chr = 0;
            String[][] str = new String[stringMass.length][];
            for (int i = 0; i < stringMass.length; i++) {
                str[i] = stringMass[i].split(" ");
            }
            for (int j = 0; j < str.length; j++) {
                for (int m = 0; m < str[j].length; m++) {
                    nama = str[j][m];
                    n = 0;
                    for (int i = 0; i < str.length; i++) {
                        for (int k = 0; k < str[i].length; k++) {
                            if (str[i][k].equalsIgnoreCase(nama)) {
                                n++;
                            }
                        }
                    }


                    if (n == 1) {
                        continue;
                    }
                    System.out.println(nama + " : " + n);
                }
            }
        }


        private void deleter() {
            int n = 0;
            int n1 = 0;
            int i = 0;
            System.out.println("Введите символы между которыми удалять строку напрмер * * или ( )");
            Scanner sc = new Scanner(System.in);
            System.out.println();
            if (sc.hasNextLine()) {
                namb = sc.nextLine();
            }

            if (sc.hasNextLine()) {
                nama = sc.nextLine();
            }

            System.out.println(stringMass[i]);
            n = stringMass[i].indexOf(namb);
            n1 = stringMass[i].indexOf(nama);
            // String str =stringMass[i].substring(n,n1);
            //System.out.println(str);
            String str = stringMass[i].substring(0, n) + stringMass[i].substring(n1 + 1);
            System.out.println(str);
        }

        private void delLetr() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < stringMass[i].length(); j++) {
                    namb = "";
                    Character chr = stringMass[i].charAt(j);
                    if (Character.isLetter(chr) || Character.isUpperCase(chr)) {
                        for (; j < stringMass[i].length(); j++) {
                            chr = stringMass[i].charAt(j);
                            if (Character.isLetter(chr)) {
                                namb = namb + chr;
                            }
                            if (Character.isWhitespace(chr)) {
                                stringMass[i] = stringMass[i].replaceFirst(String.valueOf(namb), "");
                                j = 0;
                                break;
                            }
                        }
                    }

                }
                System.out.println(stringMass[i]);
            }
        }

        private void delUpandDigletr() {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < stringMass[i].length(); j++) {
                    namb = "";
                    Character chr = stringMass[i].charAt(j);
                    if (Character.isDigit(chr) || Character.isUpperCase(chr)) {
                        for (; j < stringMass[i].length(); j++) {
                            chr = stringMass[i].charAt(j);
                            if (Character.isLetterOrDigit(chr)) {
                                namb = namb + chr;
                            }
                            if (Character.isWhitespace(chr)) {
                                stringMass[i] = stringMass[i].replaceFirst(String.valueOf(namb), "");
                                j = 0;
                                break;
                            }
                        }
                    }

                }
                System.out.println(stringMass[i]);
            }
        }


        private void inputNumber() {

            Scanner sc = new Scanner(System.in);
            System.out.println();
            if (sc.hasNextInt()) {
                numStr = sc.nextInt();
            }

        }

        private void sumAllNumb() {

            onlyNumber();
            System.out.println();
            System.out.print("Сумма = " + sum);

        }

        private void onlyNumber() {
            int var = 0;
            int n = 0;
            int n1 = 0;
            // int n2 = 0;
            int[] max;
            max = new int[200];
            System.out.println("Введите номер строки");
            inputNumber();
            System.out.println(stringMass[numStr]);

            for (int j = 0; j < stringMass[numStr].length(); j++) {
                Character chr = stringMass[numStr].charAt(j);
                if (n == 0 && Character.isDigit(chr)) {
                    n = j;
                    for (; j < stringMass[numStr].length(); j++) {
                        chr = stringMass[numStr].charAt(j);
                        if (Character.isDigit(chr)) {
                            n1 = j;
                        } else break;
                    }
                    if (n != 0 && n1 != 0) {
                        String namb = stringMass[numStr].substring(n, n1 + 1);
                        n = 0;
                        n1 = 0;
                        max[j] = Integer.parseInt(namb);
                        if (sum < max[j]) {
                            // n3 = i;
                            sum = sum + max[j];

                            System.out.print(" " + namb);
                        }
                    }
                }
            }
        }

        private void notChrNum() {
            System.out.println("Введите номер строки");
            inputNumber();
            System.out.println(stringMass[numStr]);
            for (int j = 0; j < stringMass[numStr].length(); j++) {
                Character chr = stringMass[numStr].charAt(j);
                if (Character.isLetterOrDigit(chr)) {
                    continue;
                } else {
                    stringMass[numStr] = stringMass[numStr].replaceFirst(String.valueOf(chr), "");
                }


            }
            System.out.println(stringMass[numStr]);

        }

        private void uppercase() {
            System.out.println("Введите номер строки");
            inputNumber();
            System.out.println(stringMass[numStr]);
            for (int j = 0; j < stringMass[numStr].length(); j++) {
                Character chr = stringMass[numStr].charAt(j);
                if (Character.isUpperCase(chr)) {
                    stringMass[numStr] = stringMass[numStr].replaceFirst(String.valueOf(chr), " ");
                }

            }
            System.out.println(stringMass[numStr]);
        }

        private void getIJ() {
            // int num = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите i и j для вывода желаемых строк в диапазоне от 0 до десяти например (i=2, j=7 ");
            System.out.println();
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                int numupp = i;
            }
            if (sc.hasNextInt()) {
                j = sc.nextInt();
            }
            for (; i <= j; i++) {
                System.out.println(stringMass[i]);
            }
        }

        private void write() {
            for (int i = 0; i < stringMass.length; i++) {
                System.out.println(stringMass[i] + " Длинна строки " + stringMass[i].length() + " символов");
            }
        }

        private void thryElements() {
            num = x;
            x = stringMass[x].length();
            System.out.println(stringMass[num].substring(x - 3, x));
        }

        private void compare() {
            int n = 0;
            for (int j = 1; j < stringMass.length; j++) {
                if (stringMass[j - 1].length() == stringMass[j].length()) {

                    System.out.println("Строка " + (j - 1) + " и строка " + j + " одинаковы");
                    n = 1;
                }
            }
            if (n == 0) {
                System.out.println("Одинаковых строк нет");
            }
        }

        private void toUp() {
            System.out.println(stringMass[2].toUpperCase());
        }

        private void words() {
            stringWorld = new String[3];
            stringWorld = stringMass[num].split("g", 3);
            for (int i = 0; i < stringWorld.length; i++) {
                System.out.print(stringWorld[i] + " ");
            }
        }

        private void toNumber() {
            int n = 0;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int[] max;
            max = new int[1000];
            System.out.println();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < stringMass[i].length(); j++) {
                    Character chr = stringMass[i].charAt(j);
                    if (n == 0 && Character.isDigit(chr)) {
                        n = j;
                        for (; j < stringMass[i].length(); j++) {
                            chr = stringMass[i].charAt(j);
                            if (Character.isDigit(chr)) {
                                n1 = j;
                            } else break;
                        }
                        if (n != 0 && n1 != 0) {
                            String namb = stringMass[i].substring(n, n1 + 1);
                            n = 0;
                            n1 = 0;
                            System.out.print(" " + namb);
                            max[j] = Integer.parseInt(namb);
                            if (n2 < max[j]) {
                                n3 = i;
                                n2 = max[j];
                            }
                        }
                    }
                }
            }
            System.out.println("Максимальный элемент " + n2 + " в строке " + n3);
        }


        private void sortStr() {
            String str = "";
            for (int i = 1; i < stringMass.length; i++) {
                for (int j = 1; j < stringMass.length; j++) {
                    if (stringMass[j - 1].length() > stringMass[j].length()) {
                        str = stringMass[j - 1];
                        stringMass[j - 1] = stringMass[j];
                        stringMass[j] = str;
                    }
                }
            }
        }
    }


