import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[5000];
        fillArray(notebooks);
        toSortArray(notebooks);
        for (Notebook notebook: notebooks) {
            notebook.printInfo();
        }

    }

    private static void toSortArray(Notebook[] notebooks) {
        int min;
        long a = System.currentTimeMillis();
        for (int i = 0; i < notebooks.length-1 ; i++) {
            min=i;
            for (int j = i+1; j < notebooks.length; j++) {
                if (notebooks[j].getPrice()!=notebooks[min].getPrice()){
                if(notebooks[j].getPrice()<notebooks[min].getPrice()){
                    min=j;

                }}
                else if(notebooks[j].getMemory()!=notebooks[min].getMemory()){
                  if (notebooks[j].getMemory()<notebooks[min].getMemory()) {
                      min = j;
                  }
                }
                else  if(notebooks[j].getManufacturer().compareTo(notebooks[min].getManufacturer())!=0) {
                    if(notebooks[j].getManufacturer().compareTo(notebooks[min].getManufacturer())<0){
                        min = j;
                    }
                }
            }
            Notebook temp= notebooks[i];
            notebooks[i]=notebooks[min];
            notebooks[min]=temp;
        }
        System.out.println(System.currentTimeMillis()-a+ " время сортировки");


    }

    private static void fillArray(Notebook[] notebooks) {
        Random random = new Random();
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook(Price.values()[random.nextInt(6)].getPrice(),
                    Memory.values()[random.nextInt(5)].getMemory(),
                    Manufacturer.values()[random.nextInt(5)]);
        }
    }


}
