package hometask_7;

public class Earth extends God {
    private int size;

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("ERROR SIZE");
        }
    }

    public int getSize() {
        return size;
    }

    Earth(String name, int size) {
        super(name);
        this.size = size;
    }
    @Override
    public void select(){
        System.out.println("Obj name: Earth");
    }
}
