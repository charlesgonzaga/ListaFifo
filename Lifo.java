
package listalifo;

/**
 *
 * @author charles
 */
public class Lifo {
    
    private int pilha[];
    private int topo;
    
    public int[] getPilha(){
        return pilha;
    }
    
    public int getTopo(){
        return topo;
    }
    
    Lifo() {
        pilha = new int[10];
        topo = -1;
    }
    
    public boolean inserir(int quem) {
        if (topo < pilha.length - 1) {
            topo++;
            pilha[topo] = quem;
            return true;
        }
        return false;
    }
    
    public void retirar(int retirar) {
        int aux = -99;
        
        if (retirar <= topo + 1) {
            for(int x = 0; x < retirar; x++)
                topo--;
            aux = pilha[topo + 1];
        }
        
        System.out.println("Retirei por ultimo: " + aux);
    }
    
    public void buscar(int buscar) {
        int aux = -1;
        for(int x = 0; x <= topo; x++){
            if(pilha[x] == buscar)
                aux = x;
        }
        System.out.println("Buscando " + buscar + " seu indice e: " + aux);
    }
    
    public void mostrar() {
        int aux;
        if (topo >= 0) {
            System.out.println("Veja a pilha");
            for (aux = topo; aux >= 0; aux--)
                System.out.print(" " + pilha[aux] + "\n");
        }else
            System.out.println("Pilha vazia \n");
    }
    
    public void detonar() {
        topo = -1;
    }
    
    public void quantasVagas() {
        //int aux = pilha.length - (topo + 1);
        int aux = pilha.length - topo - 1;
        System.out.println("Total de vagas: " + aux + "\n");
    }
    
    public void quemEstaTopo() {
        System.out.println("Quem esta no topo e: " + pilha[topo] + "\n");
    }
    
}
