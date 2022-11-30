package br.ucsal.busucsal.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucsal.busucsal.model.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
	
}
