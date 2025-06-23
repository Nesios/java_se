package day_17.jdbc.persistence.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter; // Non usato direttamente, ma può rimanere
import java.util.ArrayList;
import java.util.List;

import day_17.jdbc.model.Persona;
import day_17.jdbc.persistence.DAOException;
import day_17.jdbc.persistence.DBUtil;
import day_17.jdbc.persistence.DataSource;
import day_17.jdbc.persistence.PersonaDAO;
// L'import di PersonaDAOImpl qui è ridondante se sei nella stessa classe
// import day_17.jdbc.persistence.impl.PersonaDAOImpl;

public class PersonaDAOImpl implements PersonaDAO {
    // Questo formatter non viene usato direttamente con Timestamp.valueOf, puoi rimuoverlo se non ti serve per altri scopi
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss"); 

    public void save(Persona persona) throws DAOException {
        String SQL = "INSERT INTO Persona (CF, nome, cognome, data_nascita) VALUES (?, ?, ?, ?)";
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DataSource.getConnection();
            // Assicurati che "id" sia il nome della colonna auto-generata nel tuo DB
            statement = connection.prepareStatement(SQL, new String[] { "id" });
            statement.setString(1, persona.getCF());
            statement.setString(2, persona.getNome());
            statement.setString(3, persona.getCognome());
            statement.setTimestamp(4, Timestamp.valueOf(persona.getDataNascita())); // Usato getDataNascita()
            statement.executeUpdate();
            ResultSet generateKeys = statement.getGeneratedKeys();
            if (generateKeys.next()) {
                persona.setId(generateKeys.getInt(1));
            }
        } catch (SQLException e) {
            System.err.println("Errore in save: " + e.getMessage()); // Stampare su System.err per gli errori
            throw new DAOException("Errore durante il salvataggio della persona.", e); // Messaggio più descrittivo
        } finally {
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
    }

