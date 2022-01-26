import java.util.*;

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
 * Classe Processamento
 * 
 *     1) Cria o ArrayList dados do tipo Cadastro.
 *     2) Inclui os métodos "CRUD"(Create, Read, Update, Delete).
 *         - método createCadastro 
 *         - método readCadastro
 *         - método updateCadastro
 *         - método deleteCadastro
 *     3) Inclui também o método auxiliar de pesquisa.
 *         - método returnCadastro     
 * __________________________________________________________________
 * 
 * @author (Edeilson Souza) 
 * @email (edeilsonsouza@hotmail.com)
 * @version (1.0)
 */

public class Processamento
{
   /**
    * Criação do ArrayList dados do tipo Cadastro.
   */
    
   private static ArrayList<Cadastro> dados = new ArrayList<Cadastro>();
   
   /**
    * Método createCadastro.
    * 
    *    - Declaração de variáveis.
    *    - Inicialização de variáveis.
    *    - Coleta dos dados cadastrais.
    *    - Criação do objeto Pessoa ou Aluno.
    *         - Se informada a nota final.
    *             - Cria um objeto aluno.
    *         - Senão.
    *             - Cria um objeto pessoa.
    *    - Adiciona os dados coletados ao objeto criado.
   */
  
   public static void createCadastro() {
        // Declaração de variáveis.
        String nome, telefone, dataNasc, dataCad, dataUltAlt, nFinal; 
        double notaFinal;
        int auxNF;
        Cadastro cad; //Variável cad do tipo Cadastro (ArrayList).
        // Inicialização de variáveis.
        nFinal = null;
        // Coleta dos dados cadastrais.
        nome = EntradaSaida.receberString("Nome: ");
        telefone = EntradaSaida.receberString("Telefone: ");
        dataNasc = EntradaSaida.receberString("Data de nascimento: ");
        dataCad = EntradaSaida.receberString("Data do cadastro: ");
        dataUltAlt = EntradaSaida.receberString("Data da ultima alteracao: ");
        //Definição se a notafinal será informada.
        auxNF = EntradaSaida.receberInt("Deseja informar nota final? Digite 1 - Sim, 2 - Não");
        while (auxNF < 1 || auxNF > 2){
                    // Enquanto opção inválida for informada,
                    // solicita a informação de opção válida.
                    auxNF = EntradaSaida.receberInt("Continuar ou Encerrar o programa? Digite 1 - para Continuar, 2 - para Encerrar.");
                }

        // Criação do Objeto Pessoa ou Aluno a partir da informação da nota final.
        if (auxNF == 1) {
            // Usuário deseja informar nota final.
            // inicio das rotinas de criação do objeto Aluno.
            // Solicitar a informação da nota final.
            nFinal = EntradaSaida.receberString("Nota Final do curso: ");
            // Conversão de tipo da variável nota final de String para Float;
            notaFinal = Double.parseDouble(nFinal);
            // Variável auxiliar para identificação e manipulação do objeto criado.
            String objCriado ="Aluno"; 
            // Criação do Objeto Aluno.
            cad = new Aluno(nome,telefone,dataNasc,dataCad,dataUltAlt,objCriado,notaFinal);
        } 
        else {
            // Usuário não deseja informar a nota final.
            // inicio das rotinas de criação do objeto Pessoa.
            // Variável auxiliar para identificação e manipulação do objeto criado.
            String objCriado ="Pessoa"; 
            // Criação do Objeto Pessoa
            cad = new Pessoa(nome,telefone,dataNasc,dataCad,dataUltAlt,objCriado);
        }
        //Adição dos dados cadastrados ao objeto criado.
        dados.add(cad);
    }
    
   /**
    * Método readCadastro.
    *     - Inicialização de variável.
    *     - Solicita nome a ser pesquisado.
    *     - Chama o método auxiliar de pesquisa de nomes, returnCadastro.
    *         - Se cadastro diferente de null .
    *             - Acrescenta os dados cadastrais solicitados a variável saida.
    *         - Senão.
    *             - Altera o valor da variável saida para "Nenhum resultado encontrado".
    *     - Mostra na tela os dados da variável saida.
   */
   
