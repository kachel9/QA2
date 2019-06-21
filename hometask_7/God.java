package hometask_7;

public class God {
    private String sex;
    private String name;
    private String pray;
    public void setSex(String sex) {
        if (sex!=null){
            this.sex = sex;}
        else { System.out.println("Error SEX");
        }
    }
    public String getSex(String sex) {

            return sex;}

    public void setName(String name) {
        if (name!=null){
            this.name = name;}
        else { System.out.println("Error Name");
        }
    }
    public String getName(String name) {
        return name;}

    public String getPray (String pray){
        return pray;
    }
    God (){}
    God (String sex){
        this.sex=sex;
    }
    God (String sex, String pray){
        this.sex=sex;
        this.pray=pray;
    }
    God (String name, String sex, String pray){
        this.sex=sex;
        this.pray=pray;
        this.name=name;
    }
    public void select(){
        System.out.println(name+" "+sex+" "+pray);
    }
}
