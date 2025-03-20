package com.walking.lesson26_string_types.task1;
import java.util.Scanner;
/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson6_methods/Task3.java">...</a>
 * используя StringBuilder или StringBuffer. Объясните свой выбор.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = requireInt(scanner, "Enter rectangle's length: ");
        int width = requireInt(scanner, "Enter rectangle's width: ");

        scanner.close();

        StringBuilder horizontalLine = createHorizontalLine(length);
        StringBuilder verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(StringBuilder horizontalLine, StringBuilder verticalLines) {
        StringBuilder qwer = new StringBuilder();
        qwer.append(horizontalLine).append(verticalLines).append(horizontalLine);

        System.out.println(qwer);
    }

    static StringBuilder createHorizontalLine(int length) {
        StringBuilder horizontalLine = new StringBuilder(" ");

        for (int i = 0; i < length; i++) {
            horizontalLine.append("-");
        }

        horizontalLine.append(" \n") ;

        return horizontalLine;
    }

    static StringBuilder createVerticalLines(int length, int width) {
        StringBuilder verticalLinesUnit = getVerticalLinesUnit(length);


        StringBuilder verticalLine = new StringBuilder();
        for (int i = 0; i < width; i++) {
            verticalLine.append(verticalLinesUnit);
        }
        return verticalLine;
    }

    static StringBuilder getVerticalLinesUnit(int length) {
        StringBuilder verticalLinesUnit = new StringBuilder("|");

        verticalLinesUnit.append(" ".repeat(Math.max(1, length)));

        verticalLinesUnit.append("|\n");
        return verticalLinesUnit;
    }
}