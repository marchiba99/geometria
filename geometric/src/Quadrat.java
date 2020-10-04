public class Quadrat extends Rectangle{
    private int r;

    public Quadrat(int r){
        super(r,r);
    }
    public String toString() {
        return "Quadrat l:" + super.getL1()+ "area: (("+this.area()+"))";
    }
}