   public static void readCadastro() {
        // Inicialização de variável.
        String saida = "";
        // Solicitação do nome a ser pesquisado.
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        // Chamada do método auxiliar de pesquisa de nomes.
        Cadastro cad = returnCadastro(pesq);
        // Se retorno do método auxiliar for diferente de null, 
        // acrescenta os dados solicitados a variável saida.
        if (cad != null) {
            saida = saida + cad.getNome() + "\n";
            saida += cad.getTelefone() + "\n";
            saida += cad.getDataNascimento() + "\n";
            saida += cad.getDataCadastro() + "\n";
            saida += cad.getDataUltimaAlteracao() + "\n";
            if (cad.getObjCriado() == "Aluno") {
            saida += cad.getNotaFinal() + "\n";
            }
        }
        // Senão, se retorno do método auxiliar for igual a null,
        // altera valor da variável saida para "Nenhum resultado encontrado"
        else {
            saida = "Nenhum resultado encontrado";
        }
        // Mostra o conteúdo da variável saída.
        EntradaSaida.mostrarTexto(saida);
    }
 
   /**
    * Método updateCadastro.
    *     - Inicialização de variável.
    *     - Solicita nome a ser pesquisado.
    *     - Chama o método auxiliar returnCadastro.
    *         - Se cadastro diferente de null .
    *             - Solicita qual dado deve ser alterado.
    *             - Realiza a alteração da variável solicitada.
    *             - Altera o valor da variável saída com os dados atualizados.
    *         - Senão
    *             - altera a variável saída e mostra na tela a informação de "Nenhum valor encontrado".
    *     - Mostra o valor da variável saída.
   */
  
   public static void updateCadastro() {
        // Inicialização de variável.
        String saida = "";
        // Solicitação do nome a ser pesquisado para alteração dos cadastros.
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        // Chamada do método auxiliar de pesquisa de nomes. 
        Cadastro cad = returnCadastro(pesq);
        // Se retorno do método auxiliar de pesquisa de nomes for diferente de null,
        if (cad != null) {
            // Solicita a informação de qual dado deve ser alterado.
            // Realiza a alteração da variável solicitada.
            int opt; // variável de controle de opção.
            // Se objeto a ser alterado for aluno.
            if (cad.getObjCriado() == "Aluno") {
                //Solicita qual dado deve ser alterado.
                opt= EntradaSaida.receberInt("Qual item quer alterar? 1:Nome,2:Telefone,3:Data de Nascimento,4:Data do cadastro,5:Data da Ultima Alteração,6:Nota Final do Curso");
                // Rotina de repetição para validar opção informada.
                while (opt < 1 || opt > 6){
                    // Enquanto opção inválida for informada,
                    // solicita a informação de opção válida.
                    opt= EntradaSaida.receberInt("Qual item quer alterar? 1:Nome,2:Telefone,3:Data de Nascimento,4:Data do cadastro,5:Data da Ultima Alteração,6:Nota Final do Curso");
                }
            }
            // Senão, objeto a ser alterado é uma pessoa.
            else {
                //Solicita qual dado deve ser alterado.
                opt= EntradaSaida.receberInt("Qual item quer alterar? 1:Nome,2:Telefone,3:Data de Nascimento,4:Data do cadastro,5:Data da Ultima Alteração");
                // Rotina de repetição para validar opção informada.
                while (opt < 1 || opt > 5){
                    // Enquanto opção inválida for informada,
                    // solicita a informação de opção válida.
                    opt= EntradaSaida.receberInt("Qual item quer alterar? 1:Nome,2:Telefone,3:Data de Nascimento,4:Data do cadastro,5:Data da Ultima Alteração");                        
                }
            }
            switch(opt) {
                // Altera as informações da variável solicitada. 
                case 1:
                    cad.setNome(EntradaSaida.receberString("Nome: ")); 
                    break;
                case 2:
                    cad.setTelefone(EntradaSaida.receberString("Telefone: "));
                    break;
                case 3:
                    cad.setDataNascimento(EntradaSaida.receberString("Data de Nascimento: "));
                    break;
                case 4:
                    cad.setDataCadastro(EntradaSaida.receberString("Data de cadastro: "));
                    break;
                case 5:
                    cad.setDataUltimaAlteracao(EntradaSaida.receberString("Data da ultima alteracao: "));
                    break;
                case 6:
                    cad.setNotaFinal(EntradaSaida.receberDouble("Nota Final: "));
                    break;                               
            }
            // Altera o valor da variável "saída" com os dados atualizados.
            saida = saida + cad.getNome() + "\n";
            saida += cad.getTelefone() + "\n";
            saida += cad.getDataNascimento() + "\n";
            saida += cad.getDataCadastro() + "\n";
            saida += cad.getDataUltimaAlteracao() + "\n";
            if (cad.getObjCriado() == "Aluno") {
            saida += cad.getNotaFinal() + "\n";
            }
        }
        // Senão, se retorno do método auxiliar de pesquisa de nomes for igual a null,
        // altera a variável "saída" e mostra na tela a informação de "Nenhum valor encontrado".
        else {
            saida = "Nenhum resultado encontrado";
        }
        // Mostra a informação do objeto com os dados alterados.
        EntradaSaida.mostrarTexto(saida);   
    }
    
