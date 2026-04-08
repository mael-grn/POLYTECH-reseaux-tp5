package org.example;

import java.io.IOException;
import java.net.ServerSocket;

public class MonScannerTCP {
    public static void scanTCPPorts(int portMin, int portMax) {
        for (int i = portMin; i <= portMax; i++) {
            try {
                ServerSocket ss = new ServerSocket(i);
                System.out.println("Port " + i + " libre.");
                ss.close();
            } catch (IOException e) {
                System.out.println("Port " + i + " occupé.");
            }
        }
    }
}
