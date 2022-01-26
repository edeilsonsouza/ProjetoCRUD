import javax.swing.*;

/**
 * __________________________________________________________________
 * Projeto CRUD em JAVA, 
 * Para avaliação dos recrutadores do Projeto +PraTI
 *
 *   *** INSTRUÇÕES RECEBIDAS ***
 *
 *   1) Criar um CRUD (Create, Read, Update, Delete) de
 *     pessoas/alunos no terminal usando somete Java:
 *       - Criar pessoa ou aluno
 *       - Mostrar todas as pessoas e alunos criados
 *         (Listar na tela)
 *       - Atualizar dados de uma pessoa ou aluno
 *       - Deletar uma pessoa ou aluno
 *       - Encerrar programa
 *   2) Informações de uma pessoa/aluno
 *       - Nome
 *       - Telefone
 *       - Data de nascimento
 *       - Data de cadastro da pessoa
 *       - Data da última alteração
 *       - Nota final do curso
 *   3) Caso o usuário informe a nota final do curso deve ser
 *      criado um aluno. Caso não seja informada, deve ser 
 *      criada uma pessoa.
 *   4) Criar menu interativo que o usuário possa usar para  
 *      executar as opções acima.
 *   5) O Menu deve continuar sendo exibido até que o 
 *      usuário use a opção de encerrar a aplicação.
 *   6) O avaliado deve usar arrays para armazenar as 
 *      informações criadas.
 *   7) O avaliado deve usar herança para que um aluno
 *      aproveite todos os dados da pessoa.
 *   8) Todas as informações ficam em memória. Não é
 *      necessário cadastrar em banco de dados. Ou seja,
 *      quando encerrar a aplicação perde-se todo o 
 *      histórico.
 * __________________________________________________________________
 * 
 * Classe EntradaSaida
 * 
 *     1) Classe auxiliar para receber e mostrar dados.
 *     2) Inclui os métodos:
 *         - método receberString 
 *         - método receberInt
 *         - método receberFloat
 *         - método receberDouble
 *         - método mostrarTexto
 * __________________________________________________________________
 * 
 * @author (Edeilson Souza) 
 * @email (edeilsonsouza@hotmail.com)
 * @version (1.0)
 */


public class EntradaSaida
{
    /**
     * Método receberString.
     * 
     *    - Declaração de variável tipo String.
     *    - Envia uma mensagem solicitando entrada de dados ao usuário.
     *    - Captura a mensagem do tipo String.
     *    - Retorna uma variável tipo String com a informação enviada pelo usuário.
    */

    public static String receberString(String msg) {
        // Declaração de variável String.
        String txt;
        // Envio de mensagem solicitando entrada de dados ao usuário.
        // Captura a informação enviada na variável txt.
        txt = JOptionPane.showInputDialog(msg);
        // Retorna a informação capturada em variável do tipo String.
        return txt;
    }
    
    /**
     * Método receberInt.
     * 
     *    - Declaração de variáveis.
     *    - Envia uma mensagem solicitando entrada de dados ao usuário.
     *    - Captura a mensagem do tipo String.
     *    - Faz a conversão dos dados tipos String para int.
     *    - Retorna uma variável tipo int com a informação enviada pelo usuário.
    */
   
    public static int receberInt(String msg) {
        // Deaclaração de variáveis.
        String snro;
        int inro;
        // Envio de mensagem solicitando entrada de dados ao usuário.
        // Captura a informação enviada na variável snro.  
        snro = JOptionPane.showInputDialog(msg);
        // Realiza a conversão de dados tipo String para int.
        inro = Integer.parseInt(snro);
        // Retorna a informação capturada em variável do tipo int.
        return inro;
    }
        
    /**
     * Método receberFloat.
     * 
     *    - Declaração de variáveis.
     *    - Envia uma mensagem solicitando entrada de dados ao usuário.
     *    - Captura a mensagem do tipo String.
     *    - Faz a conversão dos dados tipos String para float.
     *    - Retorna uma variável tipo float com a informação enviada pelo usuário.
    */
   
    public static float receberFloat(String msg) {
        // Declaração de variáveis
        String snro;
        float fnro;
        // Envio de mensagem solicitando entrada de dados ao usuário.
        // Captura a informação enviada na variável snro.  
        snro = JOptionPane.showInputDialog(msg);
        // Realiza a conversão de dados tipo String para float.
        fnro = Float.parseFloat(snro);
        // Retorna a informação capturada em variável do tipo float.
        return fnro;
    }
    
    /**
     * Método receberDouble.
     * 
     *    - Declaração de variáveis.
     *    - Envia uma mensagem solicitando entrada de dados ao usuário.
     *    - Captura a mensagem do tipo String.
     *    - Faz a conversão dos dados tipos String para double.
     *    - Retorna uma variável tipo double com a informação enviada pelo usuário.
    */
   
    public static double receberDouble(String msg) {
        // Declaração de variáveis
        String snro;
        double dnro;
        // Envio de mensagem solicitando entrada de dados ao usuário.
        // Captura a informação enviada na variável snro.  
        snro = JOptionPane.showInputDialog(msg);
        // Realiza a conversão de dados tipo String para double.
        dnro = Double.parseDouble(snro);
        // Retorna a informação capturada em variável do tipo double.
        return dnro;
    }
    
    /**
     * Método mostrarTexto.
     * 
     *    - Envia uma mensagem ao usuário.
    */
   
    public static void mostrarTexto(String txt) {
        // Envio de mensagem ao usuário.
        JOptionPane.showMessageDialog(null, txt);
    }
}
