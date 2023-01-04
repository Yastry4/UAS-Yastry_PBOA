class HitunganLingkaran {
    double jarijari;
    double phi;
    double keliling,luas;
    double diameter;

    HitunganLingkaran(int jarijari,double phi){
        this.jarijari = jarijari;
        this.phi = phi;
        this.keliling = 2*phi*jarijari;
        this.luas = phi*jarijari*jarijari;
        this.diameter = 2 * jarijari;
    }

public double hitungdiameter(){
    return diameter;
}
public double hitungkeliling(){
    return keliling;
}
public double hitungluas(){
    return luas;
}
public double hitungjarijari(){
    return jarijari;

}

public void display(){
    System.out.println("Jari-Jari adalah \t:" + this.jarijari);
    System.out.println("Diameter Lingkaran\t:" + this.hitungdiameter());
    System.out.println("Luas Lingkaran\t\t:" + this.hitungluas());
    System.out.println("Keliling Lingkaran\t:" + this.hitungkeliling());
}

public static class Lingkaran {
    public static void main(String[] args) {
       HitunganLingkaran ling = new HitunganLingkaran(4, 5);
    
       ling.display();
    }  
}
}