   /**
    * Método deleteCadastro.
    *     - Inicialização de variável.
    *     - Solicita nome a ser pesquisado.
    *     - Chama o método auxiliar returnCadastro.
    *         - Se cadastro diferente de null .
    *             - Solicita confirmação de exclusão de cadastro.
    *                 - Se a confirmação for positiva.
    *                     - Exclui os dados solicitados.
    *                 - Senão.
    *                     - Encerra o método sem modificação dos dados.
   */
    
   public static void deleteCadastro() {
       // Inicialização de variáveis.
       String saida = "";
       // Solicitação do nome a ser pesquisado para alteração dos cadastros.
       String pesq = EntradaSaida.receberString("Nome a pesquisar:");
       // Chamada do método auxiliar de pesquisa de nomes.
       Cadastro cad = returnCadastro(pesq);
       // Se retorno do método auxiliar de pesquisa de nomes for diferente de null,
       // solicita confirmação de exclusão de dados.
       // Confirmada a solicitação, exclui os dados.
       // Senão, encerra o método sem alteração dos dados.
       if (cad != null) {
           int opt= EntradaSaida.receberInt("Este cadastro será excluído, Continuar? 1: Sim,2: Não");
           if(opt==1) {
               cad.setNome(""); 
               cad.setTelefone("");
               cad.setDataNascimento("");
               cad.setDataCadastro("");
               cad.setDataUltimaAlteracao("");
               cad.setNotaFinal(0.0);
           }
       } 
   }
    
   /**
    * Método returnCadastro.
    *     - Método recebe nome a ser pesquisado.
    *     - Inicialização de variável.
    *     - Executa rotina de repetição para pesquisa de nome.
    *         - Se nome pesquisado for encontrado.
    *             - Retorna ArrayList com os dados solicitados.
    *         - Senão
    *             - Senão retorna ArrayList com o valor de null.
   */
   
   private static Cadastro returnCadastro(String pesq) {
        // Inicialização de variável
        Cadastro cad = null;
        // Rotina de repetição para pesquisa de nome.
        for (int i=0; i<dados.size(); i++) {
            cad = dados.get(i);
            String nome = cad.getNome();
            // Se nome pesquisado foi encontrado.
            // Retorna ArrayList com os dados solicitados.
            if (nome.equalsIgnoreCase(pesq)) {
                return cad;
            }
        }
        // Não encontrou nome pesquisa na rotina de repetição.
        // Retorna null
        return null;
   }

}