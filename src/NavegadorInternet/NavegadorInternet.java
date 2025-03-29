package NavegadorInternet;

import Iphone.Iphone;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet extends Iphone implements INavegadorInternet{
    List<String> abas = new ArrayList<>();
    @Override
    public String exibirPaginas() {
        return "Na pagina tem as abas"+ abas.toString();
    }

    @Override
    public void adicionarNovaAba(String e) {
        this.abas.add(e);
    }

    @Override
    public void atualizarPagina() throws InterruptedException {
        System.out.println("Atualizando pagina..");
        Thread.sleep(2000);
        System.out.println("Pagina atualizada");

    }
}
