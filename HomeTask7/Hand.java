package HomeTask7;

public class Hand {
    private int fig;

    public void setFig(int fig) {
        if (fig > 0) {
            this.fig = fig;
        } else {
            System.out.println("Error Nail");
        }
    }
    public int getFig() {
        if (fig > 0) {
            return fig;
        } else {
            System.out.println("Error Nail");
        }
        return fig;}
        Hand() {
        }
        Hand(int fig){
        this.fig=fig;
        }
    public void select(){
        System.out.println("Nail Done");}
    }


