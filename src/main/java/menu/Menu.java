package menu;

import authorization.LogIn;
import authorization.SignUp;
import entity.User;

import java.util.Scanner;

public class Menu {

    public Menu() {
    }
    Scanner in = new Scanner(System.in);
    MenuFunctions menuFunctions = new MenuFunctions();

    public void introducingMenu() {
        LogIn logIn = new LogIn();
        SignUp signUp = new SignUp();
        String choice = "0";
        while (Integer.parseInt(choice) != 3) {
            String s = "Меню\n" +
                    "1. Войти\n" +
                    "2. Зарегистрироваться\n" +
                    "3. Выход\n" +
                    "Выбор: ";
            System.out.print(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    logIn.authorization();
                    break;
                case "2":
                    signUp.registration();
                    break;
                case "3":
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }

    public void mainMenu(User currentUser) {
        String choice = "0";
        while (Integer.parseInt(choice) != 6) {
            String s = "Меню\n" +
                    "1. Компании\n" +
                    "2. Машины\n" +
                    "3. Пользователи\n" +
                    "4. Выход\n" +
                    "Выбор: ";
            System.out.print(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    menuWithCompanies();
                    break;
                case "2":
                    menuWithCars();
                    break;
                case "3":
                    menuWithUsers();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }

    private void menuWithUsers() {
        String choice = "0";
        while (Integer.parseInt(choice) != 5) {
            String s = "Работа с пользователями\n" +
                    "1. Добавить пользователя\n" +
                    "2. Изменить личные данные пользователя\n" +
                    "3. Удалить пользователя\n" +
                    "4. Просмотреть всех пользователей\n" +
                    "5. Выход\n" +
                    "Выбор: ";
            System.out.print(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    menuFunctions.addPerson();
                    break;
                case "2":
                    menuFunctions.updatePerson();
                    break;
                case "3":
                    menuFunctions.deletePerson();
                    break;
                case "4":
                    menuFunctions.showPeople();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }

    private void menuWithCompanies() {
        String choice = "0";
        while (Integer.parseInt(choice) != 5) {
            String s = "Работа с компаниями\n" +
                    "1. Добавить компанию\n" +
                    "2. Изменить компанию\n" +
                    "3. Удалить компанию\n" +
                    "4. Вывести все компании\n" +
                    "5. Выход\n" +
                    "Выбор: ";
            System.out.print(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(menuFunctions.addCompany());
                    break;
                case "2":
                    menuFunctions.updateCompany();
                    break;
                case "3":
                    menuFunctions.deleteCompany();
                    break;
                case "4":
                    menuFunctions.showCompanies();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }

    private void menuWithCars() {
        String choice = "0";
        while (Integer.parseInt(choice) != 7) {
            String s = "Работа с машинами\n" +
                    "1. Добавить машину\n" +
                    "2. Изменить машину\n" +
                    "3. Удалить машину\n" +
                    "4. Вывести все машины\n" +
                    "5. Вывести все машины одной компании\n" +
                    "6. Найти машину по названию\n" +
                    "7. Выход\n" +
                    "Выбор: ";
            System.out.print(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    menuFunctions.addCar();
                    break;
                case "2":
                    menuFunctions.updateCar();
                    break;
                case "3":
                    menuFunctions.deleteCar();
                    break;
                case "4":
                    menuFunctions.showCars();
                    break;
                case "5":
                    menuFunctions.showCarsFromOneCompany();
                    break;
                case "6":
                    menuFunctions.findCarByName();
                case "7":
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }
}
