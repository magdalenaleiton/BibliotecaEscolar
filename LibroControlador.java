package controlador;

import dao.LibroDAO;
import modelo.Libro;
import java.util.List;

public class LibroControlador {

    private final LibroDAO libroDAO;

    public LibroControlador() {
        libroDAO = new LibroDAO();
    }

    public boolean registrarLibro(Libro libro) {
        if (libro == null) {
            return false;
        }

        return libroDAO.insertar(libro);
    }

    public List<Libro> listarLibros() {
        return libroDAO.listar();
    }

    public boolean eliminarLibro(int idLibro) {
        if (idLibro <= 0) {
            return false;
        }

        return libroDAO.eliminar(idLibro);
    }
}
