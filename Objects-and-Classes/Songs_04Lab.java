import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04Lab {
    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputSong = scanner.nextLine().split("_");
            String inputTypeList = inputSong[0];
            String inputName = inputSong[1];
            String inputTime = inputSong[2];

            Song currentSong = new Song();
            currentSong.setTypeList(inputTypeList);
            currentSong.setName(inputName);
            currentSong.setTime(inputTime);

            songList.add(currentSong);
        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item:songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item:songList) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
