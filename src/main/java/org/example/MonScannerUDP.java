package org.example;

import java.net.DatagramSocket;
import java.net.SocketException;

public class MonScannerUDP {
    public static void scanUDPPorts(int portMin, int portMax) {
        for (int i = portMin; i <= portMax; i++) {
            try {
                DatagramSocket ds = new DatagramSocket(i);
                System.out.println("Port " + i + " libre.");
                ds.close();
            } catch (SocketException e) {
                System.out.println("Port " + i + " occupé.");
            }
        }
    }
}
