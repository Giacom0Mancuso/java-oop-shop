package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
    int codiceProdotto;
    String nome;
    String descrizione;
    float prezzo;

    float iva;

    Prodotto(String nomeInput, String descizioneInput, float prezzoInput, float ivaInput){
        this.codiceProdotto = randomCode(codiceProdotto);
        this.nome = nomeInput;
        this.descrizione = descizioneInput;
        this.prezzo = prezzoInput;
        this.iva = ivaInput;
    }

    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public float getIva() {
        return iva;
    }

    public float prices(float prezzo, float iva, boolean yesOrNot){
        if (yesOrNot){
            return prezzo + (prezzo/100*iva);
        }
        else if (!yesOrNot) {
            return prezzo;
        }
        return 0;
    }

    private int randomCode(int codiceProdotto){
        Random generatore = new Random();
        codiceProdotto = codiceProdotto + generatore.nextInt(1000000) ;
        return codiceProdotto;
    }

    public String fullName(){
        return codiceProdotto + "-" + nome;
    }


}
