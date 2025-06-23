package day_17.jdbc.persistence;

import java.util.List;
import day_17.jdbc.model.Persona;

public interface PersonaDAO {
    public void save(Persona persona) throws DAOException;
    public Persona findById(int id) throws DAOException;
    public void update(Persona persona) throws DAOException;
    public void delete(int id) throws DAOException;
    public List<Persona> findAll() throws DAOException;
    public Persona findByCF(String CF) throws DAOException;
    public List<Persona> findByNome(String nome) throws DAOException;
    public List<Persona> findByCognome(String cognome) throws DAOException;
    public long count() throws DAOException;
    public List<Persona> findByAnno(String annoNascita) throws DAOException;
}