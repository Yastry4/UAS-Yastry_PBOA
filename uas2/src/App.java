class Pegawai{
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajiPokok;
    private double gajiBersih;
    
    
    public Pegawai(String nama, String jabatan, double pajak){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;
        
    }
     //getter 
    public double getgajiBersih(){
         return this.gajiBersih;
    }
    //setter
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;

}
    public double setgajiBersih(){
        return  gajiBersih = gajiPokok-(gajiPokok*pajak);

    }


public void display(){
    System.out.println("Nama Pegawai:" + this.nama);
    System.out.println("Jabtan: " + this.jabatan);
    System.out.println("Gaji Bersih:" + this.setgajiBersih());
}
}
public class App {
    public static void main(String[] args)  {
        Pegawai GajiBer = new Pegawai("Yas", "CEO", 0.3);
        GajiBer.setgajiPokok(10000000);
        GajiBer.display();
    }
}


