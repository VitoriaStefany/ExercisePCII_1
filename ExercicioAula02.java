/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercícioaula02;


public class ExercicioAula02 {

    
    public static void main(String[] args) {
        Cao c1 = new Cao();
        c1.setRaça("Buldogue francês");
        c1.setPorte("Pequeno");
        c1.setCor("Marrom");

        Baleia b1 = new Baleia();
        b1.setEspecie("Baleia Azul");
        b1.setHabitat("Águas frias");
        b1.setNadadeiras(true);
        b1.setCor("Azul-acinzentado");
        b1.setAlimentacao("Crustáceos");
        b1.setDente(false);

        b1.dados();
    }
}