    public Persona findById(int id) throws DAOException {
        String SQL = "SELECT id, CF, nome, cognome, data_nascita FROM persona WHERE id = ?"; // Specifica le colonne
        System.out.println(SQL);
        Persona persona = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Assicurati che l'ordine dei parametri nel costruttore Persona
                // corrisponda all'ordine delle colonne nel ResultSet
                persona = new Persona(resultSet.getInt("id"), // Usare nomi di colonna è più robusto
                                      resultSet.getString("CF"),
                                      resultSet.getString("nome"),
                                      resultSet.getString("cognome"),
                                      resultSet.getTimestamp("data_nascita").toLocalDateTime());
            }
        } catch (SQLException e) {
            System.err.println("Errore in findById: " + e.getMessage());
            throw new DAOException("Errore durante la ricerca della persona per ID.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return persona;
    }

    @Override
    public void update(Persona persona) throws DAOException {
        // Corretto lo spazio unicode e assicurato spazi standard
        String SQL = "UPDATE persona SET CF = ?, nome = ?, cognome = ?, data_nascita = ? WHERE id = ?";
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            statement.setString(1, persona.getCF());
            statement.setString(2, persona.getNome());
            statement.setString(3, persona.getCognome());
            statement.setTimestamp(4, Timestamp.valueOf(persona.getDataNascita())); // Usato getDataNascita()
            statement.setInt(5, persona.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Errore in update: " + e.getMessage());
            throw new DAOException("Errore durante l'aggiornamento della persona.", e);
        } finally {
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
    }

    public void delete(int id) throws DAOException {
        String SQL = "DELETE FROM persona WHERE id = ?";
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Errore in delete: " + e.getMessage());
            throw new DAOException("Errore durante l'eliminazione della persona.", e);
        } finally {
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
    }

    public Persona findByCF(String CF) throws DAOException {
        String SQL = "SELECT id, CF, nome, cognome, data_nascita FROM persona WHERE CF = ?"; // Specifica le colonne
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            statement.setString(1, CF);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                persona = new Persona(resultSet.getInt("id"),
                                      resultSet.getString("CF"),
                                      resultSet.getString("nome"),
                                      resultSet.getString("cognome"),
                                      resultSet.getTimestamp("data_nascita").toLocalDateTime());
            }
        } catch (SQLException e) {
            System.err.println("Errore in findByCF: " + e.getMessage());
            throw new DAOException("Errore durante la ricerca della persona per CF.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return persona;
    }

    public List<Persona> findAll() throws DAOException {
        List<Persona> persone = new ArrayList<>();
        String SQL = "SELECT id, CF, nome, cognome, data_nascita FROM persona"; // Specifica le colonne
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                persona = new Persona(resultSet.getInt("id"),
                                      resultSet.getString("CF"),
                                      resultSet.getString("nome"),
                                      resultSet.getString("cognome"),
                                      resultSet.getTimestamp("data_nascita").toLocalDateTime());
                persone.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Errore in findAll: " + e.getMessage());
            throw new DAOException("Errore durante la ricerca di tutte le persone.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return persone;
    }

    public List<Persona> findByNome(String nome) throws DAOException {
        List<Persona> persone = new ArrayList<>();
        String SQL = "SELECT id, CF, nome, cognome, data_nascita FROM persona WHERE nome = ?"; // Specifica le colonne
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            statement.setString(1, nome);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                persona = new Persona(resultSet.getInt("id"),
                                      resultSet.getString("CF"),
                                      resultSet.getString("nome"),
                                      resultSet.getString("cognome"),
                                      resultSet.getTimestamp("data_nascita").toLocalDateTime());
                persone.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Errore in findByNome: " + e.getMessage());
            throw new DAOException("Errore durante la ricerca per nome.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return persone;
    }

    public List<Persona> findByCognome(String cognome) throws DAOException {
        List<Persona> persone = new ArrayList<>();
        String SQL = "SELECT id, CF, nome, cognome, data_nascita FROM persona WHERE cognome = ?"; // Specifica le colonne
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            statement.setString(1, cognome);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                persona = new Persona(resultSet.getInt("id"),
                                      resultSet.getString("CF"),
                                      resultSet.getString("nome"),
                                      resultSet.getString("cognome"),
                                      resultSet.getTimestamp("data_nascita").toLocalDateTime());
                persone.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Errore in findByCognome: " + e.getMessage());
            throw new DAOException("Errore durante la ricerca per cognome.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return persone;
    }

    public List<Persona> findByAnno(String annoNascita) throws DAOException {
        List<Persona> persone = new ArrayList<>();
        // Query dipendente dal DB. Per MySQL/SQL Server:
        String SQL = "SELECT id, CF, nome, cognome, data_nascita FROM persona WHERE YEAR(data_nascita) = ?";
        // Per PostgreSQL: "SELECT id, CF, nome, cognome, data_nascita FROM persona WHERE EXTRACT(YEAR FROM data_nascita) = CAST(? AS INTEGER)";
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            // Si presume che annoNascita sia una stringa che può essere convertita a int dal DB o dal driver
            // Altrimenti, se il DB si aspetta un INTEGER, potresti dover fare: statement.setInt(1, Integer.parseInt(annoNascita));
            statement.setString(1, annoNascita); 
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                persona = new Persona(resultSet.getInt("id"),
                                      resultSet.getString("CF"),
                                      resultSet.getString("nome"),
                                      resultSet.getString("cognome"),
                                      resultSet.getTimestamp("data_nascita").toLocalDateTime());
                persone.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Errore in findByAnno: " + e.getMessage());
            throw new DAOException("Errore durante la ricerca per anno di nascita.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return persone;
    }

    public long count() throws DAOException {
        String SQL = "SELECT COUNT(*) FROM persona";
        System.out.println(SQL);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        long count = 0;
        try {
            connection = DataSource.getConnection();
            statement = connection.prepareStatement(SQL);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getLong(1);
            }
        } catch (SQLException e) {
            System.err.println("Errore in count: " + e.getMessage());
            throw new DAOException("Errore durante il conteggio delle persone.", e);
        } finally {
            DBUtil.close(resultSet);
            DBUtil.close(statement);
            DBUtil.close(connection);
        }
        return count;
    }
}