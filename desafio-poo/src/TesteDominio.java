import com.gihut.manojesus.desafio.dominio.Curso;
import com.gihut.manojesus.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteDominio {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java",
                            "Descricao bem elaborada",
                            "Vitao",
                            8);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria("Como fazer uma boa descricao",
                "Descricao elaborada com a mentoria",
                List.of("Vitao","Cleber"),
                LocalDate.now());
        System.out.println(mentoria1);
    }
}
