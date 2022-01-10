
/**
 * Escreva uma descrição da classe Processamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.*;

public class Processamento
{
    //variável que "armazenará" os cadastros
    //é um ArrayList SOMENTE de obj "Cadastro"
    private static ArrayList<Cadastro> dados = new ArrayList<Cadastro>();
    
    //método para obter os dados do usuário,
    //criar o objeto e adicionar ao "list"
    public static void createCadastro() {
        String nome, telefone, dataNasc, dataCad, dataUltAlt, nFinal; 
        double notaFinal;
        int res, auxNF;
        nFinal = null;
        nome = EntradaSaida.receberString("Nome: ");
        telefone = EntradaSaida.receberString("Telefone: ");
        dataNasc = EntradaSaida.receberString("Data de nascimento: ");
        dataCad = EntradaSaida.receberString("Data do cadastro: ");
        dataUltAlt = EntradaSaida.receberString("Data da ultima alteracao: ");
        auxNF = EntradaSaida.receberInt("Deseja informar nota final? Digite 1 - Sim, 2 - Não");
        if (auxNF == 1) {
            nFinal = EntradaSaida.receberString("Nota Final do curso: ");
        }
        Cadastro cad;
        if (auxNF == 1) {
            notaFinal = Double.parseDouble(nFinal);
            cad = new Aluno(nome,telefone,dataNasc,dataCad,dataUltAlt,notaFinal);
        } else {
            cad = new Pessoa(nome,telefone,dataNasc,dataCad,dataUltAlt);
        }
        dados.add(cad);
    }
    
    //método que obtém o nome a pesquisar,
    //procura no "list" e retorna os dados          
    public static void readCadastro() {
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        Cadastro cad = retornarCadastro(pesq);
        String saida = "";
        if (cad != null) {
            saida = saida + cad.getNome() + "\n";
            saida += cad.getTelefone() + "\n";
            saida += cad.getDataNascimento() + "\n";
            saida += cad.getDataCadastro() + "\n";
            saida += cad.getDataUltimaAlteracao() + "\n";
            saida += cad.getNotaFinal() + "\n";
        } else {
            saida = "Nenhum resultado encontrado";
        }
        EntradaSaida.mostrarTexto(saida);
    }
    
    
    //método que recebe uma string de pesquisa (nome)
    //e retorna o objeto cliente vinculado com esse nome
    private static Cadastro retornarCadastro(String pesq) {
        Cadastro cad = null;
        for (int i=0; i<dados.size(); i++) {
            cad = dados.get(i);
            String nome = cad.getNome();
            if (nome.equalsIgnoreCase(pesq)) {
                return cad;
            }
        }
        //chegou no final do loop e não retornou nada
        return null;
    }
    
    public static void updateCadastro() {
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        Cadastro cad = retornarCadastro(pesq);
        String saida = "";
        String res;
        if (cad != null) {
            int opt= EntradaSaida.receberInt("Qual item quer alterar? 1:Nome,2:Telefone,3:Data de Nascimento,4:Data do cadastro,5:Data da Ultima Alteração,6:Nota Final do Curso");
            switch(opt) {
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
                default:
                    EntradaSaida.mostrarTexto("Opção inválida, use uma opção de 1 a 6.");
            }
            res = EntradaSaida.receberString("Continuar? 1 - para Sim, 2 - para Não.");
        } else {
            saida = "Nenhum resultado encontrado";
        }
        EntradaSaida.mostrarTexto(saida);     
        
    }
    
    public static void deleteCadastro() {
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        Cadastro cad = retornarCadastro(pesq);
        String saida = "";
        String res;
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
            res = EntradaSaida.receberString("Continuar? 1 - para Sim, 2 - para Não.");
        } else {
            saida = "Nenhum resultado encontrado";
        }  
    }
}