import java.security.Key;
import java.util.*;

public class Main {

    public HashMap<String, Integer> presenze;

    public Main(String key, int value){
        presenze = new HashMap<>();
    }

    public void aggiungiStudente(String nome){
        if(presenze.containsKey(nome)){
            System.out.println("Studente già presente: " + nome);
        }else {
            presenze.put(nome,0);
            System.out.println("Studente aggiunto: " + nome);
        }
    }

    public void registraPresenze(String nome){
        if (!presenze.containsKey(nome)){
            System.out.println("Studente non trovato: " + nome);
        }else {
            presenze.put(nome, presenze.get(nome) +1);
            System.out.println("Presenze registrata per " + nome);
        }
    }

    public void stampaPresenze(){
        if(presenze.isEmpty()){
            System.out.println("Nessuna presenza registrata");
        }
        System.out.println("PRESENZE");
        for (Map.Entry<String, Integer> entry : presenze.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " presenze");
        }
    }

    public void cercaStudente(String nome){
        if (!presenze.containsKey(nome)){
            System.out.println("Studente non trovato: " + nome);
        }else {
            System.out.println(nome + " ha" + presenze.get(nome));
        }
    }


    public void studentePiuPresente() {
        if (presenze.isEmpty()) {
            System.out.println("Nessuno studente registrato");
            return;
        }

        String migliore = null;
        int max = -1;

        for (Map.Entry<String, Integer> entry : presenze.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                migliore = entry.getKey();
            }
        }

        System.out.println("Studente più presente: " + migliore + " con " + max + " presenze");
    }

    public static void main(String[] args) {
        aggiungiStudente("Davide");
        aggiungiStudente("Giacomo");
        aggiungiStudente("Federico");
        aggiungiStudente("Giacomo");       // duplicato
        registraPresenze("Davide");
        registraPresenze("Davide");
        registraPresenze("Davide");
        registraPresenze("Giacomo");
        registraPresenze("Giacomo");
        registraPresenze("Federico");
        registraPresenze("Brahim");         // non esiste
        stampaPresenze();
        System.out.println("\nRICERCA STUDENTE:");
        System.out.println("Presenze di Davide: " + cercaStudente("Davide"));
        System.out.println("Presenze di Brahim: " + cercaStudente("Brahim"));
        System.out.println();
        studentePiuPresente();
    }
}
