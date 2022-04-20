package service;

import model.Player;
import model.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerService {
    private List<Player> players;

    public PlayerService() {
        init();
    }

    private void init() {
        players = new ArrayList<>();
        players.add(new Player(1, "Bùi Tấn Trường", Position.GK));
        players.add(new Player(1, "Đặng Văn Lâm", Position.GK));
        players.add(new Player(3, "Nguyễn Văn Hoàng", Position.GK));
        players.add(new Player(4, "Quan Văn Chuẩn", Position.GK));

        players.add(new Player(5, "Đỗ Duy Mạnh", Position.DF));
        players.add(new Player(6, "Nguyễn Thành Chung", Position.DF));
        players.add(new Player(7, "Trần Đình Trọng", Position.DF));
        players.add(new Player(8, "Nguyễn Phong Hồng Duy", Position.DF));
        players.add(new Player(9, "Vũ Văn Thanh", Position.DF));
        players.add(new Player(10, "Bùi Tiến Dũng", Position.DF));
        players.add(new Player(11, "Quế Ngọc Hải", Position.DF));
        players.add(new Player(12, "Hồ Tấn Tài", Position.DF));
        players.add(new Player(13, "Phạm Xuân Mạnh", Position.DF));
        players.add(new Player(14, "Đỗ Thanh Thịnh", Position.DF));

        players.add(new Player(15, "Nguyễn Quang Hải", Position.MF));
        players.add(new Player(16, "Phạm Đức Huy", Position.MF));
        players.add(new Player(17, "Lương Xuân Trường", Position.MF));
        players.add(new Player(18, "Nguyễn Tuấn Anh", Position.MF));
        players.add(new Player(19, "Trần Minh Vương", Position.MF));
        players.add(new Player(20, "Phan Văn Đức", Position.MF));
        players.add(new Player(21, "Nguyễn Hoàng Đức", Position.MF));
        players.add(new Player(22, "Lý Công Hoàng Anh", Position.MF));

        players.add(new Player(23, "Phạm Tuấn Hải", Position.FW));
        players.add(new Player(24, "Nguyễn Văn Toàn", Position.FW));
        players.add(new Player(25, "Nguyễn Công Phượng", Position.FW));
        players.add(new Player(26, "Hà Đức Chinh", Position.FW));
        players.add(new Player(27, "Nguyễn Tiến Linh", Position.FW));
    }

    public List<Player> buildTeam(int GKNumber, int DFNumber, int MFNumber, int FWNumber) {
        List<Player> selectedTeam = new ArrayList<>();
        selectedTeam.addAll(getPlayers(Position.GK, GKNumber));
        selectedTeam.addAll(getPlayers(Position.DF, DFNumber));
        selectedTeam.addAll(getPlayers(Position.MF, MFNumber));
        selectedTeam.addAll(getPlayers(Position.FW, FWNumber));

        return selectedTeam;
    }

    private List<Player> getPlayers(Position position, int number) {
        List<Player> selectedPlayers = new ArrayList<>();
        Random random = new Random();
        int count = 0;

        while (count < number) {
            int rdPlayer = random.nextInt(players.size());

            if (players.get(rdPlayer).getPosition().equals(position)
                    && !selectedPlayers.contains(players.get(rdPlayer))
            ) {
                selectedPlayers.add(players.get(rdPlayer));
                count++;
            }
        }

        return selectedPlayers;
    }
}
