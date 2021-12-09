import com.gihut.manojesus.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TesteDominio {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java",
                            "Descricao bem elaborada",
                            "Vitao",
                            8);
        Mentoria mentoria1 = new Mentoria("Como fazer uma boa descricao",
                "Descricao elaborada com a mentoria",
                LocalDate.now());
        mentoria1.getPalestrantes().addAll(Set.of("Vitao", "Luciscreide"));

        Bootcamp bootcamp1 = new Bootcamp("Spread Java", "Como sempre uma bela descricao");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev("Joao");
        Dev dev2 = new Dev("Maria");

        dev1.inscreverNoBootcamp(bootcamp1);
        dev2.inscreverNoBootcamp(bootcamp1);
        System.out.println("-------------------- Bootcamp --------------------");
        System.out.println(bootcamp1);

        System.out.println("\n\n-------------------- Antes da progressao --------------------");

        System.out.println(dev1);
        System.out.println(dev2);

        System.out.println("\n\n\n");

        dev1.progredir();
        dev1.progredir();
        dev1.calcularTotalXP();

        dev2.progredir();
        dev2.calcularTotalXP();
        System.out.println("-------------------- Depois da progressao --------------------");
        System.out.println(dev1);
        System.out.println(dev2);
    }
}
