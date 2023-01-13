import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Named
@ApplicationScoped
public class SuperHeroRepository {

    public List<Publisher> getAllPublishers() {

        List<Publisher> publishers = new ArrayList<>();
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/superhero?user=root&password=");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT p.id, p.publisher_name, COUNT(sh.publisher_id)  FROM publisher as p join superhero as sh on (p.id = sh.publisher_id) group by p.publisher_name ");
        ) {


            while (resultSet.next()) {
                publishers.add(new Publisher(resultSet.getString(1), resultSet.getString(2), resultSet.getInt("COUNT(sh.publisher_id)")));
            }

            return publishers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<SuperHero> getAllHeros() {

        List<SuperHero> heros = new ArrayList<>();
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/superhero?user=root&password=");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT h.superhero_name, h.full_name, g.gender, r.race, a.alignment,h.publisher_id FROM superhero as h join gender as g on (h.gender_id = g.id) join race as r on (r.id = h.race_id) join alignment as a on (a.id = h.alignment_id) join publisher as p on (p.id = h.publisher_id)")
        ) {
            while (resultSet.next()) {
                heros.add(new SuperHero(
                        resultSet.getString("h.superhero_name"),
                        resultSet.getString("h.full_name"),
                        resultSet.getString("g.gender"),
                        resultSet.getString("r.race"),
                        resultSet.getString("a.alignment"),
                        resultSet.getString("h.publisher_id")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return heros;
    }

}

