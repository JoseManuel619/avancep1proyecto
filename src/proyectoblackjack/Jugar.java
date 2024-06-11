/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoblackjack;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Jugar {

    private ArrayList<carta> baraja;

    private class carta {
        String valor;
        String tipo;

        // Constructor
        public carta(String valor, String tipo) {
            this.valor = valor;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return valor + "-" + tipo;
        }
    }

    //  construir mi baraja
    public void baraja() {
        baraja = new ArrayList<carta>();
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] tipos = {"Corazones", "Diamantes", "Tréboles", "Flecha"};
//tomar cada parte de tipos, osea 1corazones 1diamantes etc
        for (String tipo : tipos) {
            for (String valor : valores) {
                //crear la carta
                baraja.add(new carta(valor, tipo));
            }
        }
    }
//usar baraja en otra clase
    public ArrayList<carta> getBaraja() {
        return baraja;
    }

    public void imprima() {
        for (carta carta : baraja) {
            System.out.println(carta);
        }
    }
}

  
