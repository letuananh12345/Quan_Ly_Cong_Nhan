import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagingWorker managingWorker=new ManagingWorker();
        Scanner sc=new Scanner(System.in);
        managingWorker.workerMap.put("CNO1",new Worker("CON1","Anh",27,"Nam","Nam Định","điều phối"));
        managingWorker.workerMap.put("CNO1",new Worker("CON2","Kiên",26,"Nam","Hà Nội","sản xuất"));
        managingWorker.workerMap.put("CNO1",new Worker("CON3","Quân",23,"Nữ","Bắc Giang","bảo vệ"));
        managingWorker.workerMap.put("CNO1",new Worker("CON4","Hiệu",18,"Nam","Lào Cai","bốc vác"));
        managingWorker.workerMap.put("CNO1",new Worker("CON5","Sơn",21,"Nữ","Yên Bái","lái máy"));
        managingWorker.workerMap.put("CNO1",new Worker("CON6","Tiến",30,"Nam","Hải Phòng","tạp vụ"));
        managingWorker.runProgram();
    }
}
