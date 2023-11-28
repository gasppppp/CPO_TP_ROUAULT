/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_rouault;

/**
 *
 * @author Gaspard Rouault
 */
public class Convertisseur {
    
    int nbConversions;
    public void Convertisseur(){
      nbConversions = 0 ;
    }

    
    public double CelciusVersKelvin(double tCelcius ) {
       nbConversions++;
       
       return (tCelcius + 273.15);
       
    }
    public double KelvinVersCelcius(double tKelvin ) {
       nbConversions++;
       return (tKelvin - 273.15);
    }
    public double FarenheitVersCelcius(double tFarenheit ) {
       nbConversions++;
       return (tFarenheit - 32);
    }
    public double CelciusVersFarenheit(double tCelcius ) {
       nbConversions++;
       return (tCelcius + 32);
    }
    public double KelvinVersFarenheit(double tKelvin ) {
       nbConversions=(nbConversions++)-1;
       
       return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }
    public double FarenheitVersKelvin(double tFarenheit ) {
       nbConversions=(nbConversions++)-1;
       return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }
    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
    }

    
}
