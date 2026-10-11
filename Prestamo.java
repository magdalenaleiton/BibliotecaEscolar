package modelo;

import java.sql.Date;

public class Prestamo {

    private int id;
    private int idLibro;
    private int idEstudiante;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String estado;

    public Prestamo() {
    }

    public Prestamo(int id, int idLibro, int idEstudiante,
                    Date fechaPrestamo, Date fechaDevolucion,
                    String estado) {
        this.id = id;
        this.idLibro = idLibro;
        this.idEstudiante = idEstudiante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
