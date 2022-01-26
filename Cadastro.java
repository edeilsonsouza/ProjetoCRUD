
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
 * Superclasse Cadastro
 * 
 *     1) Inclui os métodos construtores.
 *     2) Inclui os métodos "Getters and Setters".
 * __________________________________________________________________
 * 
 * @author (Edeilson Souza) 
 * @email (edeilsonsouza@hotmail.com)
 * @version (1.0)
 */

public abstract class Cadastro
{
    /**
     * Declaração das variáveis da superclasse Cadastro.
     */
    private String nome;
    private String telefone;
    private String dataNasc;
    private String dataCad;
    private String dataUltAlt;
    private String objCriado;
    private double notaFinal;
    
        
    /**
     * Construtor com inicialização básica.
     */
    public Cadastro() {
        this.nome = "";
        this.telefone = "";
        this.dataNasc = "";
        this.dataCad = "";
        this.dataUltAlt = "";
        this.objCriado = null;
        this.notaFinal= 0.0;
    }
    
    /**
     * Construtor específico para classe Pessoa que usa herança da classe cadastro.
     * Conceito de polimorfismo.
     */
    
    public Cadastro(String nome,String telefone,String dataNasc,String dataCad,String dataUltAlt, String objCriado) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCad = dataCad;
        this.dataUltAlt = dataUltAlt;
        this.objCriado = objCriado;
    }
    
    /**
     * Construtor específico para classe Aluno que usa herança da classe cadastro.
     * Conceito de polimorfismo.
     */
    
    public Cadastro(String nome,String telefone,String dataNasc,String dataCad,String dataUltAlt,String objCriado,Double notaFinal) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCad = dataCad;
        this.dataUltAlt = dataUltAlt;
        this.objCriado = objCriado;
        this.notaFinal = notaFinal;
    }

    /**
     * Métodos "getters and "setters"
     */ 
           
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
        public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getDataNascimento() {
        return this.dataNasc;
    }
    public void setDataNascimento(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getDataCadastro() {
        return this.dataCad;
    }
    public void setDataCadastro(String dataCad) {
        this.dataCad = dataCad;
    }  
    public String getDataUltimaAlteracao() {
        return this.dataUltAlt;
    }
    public void setDataUltimaAlteracao(String dataUltAlt) {
        this.dataUltAlt = dataUltAlt;
    }
    public String getObjCriado() {
        return this.objCriado;
    }
    public void setObjCriado(int res) {
        this.objCriado = objCriado;
    }
    public Double getNotaFinal() {
        return this.notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}