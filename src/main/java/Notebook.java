public class Notebook {
    private int price;
    private int memory;
    private Manufacturer manufacturer;

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Notebook(int price, int memory, Manufacturer manufacturer) {
        this.price = price;
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    public void printInfo() {
        System.out.println("Цена " + this.price + " память " + this.memory + "gb" + " производитель " + this.manufacturer);
    }
}
