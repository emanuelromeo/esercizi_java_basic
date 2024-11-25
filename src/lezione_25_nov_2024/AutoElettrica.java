//Crea una gerarchia di classi:
//
//Veicolo:
//
//Attributo: velocitàMassima (int)
//Metodo: mostraDettagli() stampa la velocità massima.
//Auto (sottoclasse di Veicolo):
//
//Attributo: numeroPorte (int)
//Metodo: sovrascrive mostraDettagli() per stampare velocità massima e numero di porte.
//AutoElettrica (sottoclasse di Auto):
//
//Attributo: capacitàBatteria (int)
//Metodo: sovrascrive mostraDettagli() per includere la capacità della batteria.
//Crea un oggetto AutoElettrica e chiama il metodo mostraDettagli().


package lezione_25_nov_2024;

public class AutoElettrica extends Auto {
    public int capacitàBatteria;

    @Override
    public void mostraDettagli() {
        System.out.println(
                "Velocità massima: " + this.velocitàMassima +
                "\nNumero di porte: " + this.numeroPorte +
                "\nCapacità della batteria : " + this.capacitàBatteria
        );
    }
}
