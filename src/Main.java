import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagingWorker managingWorker=new ManagingWorker();
        Scanner sc=new Scanner(System.in);
        managingWorker.add(new Worker("Anh",27,"Nam","Nam Định","điều phối"));
        managingWorker.add(new Worker("Kiên",26,"Nam","Hà Nội","sản xuất"));
        managingWorker.add(new Worker("Quân",23,"Nữ","Bắc Giang","bảo vệ"));
        managingWorker.add(new Worker("Hiệu",18,"Nam","Lào Cai","bốc vác"));
        managingWorker.add(new Worker("Sơn",21,"Nữ","Yên Bái","lái máy"));
        managingWorker.add(new Worker("Tiến",30,"Nam","Hải Phòng","tạp vụ"));
        managingWorker.runProgram();
    }
}
