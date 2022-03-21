package com.dhbrasil.mvc.aula22.service.impl;

import com.dhbrasil.mvc.aula22.model.Paciente;
import com.dhbrasil.mvc.aula22.service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// tem que ter o service para rodar, senão não vai funcionar no browser
@Service
public class PacienteServiceImpl implements PacienteService {

    @Override
    public List<Paciente> listPacientes() {
        return Arrays.asList(new Paciente("Carlos", "You"));

    }
}
