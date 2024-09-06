package imb.progra3.grupo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imb.progra3.grupo2.entity.MedioDePago;
import java.util.Optional;

public interface MedioDePagoRepository extends JpaRepository<MedioDePago, Long> {
	
    // Aquí puedes agregar métodos personalizados si los necesitas
	
	Optional<MedioDePago> findByNombre(String nombre);
}





