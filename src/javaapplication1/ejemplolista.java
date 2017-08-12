/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;
public class ejemplolista {

    public static void main(String[] args) {

        lista l = new lista();
        while (true) {
            String opcion = JOptionPane.showInputDialog(""
                    + "1. Introducir un dato a la lista \n"
                    + "2. buscar un dato en la lista \n"
                    + "3. Mostrar los datos \n"
                    + "4. Salir  \n"
                    + "5. eliminar \n"
                    + "6. atender \n"
                    );

            int opc = Integer.parseInt(opcion);

            if ((opc >= 7) || (opc == 0)) {
                JOptionPane.showMessageDialog(null, "el numero ingresado no se encuentra en el rango del menu");
            }

              
            switch (opc) {
                case 1:
                    String Dato = JOptionPane.showInputDialog("Igrese nuevo dato en la lista ");
                    int datolista = Integer.parseInt(Dato);
                    nodo1 nd = new nodo1(datolista);
                    l.add(nd);
                    //l.insertarcabeza(datolista);
                    break;
                case 2:
                    String Busc = JOptionPane.showInputDialog("que dato desea buscar ");
                    int bus = Integer.parseInt(Busc);
                      nodo1 n = l.buscar(bus);
                    System.out.println(" este es el numero buscado " + n.dato);
                    break;

                case 3:
                    l.visualizar();
                    System.out.println(" ");
                    break;

                case 4:
                    
                    System.exit(0);
                    break;
                case 5:
                    String eliminado = JOptionPane.showInputDialog("Igrese el dato que quiere eliminar ");
                    int eli = Integer.parseInt(eliminado);
                    l.eliminar(eli);
                    break;
                case 6:
                    l.atender();
                    System.out.println("atendido");
               
            }
        }
    }
}