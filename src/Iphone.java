public class Iphone implements Ipod, Aparelho, Internet{
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PÁGINA "+ url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("ADICIONANDO NOVA ABA " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA " + musica);
    }
}
