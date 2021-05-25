import java.util.*;

public class ManagingWorker {
    HashMap<String,Worker> workerMap=null;
    Scanner scanner = new Scanner(System.in);

    public ManagingWorker() {
        workerMap=new HashMap<>();
    }

    public ManagingWorker(HashMap<String, Worker> hashMap) {
        this.workerMap = hashMap;
    }
    void disPlay(){
        Set<String> keys= workerMap.keySet();
        for(String key : keys){
            System.out.println(workerMap.get(key));
        }
    }
    void add(){
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Address:");
        String address= scanner.nextLine();
        System.out.println("Enter Part:");
        String part=scanner.nextLine();
        Worker worker=new Worker(id,name,age,gender,address,part);
        workerMap.put(worker.getId(),worker);
    }

    Worker findById(String id){
        Set<String> keySet=workerMap.keySet();
        for(String key:keySet){
            if(key.equals(id)){
                return workerMap.get(id);
            }
        }
        return null;
    }
    void deleteleById(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID to Delete!");
        String id =sc.nextLine();
        if(findById(id)==null){
            System.out.println("Not thing ID");
        } else
            workerMap.remove(id);
    }
    void sortById(){
        Set<Map.Entry<String,Worker>>entries=workerMap.entrySet();
        List<Map.Entry<String,Worker>>entryList=new ArrayList<>(entries);
        Collections.sort(entryList, new Comparator<Map.Entry<String, Worker>>() {
            @Override
            public int compare(Map.Entry<String,Worker> o1, Map.Entry<String, Worker> o2) {
                return o1.getValue().getId().compareTo(o2.getValue().getId());
            }
        });
        LinkedHashMap<String,Worker>sortStudentMap=new LinkedHashMap<>(entryList.size());
        for (Map.Entry<String,Worker> entry:entryList){
            sortStudentMap.put(entry.getKey(),entry.getValue());
        }
        workerMap=sortStudentMap;
    }
    Worker exitById() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id:");
        String id=scanner.nextLine();
        if (findById(id)!=null) {
            System.out.println("Enter name:");
            findById(id).setName(scanner.nextLine());
            System.out.println("Enter age : ");
            findById(id).setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter Gender<Nam or Nữ>: ");
            findById(id).setGender(scanner.nextLine());
            System.out.println("Enter address:");
            findById(id).setAddress(scanner.nextLine());
            System.out.println("Enter part:");
            findById(id).setPart(scanner.nextLine());
        }else return null;

        return findById(id);
    }
    void menu(){
        System.out.println("Menu Managing Worker: ");
        System.out.printf("%-12s%-12s%s\n","1.Thêm","2.Sửa","3.Xóa");
        System.out.printf("%-12s%-12s%s\n","4.Tìm kiếm","5.Sắp xếp","6.Hiển thị");
        System.out.printf("0.Thoát");
        System.out.println();
    }
    void runProgram(){
        int choice;
        do{
            menu();
            System.out.println("Enter Selection: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the object to be add");
                    add();
                    break;
                case 2:
                    if(exitById()==null){
                        System.out.println("Not thing!");
                    }
                    break;
                case 3:
                    deleteleById();
                    break;
                case 4:
                    System.out.println("Enter ID to search: ");
                    findById(scanner.nextLine());
                    break;
                case 5:
                    sortById();
                    break;
                case 6:
                    disPlay();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice<=6&&choice>=0);

    }

}