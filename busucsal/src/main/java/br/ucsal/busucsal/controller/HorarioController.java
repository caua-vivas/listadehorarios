package br.ucsal.busucsal.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.busucsal.model.Horario;
import br.ucsal.busucsal.persistence.HorarioRepository;

@RestController
@RequestMapping("/api")
public class HorarioController {
	@Autowired
	private HorarioRepository repo;
	
	//api/horarios
	@GetMapping("/horarios")
	public List<Horario> horarios() {
		Horario bean = new Horario();
		bean.setDia("SABADO");
		bean.setHora(LocalTime.of(6, 40));
		bean.setRoteiro("SAI DA UCSAL E VAI PRA ESTACAO");
		
		repo.save(bean);
		
		horarioRepository.save(horario);
		
		return repo.findAll();
	}
}