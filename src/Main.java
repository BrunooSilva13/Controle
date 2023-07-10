
public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        c.getVolume();
        c.gravar();
        c.pararGravacao();
        c.listaFavoritos();
        c.abrirMenu();
    }
}