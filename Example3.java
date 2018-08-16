package Homework2;

import java.util.Scanner;

public class Example3 {

           public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ваше имя ? ");
            String name = scanner.nextLine();

            System.out.print("Где живете ?  ");
            String city = scanner.nextLine();

               System.out.print("Ваш возраст ? ");
               int age = scanner.nextInt();
               String x = scanner.nextLine();

               System.out.print("Ваше хобби ? ");
               String hobby = scanner.nextLine();

               System.out.println( );
            System.out.println("Имя:  " + name  );
            System.out.println("Город: " + city );
            System.out.println("Возраст : " + age );
            System.out.println("Хобби : " + hobby );

            System.out.println( );
            System.out.println("Человек по имени " + name  +  " живет в городе " + city + ".");
            System.out.println("Этому человеку " + age + " и он любит заниматься " + hobby +".");

            System.out.println( );

            System.out.println( name +  " - Имя");
            System.out.println(city +  " - Город");
            System.out.println(age + " - Возраст");
            System.out.println(hobby + " - Хобби");

        }
    }


