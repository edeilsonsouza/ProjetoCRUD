
/**
 * __________________________________________________________________
 * 
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
 * classe Pessoa 
 * 
 *     1) Classe utilizada para criar um objeto Aluno.
 *     2) Utiliza o conceito de herança.
 *        Recebe informações da superclasse Cadastro.
 * __________________________________________________________________
 * 
 * @author (Edeilson Souza) 
 * @email (edeilsonsouza@hotmail.com)
 * @version (1.0)
 */

public class Aluno extends Cadastro
{
    /**
         * Classe utilizada para criar objeto Aluno.
         * Utiliza o conceito de herança.
         * Recebe informações da superclasse Cadastro.
         */
    public Aluno(String nome,String telefone,String dataNasc,String dataCad,String dataUltAlt,String objCriado,double notaFinal) {
            super(nome, telefone,dataNasc,dataCad,dataUltAlt,objCriado,notaFinal);
    }
}