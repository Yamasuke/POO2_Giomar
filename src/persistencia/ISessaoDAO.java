/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import negocio.Sessao;

/**
 *
 * @author Yan
 */
public interface ISessaoDAO{
    public void adiciona(Sessao sessao);
    public void altera(Sessao sessao);
    public void remove(int id);
    public ArrayList<Sessao> listarTodos();
    public Sessao getByID(int id);

}
