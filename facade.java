// Facade - feito por Enrique Nogueira, João Victor e Artur Figueiredo

class TV {
    void ligar() {System.out.println("Ligando Televisão...");}
    void desligar() {System.out.println("Desligando Televisão...");}
}


class MediaPlayer {
    void openNetflix() {System.out.println("Abrindo a Netflix...");}
    void openSpotify() {System.out.println("Abrindo o Spotify...");}
}

class Som {
    void setVolume(int vol) {System.out.println("Ajustando volume do som em " + vol);}
    void ligar() {System.out.println("Sistema de som ligado.");}
}

class Luzes {
    void dimerizar(int intensidade) {System.out.println("Luzes em " + intensidade + "%");}
}

class HomeTheater {
    private TV tv;
    private Som som;
    private Luzes luzes;
    private MediaPlayer player;

    public HomeTheater() {
        this.tv = new TV();
        this.som = new Som();
        this.luzes = new Luzes();
        this.player = new MediaPlayer();
    }

    public void assistirFilme() {
        System.out.println("\n--- Preparando o cinema em casa ---");
        luzes.dimerizar(10);
        tv.ligar();
        som.ligar();
        som.setVolume(20);
        player.openNetflix();
        System.out.println("--- Bom filme! ---\n");
    }

    public void ouvirMusica() {
        System.out.println("\n--- Preparando a discoteca em casa ---");
        luzes.dimerizar(40);
        tv.ligar();
        som.ligar();
        som.setVolume(80);
        player.openSpotify();
        System.out.println("--- Curta o som! ---\n");
    }
}


public class Main {
    public static void main(String[] args) {
        HomeTheater homeTheater = new HomeTheater();

        homeTheater.assistirFilme();
        homeTheater.ouvirMusica();
    }
}
