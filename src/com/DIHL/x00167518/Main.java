package com.DIHL.x00167518;

import javax.swing.*;

public class Main {

    static String menuPrincipal = "Haditas de Gualter, bienvenido\n1. Agregar empleado\n2. Despedir empleado, f\n" +
            "3. Ver lista de empleados\n4. Calcular sueldo\n5. Mostrar totales\n0. Salir";

    public static void main(String[] args) {
        int opcion = 0;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal));

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Bai joto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tas mas pendejo que la que " +
                            "pasa abriendo foros a cada rato, ai te ves");

            }

        } while (opcion != 0);

    }
}
