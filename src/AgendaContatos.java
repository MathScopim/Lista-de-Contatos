import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void AdicionarContatos(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos() {
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContado(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.AdicionarContatos("Matheus Fonseca", 22341);
        agendaContatos.AdicionarContatos("Matheus Scopim", 86865);
        agendaContatos.AdicionarContatos("Matheus Aluno", 79753);
        agendaContatos.AdicionarContatos("Mathzin", 80975);
        agendaContatos.AdicionarContatos("Matheus", 17468);


        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Matheus"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContado("Mathzin", 989797));
    }
}
