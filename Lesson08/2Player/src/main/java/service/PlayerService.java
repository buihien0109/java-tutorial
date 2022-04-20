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

    // Khởi tạo danh sách cầu thủ
    private void init() {
        players = new ArrayList<>();
        // Các cầu thủ thuộc vị trí thủ môn
        players.add(new Player(1, "Bùi Tấn Trường", Position.GK));
        players.add(new Player(1, "Đặng Văn Lâm", Position.GK));
        players.add(new Player(3, "Nguyễn Văn Hoàng", Position.GK));
        players.add(new Player(4, "Quan Văn Chuẩn", Position.GK));

        // Các cầu thủ thuộc vị trí hậu vệ
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

        // Các cầu thủ thuộc vị trí tiền vệ
        players.add(new Player(15, "Nguyễn Quang Hải", Position.MF));
        players.add(new Player(16, "Phạm Đức Huy", Position.MF));
        players.add(new Player(17, "Lương Xuân Trường", Position.MF));
        players.add(new Player(18, "Nguyễn Tuấn Anh", Position.MF));
        players.add(new Player(19, "Trần Minh Vương", Position.MF));
        players.add(new Player(20, "Phan Văn Đức", Position.MF));
        players.add(new Player(21, "Nguyễn Hoàng Đức", Position.MF));
        players.add(new Player(22, "Lý Công Hoàng Anh", Position.MF));

        // Các cầu thủ thuộc vị trí tiền đạo
        players.add(new Player(23, "Phạm Tuấn Hải", Position.FW));
        players.add(new Player(24, "Nguyễn Văn Toàn", Position.FW));
        players.add(new Player(25, "Nguyễn Công Phượng", Position.FW));
        players.add(new Player(26, "Hà Đức Chinh", Position.FW));
        players.add(new Player(27, "Nguyễn Tiến Linh", Position.FW));
    }

    // Tạo danh sách cầu thủ với số lượng cầu thủ mỗi vị trí đã được chỉ định sẵn
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

        // Nếu số lượng cầu thủ chưa đủ thì tiếp tục random
        while (count < number) {
            // Random chỉ số của 1 cầu thủ bất kỳ
            int rdPlayer = random.nextInt(players.size());

            // Kiểm tra xem cầu thủ tại vị trí đó
            // Có cùng vị trí được yêu cầu hay không và đã được chọn hay chưa
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
