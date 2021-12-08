// Пользователь вводит с клавиатуры некоторую строку, содержащую дату.
// Проверить, является ли данная строчка датой в формате dd/mm/yyyy,
// начиная с 1900 года до 9999 года.

import java.util.regex.*;
import java.util.Scanner;
import static java.io.FileDescriptor.in;

public class lab3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy:");
        int n = sc.nextInt();
        sc.close();
       
        if (n.regex: "^(0[1-9]|12\\d|3[01])/([0][1-9]|1[0-2])/((?:19|[2-9]\\d{2}$))");
            System.out.println("Введена верная дата");
    }
}