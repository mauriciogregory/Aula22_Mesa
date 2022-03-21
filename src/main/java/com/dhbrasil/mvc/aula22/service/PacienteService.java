package com.dhbrasil.mvc.aula22.service;

import com.dhbrasil.mvc.aula22.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public interface PacienteService {
    List<Paciente> paciente = new ArrayList<>();

    List<Paciente> listPacientes();

}
