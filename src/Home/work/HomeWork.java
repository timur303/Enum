package Home.work;

import java.util.Scanner;

enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Апта кундорун латын чон тамгасы менен киргизиниз!");
        try {
            Weekends();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Туура маалымат киргизиниз");
        }
    }

    public static void Weekends() {
        Scanner scanner = new Scanner(System.in);
        Week weeks = Week.valueOf(scanner.next());
        switch (weeks) {
            case MONDAY -> System.out.println("Дуйшомбу куну жава окуйм");
            case TUESDAY -> System.out.println("Шейшемби куну СSS окууйм");
            case WEDNESDAY -> System.out.println("Шаршемби куну Практика кыламын");
            case THURSDAY -> System.out.println("Бейшемби куну бассейинге барамын");
            case FRIDAY -> System.out.println("Жума куну жумага барам");
            case SATURDAY -> System.out.println("Ишемби куну C++ окуйм");
            case SUNDAY -> System.out.println("Жекшемби куну задача чыгарамын");
        }
    }
}
