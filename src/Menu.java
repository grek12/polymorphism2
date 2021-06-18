import java.util.Scanner;

public class Menu {
    Conteiner conteiner = new Conteiner();
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String name,name2;
    int num;
    public void  menu1(){
        while (!"6".equals(s)) {
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить журнал");
            System.out.println("3. Удалить   ");
            System.out.println("4. Вывод всех данных");
            System.out.println("5. Запрос данных по изданию");
            System.out.println("6. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    System.out.println("Введите название издания ");
                    name = scan.next();
                    System.out.println("Введите фамилию автора ");
                    name2 = scan.next();
                    conteiner.add(new Book(name, name2));
                    break;
                case 2:
                    System.out.println("Введите название издания ");
                    name = scan.next();
                    System.out.println("Введите количество статей ");
                    num = scan.nextInt();
                    conteiner.add(new Journal(name, num));
                    break;

                case 3:
                    System.out.println(" ");
                    String name = scan.next();
                    conteiner.delete();
                    break;

                case 4:
                    System.out.println(conteiner.getData());
                    break;
                case 5:
                    System.out.println("Введите название издания  для поиска ");
                    name = scan.next();
                    conteiner.search(name);
                    break;
            }}}}