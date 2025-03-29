package ReprodutorMusical;
import Iphone.Iphone;

public class ReprodutorMusical extends Iphone implements IReprodutorMusical{
    String musicaSelecionada;
    boolean pausado;

    public ReprodutorMusical(){
        this.pausado = false;
        this.musicaSelecionada = null;
    }

    @Override
    public void tocar() {
        System.out.println(this.musicaSelecionada+" Está tocando!!!!!");
    }

    @Override
    public String selecionarMusica(String musica) {
        this.musicaSelecionada = musica;
        return "Musica selecionada:"+this.musicaSelecionada;
    }

    @Override
    public void pausar() {
        this.pausado = true;
        System.out.println("Musica Pausada");
    }

    public String toString(){
        return "Musica selecionada:"+this.musicaSelecionada+ ", pausado:" +this.pausado;
    }
}
