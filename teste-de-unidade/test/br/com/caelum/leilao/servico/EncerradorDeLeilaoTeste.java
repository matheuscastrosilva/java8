package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Leilao;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by matheus on 18/05/17.
 */
public class EncerradorDeLeilaoTeste {

    @Test
    public void deveEncerrarLeiloesQueComecaramUmaSemanaAntes() {
        Calendar antiga = Calendar.getInstance();
        antiga.set(1999, 1, 20);

        Leilao leilao = new CriadorDeLeilao().para("TV de plasma").naData(antiga).constroi();
        Leilao leilao2 = new CriadorDeLeilao().para("Geladeira").naData(antiga).constroi();
    }
}
