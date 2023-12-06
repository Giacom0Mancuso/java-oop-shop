package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nome");
        String nomeInput = scanner.nextLine();
        System.out.println("descizione");
        String descizioneInput = scanner.nextLine();
        System.out.println("prezzo");
        float prezzoInput = Float.parseFloat(scanner.nextLine());
        System.out.println("iva");
        float ivaInput = Float.parseFloat(scanner.nextLine());
        System.out.println("Vuoi sapere il prezzo con l'iva? s/n");
        String yesOrNot = scanner.nextLine();
        boolean yesONot = true;
        if (yesOrNot.equals("s")){
            yesONot = true;
        } else if (yesOrNot.equals("n")) {
            yesONot = false;
        }
        Prodotto userProduct = new Prodotto(nomeInput, descizioneInput, prezzoInput, ivaInput);

        System.out.println(userProduct.prices(prezzoInput, ivaInput, yesONot));
        System.out.println(userProduct.fullName());

    }
}
