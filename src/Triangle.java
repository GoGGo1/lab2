public class Triangle extends Form {
    private float height;
    private float base;
    public Triangle() {}
    public Triangle(float height, float base,String color) {
        super(color);
        this.height = height;
        this.base = base;
    }
    public float getArea() {
        return (height * base)/2;
    }
    public String toString() {
        return super.toString() + ", a height of " + height + " and a base of " + base;
    }
    public boolean equals(Object o) {
     return this.base==((Triangle)o).base && this.height==((Triangle)o).height;
    }


}
