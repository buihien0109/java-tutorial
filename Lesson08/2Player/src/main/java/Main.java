import model.Player;
import service.PlayerService;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final PlayerService playerService = new PlayerService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        boolean isQuit = false;
        int option = 0;

        while (!isQuit) {
            showMenu();

            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    List<Player> players = playerService.buildTeam(1, 4, 4, 2);
                    players.forEach(System.out::println);
                }
                case 2 -> {
                    List<Player> players = playerService.buildTeam(1, 4, 3, 3);
                    players.forEach(System.out::println);
                }
                case 3 -> {
                    List<Player> players = playerService.buildTeam(1, 3, 5, 2);
                    players.forEach(System.out::println);
                }
                case 4 -> isQuit = true;
                default -> System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. 1GK - 4DF - 4MF - 2FW");
        System.out.println("2. 1GK - 4DF - 3MF - 3FW");
        System.out.println("3. 1GK - 3DF - 5MF - 2FW");
        System.out.println("4. Thoát");
    }
}
