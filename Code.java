import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double pi=3.14;
            System.out.print("Dairenin Yari Capini Giriniz :");
            double r=input.nextDouble();
            System.out.print("Merkez Aci Olcusunu Giriniz :");
            double merkezAci=input.nextDouble();
            double alan=pi*Math.sqrt(r);
            double cevre=2*pi*r;
            double daireDilimialan=alan*merkezAci/360;
            System.out.println("Dairenin Alani :" + alan);
            System.out.println("Dairenin Cevresi :" + cevre);
            System.out.println("Daire Diliminin Alani :" + daireDilimialan);
        }
        
    }
    
}
