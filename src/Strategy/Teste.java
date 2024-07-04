package Strategy;

public class Teste {
    public static void main(String[] args) {
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();

    }
}
