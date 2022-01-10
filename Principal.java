
/**
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
 * 
 * 
 * @author (Edeilson Souza) 
 * @email (edeilsonsouza@hotmail.com)
 * @version (1.0)
 */

public class Principal
{
    public static void main(String args[])
    {
        String res = "1";
        int opt = 0;
        while (res.equalsIgnoreCase("1")) 
        {
            opt = EntradaSaida.receberInt("1: Cadastrar Item, 2: Listar Cadastro, 3: Atualizar Item, 4: Deletar Item");
            switch(opt) {
                case 1:
                    Processamento.createCadastro();
                    break;
                case 2:
                    Processamento.readCadastro();
                    break;
                case 3:
                    Processamento.updateCadastro();
                    break;
                case 4:
                    Processamento.deleteCadastro();
                    break;
                default:
                    EntradaSaida.mostrarTexto("Opção inválida, use uma opção de 1 a 4.");
            }
            res = EntradaSaida.receberString("Continuar? 1 - para Sim, 2 - para Não.");
        }
    }
    
}

