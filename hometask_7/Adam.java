package hometask_7;

public class Adam extends God {
    private String hcolor;
    public void setHcolor(String hcolor) {
        if (hcolor != null) {
            this.hcolor = hcolor;
        } else {
            System.out.println("Error Color");
        }
    }
    public String getHcolor() {
        return hcolor;
    }

    Adam ( String name, String sex, String hcolor, String pray){
        super(name,sex,pray);
        this.hcolor=hcolor;}

        @Override
                public void select(){
            System.out.println("Son name: Adam");
        }
    }

