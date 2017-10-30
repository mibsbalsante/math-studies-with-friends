import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Arquivo {

    String nome, nomes[];
    List linhas = new ArrayList();
    List elementosLinhas;
    int numCols, r;
    List listaGeralDistancias = new ArrayList();
    List<Double> listaDistanciaIndividual = new ArrayList();

    public void lerArquivo(){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o nome de arquivo texto:\n");
        nome = ler.nextLine();

        System.out.printf("Informe qual distância deseja (Manhattan - 1 | Euclidiana - 2):\n");
        r = ler.nextInt();


        System.out.printf("\nConteúdo do arquivo texto:\n");

        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            /** lê a primeira linha. A variável "linha" recebe o valor "null" quando o processo de repetição atingir o final do arquivo texto */
            String linha = lerArq.readLine();
            nomes = linha.split(" ");
            numCols = linha.split(" ").length;
            linha = lerArq.readLine();

            /** MONTAR LISTA DE CARACTERES */
            while (linha != null) {
                System.out.printf("%s\n", linha);
                montarLista(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }


            for (int i = 0; i <= elementosLinhas.size(); i++){
                if (i != 0) {
                    listaGeralDistancias.add(listaDistanciaIndividual);
                    /** Abaixo faço (i-1) para conseguir manipular a string nomes pois perco uma posicao no for quando i = 0 */
                    pegarPosicaoDosMenores(i-1);
                    listaDistanciaIndividual = new ArrayList();
                }
                /** O IF abaixo é colocado para permitir com que o for do (i) rode todas as posições */
                if (i != elementosLinhas.size()){
                    for (int j = 0; j < elementosLinhas.size(); j++){
                        if (i != j){
                            calcularDistancia(i, j);
                        }
                    }
                }

            }

            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }

    private void montarLista(String linha){
        elementosLinhas = new ArrayList();
        for(String num: linha.split(" ")){
            if (num.equals("*")){
                elementosLinhas.add(num);
            } else {
                elementosLinhas.add(Double.parseDouble(num));
            }
        }
        linhas.add(elementosLinhas);
    }


    private void calcularDistancia(int i, int j){
        double dist, soma = 0;
        for (int a = 0; a < linhas.size(); a++){
            List temp = (List) linhas.get(a);
            if (!temp.get(i).equals("*") && !temp.get(j).equals("*")){
                double numX = (double) temp.get(i);
                double numY = (double) temp.get(j);
                soma += Math.abs(Math.pow((numX - numY), (double)r));
            }
        }
        dist = Math.pow(soma, 1/(float)r);
        listaDistanciaIndividual.add(dist);
    }

    private void pegarPosicaoDosMenores(int posicaoPrincipal){
        List<Double> temp = new ArrayList();
        for (double num : listaDistanciaIndividual){
            temp.add(num);
        }
        Collections.sort(temp);
        List<Integer> posicoes = new ArrayList();
        Double teste = temp.get(0);
        for (int k = 0; k < temp.size(); k++){
            double teste2 = listaDistanciaIndividual.get(k);
            if (teste == teste2){
                posicoes.add(k);
            }
        }
        mostrarResultado(posicaoPrincipal, posicoes);
    }

    private void mostrarResultado(int posicaoPrincipal, List lista){
        int contador = 0;
        String novosNomes[] = new String[nomes.length];
        for (int i = 0; i < nomes.length; i++){
            if (posicaoPrincipal != i){
                novosNomes[contador] = nomes[i];
                contador++;
            }
        }
        String resultado = "O(s) mais próximo(s) de " + nomes[posicaoPrincipal].toUpperCase() + " => [";
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + " " + novosNomes[(int) lista.get(i)];
        }
        System.out.println(resultado + " ]");
    }


}