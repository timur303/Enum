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
        System.out.println("���� �������� ����� ��� ������� ����� ����������!");
        try {
            Weekends();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " ����� �������� ����������");
        }
    }

    public static void Weekends() {
        Scanner scanner = new Scanner(System.in);
        Week weeks = Week.valueOf(scanner.next());
        switch (weeks) {
            case MONDAY -> System.out.println("�������� ���� ���� �����");
            case TUESDAY -> System.out.println("�������� ���� �SS ������");
            case WEDNESDAY -> System.out.println("�������� ���� �������� �������");
            case THURSDAY -> System.out.println("�������� ���� ���������� �������");
            case FRIDAY -> System.out.println("���� ���� ������ �����");
            case SATURDAY -> System.out.println("������ ���� C++ �����");
            case SUNDAY -> System.out.println("�������� ���� ������ ���������");
        }
    }
}
