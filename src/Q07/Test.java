package Q07;

import java.util.Scanner;

public class Test{
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        System.out.println("���̸� �Է��ϼ���.");
        age = scan.nextInt();
        System.out.println("�̸��� �Է��ϼ���.");
        scan.nextLine();
        name = scan.nextLine();
        System.out.printf("���̴� %d�Դϴ�.%n",age);
        System.out.printf("�̸��� %s�Դϴ�.%n",name);
        scan.close();
    }

}