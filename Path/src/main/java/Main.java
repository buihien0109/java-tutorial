import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        // Tạo đối tượng path
        Path pathUpload = Paths.get("upload");
        Path pathDownload = Paths.get("download");

        // Đường dẫn tuyệt đối
        // /Users/buihien/Documents/own-github/java-tutorial/Path/upload
        System.out.println(pathUpload.toAbsolutePath());
        System.out.println(pathDownload.toAbsolutePath());

        // Chuyển đối tượng path -> file
        File fileUpload = pathUpload.toFile();
        File fileDownload = pathDownload.toFile();

        // Nếu path chưa tồn tại -> Tạo thư mục
        if(!fileUpload.exists()) {
            fileUpload.mkdir();
        }

        if(!fileDownload.exists()) {
            fileDownload.mkdir();
        }

        makePhoto("image_03", fileUpload, fileDownload);
    }

    // Tạo 1 file với tên bất kỳ trong file download và copy từ file upload bất kỳ sang file đó
    public static void makePhoto(String fileName, File folderResource, File folderDestination) throws IOException {
        // Kiểm tra xem có phải folder hay không
        if(!folderResource.isDirectory()) {
            System.out.println("Không phải là folder");
            return;
        }
        // Lấy danh sách file trong folder
        File[] files = folderResource.listFiles();

        // Kiểm tra danh sách file
        if(files.length == 0) {
            System.out.println("Danh sách file trống");
            return;
        }
        // Liệt kê danh sách file
        for (File f: files) {
            System.out.println(f.getName());
        }

        // Random 1 file ngẫu nhiên trong folder;
        Random rd = new Random();
        File fileRandom = files[rd.nextInt(files.length)];

        // Lấy extension của fileRandom
        String extension = getFileExtension(fileRandom);

        // Tạo 1 file với tên bất kỳ trong thư mục
        Path newFilePath = folderDestination.toPath().resolve(fileName + extension);
//        Files.createFile(newFilePath);

        // Tạo buffer
        BufferedOutputStream bufferedStream = new BufferedOutputStream(new FileOutputStream(newFilePath.toFile()));

        // Copy các byte data từ file -> fileServer
        bufferedStream.write(Files.readAllBytes(newFilePath));
        bufferedStream.close();
    }

    private static String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }
}
