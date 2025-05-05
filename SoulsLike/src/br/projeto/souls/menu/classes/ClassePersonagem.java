package br.projeto.souls.menu.classes;

public class ClassePersonagem {
    public String nome;
    public int level, vitalidade, attunement, vigor, forca, destreza, resistencia, inteligencia, fe;

    public ClassePersonagem(String nome, int level, int vitalidade, int attunement, int vigor,
                            int forca, int destreza, int resistencia, int inteligencia, int fe) {
        this.nome = nome;
        this.level = level;
        this.vitalidade = vitalidade;
        this.attunement = attunement;
        this.vigor = vigor;
        this.forca = forca;
        this.destreza = destreza;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
        this.fe = fe;
    }

    public void exibirStatus() {
        System.out.println("\nStatus da classe: " + nome);
        System.out.println("Level: " + level);
        System.out.println("Vitalidade: " + vitalidade);
        System.out.println("Attunement: " + attunement);
        System.out.println("Vigor: " + vigor);
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Resistência: " + resistencia);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Fé: " + fe);
    }
}
