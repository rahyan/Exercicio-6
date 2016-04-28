public class Consumidor extends Thread {
    private int idConsumidor;
    private MeuBuffer pilha;
    private int totalConsumir;
 
    public Consumidor(int id, MeuBuffer p, int totalConsumir) {
        idConsumidor = id;
        pilha = p;
        this.totalConsumir = totalConsumir;
    }
 
    public void run() {
        for (int i = 0; i < totalConsumir; i++) {
            pilha.get(idConsumidor);
        }
        System.out.println("Consumidor #" + idConsumidor + " concluido!");
    }
}