package repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import models.UsuariooModel;

public class usuarioRepository {


@Repository
public interface UsuarioRepository extends CrudRepository<UsuariooModel, Long> {
	public abstract ArrayList<UsuariooModel> findByPrioridad(Integer prioridad);
	
	UsuariooModel findByNombre(String nombre);

}
	
	public static UsuariooModel save(UsuariooModel usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Optional<UsuariooModel> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
