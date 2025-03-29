package NavegadorInternet;

public interface INavegadorInternet {
    String exibirPaginas();
    void adicionarNovaAba(String e);
    void atualizarPagina() throws InterruptedException;
}
