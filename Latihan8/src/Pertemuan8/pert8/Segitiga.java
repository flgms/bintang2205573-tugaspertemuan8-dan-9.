package Pertemuan8.pert8;

/**
 * Segitiga
 */
public class Segitiga extends ObjekGeometris{
    private double sisi1;
    private double sisi2;
    private double sisi3;

    // konstruktor tanpa argumen
    public Segitiga() {
    }

    // konstruktor dengan argumane sisi
    public Segitiga(double sisi1, double sisi2, double sisi3) {
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
    }

    // metode pengakses untuk bidang data 
    public double getSisi1(){
        return sisi1;
    }
    public double getSisi2(){
        return sisi2;
    }
    public double getSisi3(){
        return sisi3;
    }

    // metode untuk menghitung luas segitiga
    public double getArea(){
        double s = (sisi1 + sisi2 + sisi3)/2;
        return Math.sqrt(s*(s-sisi1)*(s-sisi2)*(s-sisi3));
    }

    // metode untuk menghitung keliling segitiga
    public double getPerimeter(){
        return sisi1 + sisi2 + sisi3;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Segitiga: sisi1 =" + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }

}