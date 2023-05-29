import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class func {

    public static Integer rnd(int num){
        Random rd = new Random();
        Integer res = rd.nextInt(0, num);
        return res;
    }
    public static Set<Notebook> createNotebooks() {
        Set<Notebook> notebooks = new HashSet<>();
        int[] rams = new int[] {2, 4, 8, 16};
        int[] hards = new int[] {256, 512, 1024, 2048};
        String[] os = new String[] {"Windows", "Linux", "IOS"};
        String[] colors = new String[] {"White", "Black", "Silver", "Red"};
        for (int i = 0; i < 10; i++){
            Notebook n = new Notebook(rams[rnd(rams.length)], hards[rnd(hards.length)], os[rnd(os.length)], colors[rnd(colors.length)]);
            notebooks.add(n);
        }
        return notebooks;
    }
    public static Notebook requiredParameters() {
        Notebook required = new Notebook(0, 0, "", "");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите ОЗУ: 1 - 1Gb, 2 - 2GB, 3 - 4Gb, 4 - 8Gb, 0 - любой: ");
        String ram = sc.nextLine();
        switch (ram) {
            case "1":
                required.setRam(1);
            case "2":
                required.setRam(2);
            case "3":
                required.setRam(4);
            case "4":
                required.setRam(8);

        }
        System.out.println("Выберите объём памяти: 1 - 256Gb, 2 - 512Gb, 3 - 1Tb, 0 - любой: ");
        String hard = sc.nextLine();
        switch (hard) {
            case "1":
                required.setHardSize(256);
            case "2":
                required.setHardSize(512);
            case "3":
                required.setHardSize(1024);
        }
        System.out.println("Выберите операционную систему 1 - Windows, 2 - Linux, 3 - IOS, 0 - любой: ");
        String os = sc.nextLine();
        switch (os) {
            case "1":
                required.setOperationSystem("Windows");
            case "2":
                required.setOperationSystem("linux");
            case "3":
                required.setOperationSystem("IOS");
        }
        System.out.println("Выберите цвет: 1 - белый, 2 - чёрный, 3 - красный, 0 - любой: ");
        String color = sc.nextLine();
        switch (color) {
            case "1":
                required.setColor("White");
            case "2":
                required.setColor("Black");
            case "3":
                required.setColor("Red");
        }
        System.out.println(required);
        return required;
    }
}
