package HomeTask7;

public class Gelpolish extends Hand {
    private String str;

    public void setStr(String str) {
        if (str != null) {
            this.str = str;
        } else {
            System.out.println("Error STR");
        }
    }
    public String getStr() {
        return str;
    }
    @Override
    public void select(){
        System.out.println("Class name: GelPolish");
    }
}


