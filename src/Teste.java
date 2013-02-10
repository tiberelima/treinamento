
import com.lima.tibere.robo.Robo;
import com.lima.tibere.robo.comando.Andar;
import com.lima.tibere.robo.comando.Virar;
import com.lima.tibere.robo.direcao.Direita;
import com.lima.tibere.robo.direcao.Esquerda;

public class Teste {

    public static void main(String[] args) {

        Robo r2d2 = new Robo().setNome("R2D2");
        r2d2.execute(Andar.getInstance())
                .execute(Virar.getInstance(Direita.virar()))
                .execute(Andar.getInstance())
                .execute(Virar.getInstance(Esquerda.virar()))
                .execute(Andar.getInstance());

        Robo daileon = new Robo().setNome("Daileon");
        daileon.execute(Andar.getInstance())
                .execute(Virar.getInstance(Direita.virar()))
                .execute(Andar.getInstance())
                .execute(Virar.getInstance(Esquerda.virar()))
                .execute(Andar.getInstance());
    }
}
