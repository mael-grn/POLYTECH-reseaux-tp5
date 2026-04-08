package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("\n\nEn tout premier lieux, remémorons nous ces douces paroles de M.Morge : \"C'est comme les témoins de Jéhovah, ça vient toujours par deux\".\n\n");

        System.out.println("Maintenant, nous pouvons scanner les ports 21 à 80 en UDP : \n");

        MonScannerUDP.scanUDPPorts(21, 80);

        System.out.println("\nLe port 80 est libre, car apache utilise TCP alors que nous venons de scanner en UDP.");
        System.out.println("Nous allons maintenant scanner les mêmes ports en TCP : \n");

        MonScannerTCP.scanTCPPorts(21, 80);

        System.out.println("Cette fois ci, le port 80 est occupé, comme prévu.");
    }
}
