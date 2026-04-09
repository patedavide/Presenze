import java.security.Key;
import java.util.*;

public class Main {

    public HashMap<Key, Integer> presenze;

    public Main(String key, int value){
        presenze = new HashMap<>();
    }

    public void aggiungiStudente(Key nome){
        if(presenze.containsKey(nome)){
            System.out.println("Studente già presente: " + nome);
        }else {
            presenze.put(nome,0);
            System.out.println("Studente aggiunto: " + nome);
        }
    }

    public void registraPresenze(Key nome){
        if (!presenze.containsKey(nome)){
            System.out.println("Studente non trovato: " + nome);
        }else {
            int x= presenze.put(nome, presenze.get(nome) +1);
            System.out.println("Presenze registrata per " + nome);
        }
    }

    public void stampaPresenze(){
        if(presenze.isEmpty()){
            System.out.println("Nessuna presenza registrata");
        }
        System.out.println("PRESENZE");
        for (Map.Entry<Key, Integer> entry : presenze.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " presenze");
        }
    }


}
