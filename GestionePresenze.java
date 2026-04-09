import java.security.Key;
import java.util.*;

public class GestionePresenze {

    public HashMap<Key, Integer> presenze;

    public GestionePresenze(String key, int value){
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

    public void registraPresenze(Key nome)


}
