
import com.lima.tibere.robo.Robo;
import com.lima.tibere.robo.comando.Andar;
import com.lima.tibere.robo.comando.Virar;
import com.lima.tibere.robo.direcao.Direita;
import com.lima.tibere.robo.direcao.Esquerda;
import com.lima.tibere.robo.direcao.Orientacao;

public class Teste {

    public static void main(String[] args) {

        Robo r2d2 = new Robo("R2D2").setOrientacao(Orientacao.NORTE);
        r2d2.execute(new Andar())
                .execute(new Virar(new Direita()))
                .execute(new Andar())
                .execute(new Virar(new Esquerda()))
                .execute(new Andar());

        System.out.println("-------------- Rodar --------------");
        Robo daileon = new Robo("Daileon").setOrientacao(Orientacao.NORTE);
        daileon.execute(new Virar(new Direita()))
                .execute(new Virar(new Direita()))
                .execute(new Virar(new Direita()))
                .execute(new Virar(new Direita()))
                .execute(new Virar(new Direita()));

    }
}
