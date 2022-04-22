public class Circle implements Shape{

    public static final double PI = Math.PI;

    protected double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return PI * (radio * 2);
    }
}
