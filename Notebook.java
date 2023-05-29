import java.util.Set;

public class Notebook {
    int ram;
    int hardSize;
    String operationSystem;
    String color;

    public Notebook(int ram, int hardSize, String operationSystem, String color) {
        this.ram = ram;
        this.hardSize = hardSize;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public void findNotebook(Notebook parameters, Set<Notebook> notebooks) {
        for (Notebook i : notebooks) {
            if ((parameters.ram <= i.ram || parameters.ram == 0) &
                    (parameters.hardSize <= i.hardSize || parameters.hardSize == 0) &
                    (parameters.operationSystem.equals(i.operationSystem) || parameters.operationSystem.isEmpty()) &
                    (parameters.color.equals(i.color) || parameters.color.isEmpty())
            ) {
                System.out.println(i);
            }
        }

    }

    @Override
    public String toString() {
        return "ОЗУ: " + ram + ", Объём жесткого диска: " + hardSize + ", Операционная система: " + operationSystem + ", Цвет: " + color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardSize(int hardSize) {
        this.hardSize = hardSize;
    }

    public void setOperationSystem(String operationSystem){
        this.operationSystem = operationSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }
}