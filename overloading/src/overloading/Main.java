/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

/**
 *
 * @author muhammadalifmakkasau
 */
public class Main {
    public static void main(String[] args) {
        Pesawat pesawat1 = new Pesawat("GA123");
        Pesawat pesawat2 = new Pesawat("JT456", 150);

        pesawat1.infoPesawat();
        System.out.println("===========");
        pesawat2.infoPesawat();
    }
}

