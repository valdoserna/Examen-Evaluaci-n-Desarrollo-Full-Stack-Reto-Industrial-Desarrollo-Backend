package com.mx.Articulos.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mx.Articulos.Dominio.Articulos;
import com.mx.Articulos.Service.Implementacion;

@RestController
@RequestMapping(path = "/Api/Webservice")
@CrossOrigin
public class ArticulosWebService {
	@Autowired
	Implementacion imp;

	// http://localhost:9001/swagger-ui/index.html swagger
	// http://localhost:9001/logout esto es para salir de la sesion
	// http://localhost:9001/Api/Webservice/listar
	@GetMapping(value = "listar")
	public ResponseEntity<?> listar() {
		String respuesta = null;
		if (imp.listar().isEmpty()) {
			respuesta = "la lista de articulos esta vacia";

			return new ResponseEntity<String>(respuesta, HttpStatus.NO_CONTENT);
			/*
			 * si queremos que muestre un mensaje cambias status a OK o NO_FOUND POR QUE
			 * ESOS SI TIENE CUERPO
			 */
		} else {
			// en caso de que la lista no este vacia
			return ResponseEntity.status(HttpStatus.CREATED).body(imp.listar());

		}

	}

	// http://localhost:9001/Api/Webservice/guardar
	@PostMapping("guardar")
	public ResponseEntity<?> guardar(@RequestBody Articulos articulo) {
		imp.guardar(articulo);
		String respuesta = "EL articuo se guardo!\n" + "El nombre del articulo es " + articulo.getNombre() + "\n"
				+ "Su estock es: " + articulo.getStock();

		return new ResponseEntity<String>(respuesta, HttpStatus.OK);
	}

	// http://localhost:9001/Api/Webservice/editar
	@PutMapping("editar")
	public ResponseEntity<?> editar(@RequestBody Articulos articulo) {
		imp.editar(articulo);
		String respuesta = "Se editado el articulo!\n" + "El articulo es " + articulo.getNombre();

		return new ResponseEntity<String>(respuesta, HttpStatus.OK);
	}

	// http://localhost:9001/Api/Webservice/eliminar
	@DeleteMapping("eliminar")
	public ResponseEntity<?> eliminar(@RequestBody Articulos articulo) {
		imp.eliminar(articulo);
		String respuesta = "articulo eliminado!\n";

		return new ResponseEntity<String>(respuesta, HttpStatus.OK);

	}

	// http://localhost:9001/Api/Webservice/buscar
	@RequestMapping(value = "buscar", method = RequestMethod.POST)
	public ResponseEntity<?> buscar(@RequestBody Articulos articulo) {

		return ResponseEntity.ok(imp.buscar(articulo));
	}
}
