/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Paciente;

/**
 *
 * @author Yan
 */
public interface IPacienteDAO {
    public void adiciona(Paciente um_paciente);
    public void altera(Paciente um_paciente);
    public void remove(int id);
    public List<Paciente> listarTodos();
    public Paciente getByID(int id);

}
