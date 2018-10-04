package br.com.caelum.leilao;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aluno on 04/10/18.
 */
public class TesteUnitario {

    @Test
    public void main() {

        Usuario joao = new Usuario("Joao");
        Usuario maria = new Usuario("Maria");
        Usuario ana = new Usuario("Ana");

        Leilao leilao = new Leilao("Notbook");

        leilao.propoe(new Lance(joao, 250.00));
        leilao.propoe(new Lance(ana, 300.00));
        leilao.propoe(new Lance(maria, 400.00));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        Assert.assertEquals(400.00, leiloeiro.getMaiorTodos(), 0.00001);
        Assert.assertEquals(250.00, leiloeiro.getMenorTodos(), 0.00001);

    }
}
