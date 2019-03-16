
package listalifo;

import javax.swing.JOptionPane;

/**
 *
 * @author charles
 */
public class ListaLifo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String entra;
        int opcao;

        Lifo obj1 = new Lifo();
        obj1.inserir(21);
        obj1.inserir(22);
        obj1.inserir(23);
        obj1.inserir(24);

        //System.out.println("Retirei por ultimo: " + obj1.retirar(5));
        String mensagem = "Escolha uma opçao: \n "
                + "1 para detodar tudo \n "
                + "2 para quantidade de vagas \n "
                + "3 para quem esta no topo \n "
                + "4 para mostrar \n "
                + "5 para buscar \n "
                + "6 para retirar \n "
                + "7 para sair";

        do {
            entra = JOptionPane.showInputDialog(mensagem);
            opcao = Integer.parseInt(entra);

            switch (opcao) {
                case 1:
                    obj1.detonar();
                    break;
                case 2:
                    obj1.quantasVagas();
                    break;
                case 3:
                    obj1.quemEstaTopo();
                    break;
                case 4:
                    obj1.mostrar();
                    break;
                case 5:
                    entra = JOptionPane.showInputDialog("Digite o numero a ser buscado: ");
                    opcao = Integer.parseInt(entra);
                    obj1.buscar(opcao);
                    break;
                case 6:
                    entra = JOptionPane.showInputDialog("Digite o numero a ser retirado: ");
                    opcao = Integer.parseInt(entra);
                    obj1.retirar(opcao);
                    break;
                case 7:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opçao invalida.");
            }
        } while (opcao > 7);

    }
}
