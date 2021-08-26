public enum Memory {
    FOUR(4), SIX(6), EIGHT(8), TEN(10), TWELVE(12);
    private int memory;

    Memory(int memory){
        this.memory=memory;
    }

    public int getMemory(){
        return memory;
    }
}
