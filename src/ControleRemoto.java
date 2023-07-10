public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.ligado = false;
    }

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i +=10) {
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0)
            this.setVolume(50);
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(false);
        } else {
            System.out.println("Erro!, Ligue a tv primeiro!");
        }
    }

    @Override
    public void listaFavoritos() {
        if (this.getLigado() && (this.getTocando()));
        System.out.println("Listamos alguns dos seus Conteúdos favoritos: THE OFFICE, Dr.Chá, Vikings, Eu a Patroa e as crianças.");
    }

    @Override
    public void gravar() {
        if (this.getLigado() && (this.getTocando())) {
            System.out.println("programa sendo gravado!");
        } else {
            System.out.println("Erro!");
        }

    }

    @Override
    public void pararGravacao() {
        if (this.getLigado() && (this.getTocando())) {
            System.out.println("Concluído");
        } else {
            System.out.println("erro!");
        }
    }
}

