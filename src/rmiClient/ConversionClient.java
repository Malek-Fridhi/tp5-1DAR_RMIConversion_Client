package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {
    public static void main(String[] args) {
        try {
        	// Recherche du service distant à l'adresse "rmi://localhost:8088/ConversionObject"
            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:8088/ConversionObject");
            // Casting de l'objet distant au type de l'interface IConversion
            
         // Appel de la méthode distante convertirMontant() avec deux exemples d'arguments
            System.out.println("Monatant 3000.00 en EUR : " + stub.convertirMontant(3000.00));
            System.out.println("Monatant 100.00 en EUR : " + stub.convertirMontant(100.00));
        }catch(Exception e){		// Gestion des exceptions : affiche la trace de la pile en cas d'erreur
            e.printStackTrace();
        }
    }
}