    public class Iphone implements ReprorutorMusical, AparelhoTelefonico, NavegadorInternet {
        private String modelo;
        private int armazenamento;
    
        public Iphone(String modelo, int armazenamento) {
            this.modelo = modelo;
            this.armazenamento = armazenamento;
        }
    
        @Override
        public void tocarMusica(String musica) {
            System.out.println("Tocando música: " + musica);
        }
    
        @Override
        public void pausarMusica() {
            System.out.println("Música pausada");
        }
    
        @Override
        public void pararMusica() {
            System.out.println("Música parada");
        }
    
        @Override
        public void fazerChamada(String numero) {
            System.out.println("Ligando para: " + numero);
        }
    
        @Override
        public void atenderChamada() {
            System.out.println("Chamada atendida");
        }
    
        @Override
        public void encerrarChamada() {
            System.out.println("Chamada encerrada");
        }
    
        @Override
        public void abrirPagina(String url) {
            System.out.println("Abrindo página: " + url);
        }
    
        @Override
        public void fecharPagina() {
            System.out.println("Página fechada");
        }
    
        @Override
        public void navegarPara(String url) {
            System.out.println("Navegando para: " + url);
        }
}
 

