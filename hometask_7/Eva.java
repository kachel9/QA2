package hometask_7;

public class Eva extends God{
    private String eye;
    public void setYye(String eye) {
        if (eye != null) {
            this.eye = eye;
        } else {
            System.out.println("No eye");
        }
    }
    public String getEye() {
        return eye;
    }
    Eva( String name, String sex,String eye){
        super(name, sex);
        this.eye=eye;
    }
    @Override
    public void select(){
        System.out.println("Eva`s eyes");
    }
}
