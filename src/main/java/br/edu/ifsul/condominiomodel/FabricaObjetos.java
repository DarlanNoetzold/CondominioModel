/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.condominiomodel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author darla
 */
public class FabricaObjetos {
    public static List<Aluguel> carregaAluguel(){
        List<Aluguel> lista = new ArrayList<>();
        Aluguel a = new Aluguel();
        a.setId(1);
        a.setDiaVencimento(2);
        a.setFimContrato(Calendar.getInstance());
        a.setInicioContrato(Calendar.getInstance());
        a.setValor(1900.67);
        Locatario l = new Locatario();
        l.setCpf("23123");
        l.setEmail("teste@mail.com");
        l.setLocalTrabalho("sadasdasd");
        l.setNome("Testando da silva");
        l.setTelefone("9999999");
        l.setTelefoneTrabalho("999999");
        l.setRenda(2131.50);
        l.setId(1);
        a.setLocatario(l);
        UnidadeCondominal u = new UnidadeCondominal();
        u.setArea(345.6);
        u.setNumero("123");
        a.setUnidadeCondominal(u);
        
        Mensalidades m = new Mensalidades();
        
        m.setId(1);
        m.setAluguel(a);
        m.setValor(1623.90);
        m.setDataPagamento(Calendar.getInstance());
        m.setValorPagamento(1623.90);
        a.getMensalidades().add(m);
        
        lista.add(a);
        
        return lista;
    }
}
