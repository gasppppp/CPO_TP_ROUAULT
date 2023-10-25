/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_rouault_version_console;

/**
 *
 * @author Gaspard Rouault
 */
public class LightOff_ROUAULT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1=new CelluleLumineuse();
        
        System.out.println(cellule1.getEtat());
        cellule1.activerCellule();
        System.out.println(cellule1.getEtat());
    }
    
}
