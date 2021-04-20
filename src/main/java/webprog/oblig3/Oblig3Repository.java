package webprog.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Oblig3Repository {

    @Autowired
    private JdbcTemplate db;

    public void lagre(Billetter billett){
        String sql = "INSERT INTO Billetter (film,fornavn,etternavn,telefonnr,epost,antall) VALUES(?,?,?,?,?,?)";
        db.update(sql,billett.getFilm(),billett.getFornavn(),billett.getEtternavn(),billett.getTelefonnr(),
                billett.getEpost(),billett.getAntall());
    }

    public List<Billetter> hentBilletter(){
        String sql = "SELECT * FROM Billetter";
        List<Billetter> alleBilletter = db.query(sql,new BeanPropertyRowMapper(Billetter.class));
        return alleBilletter;
    }

    public void slett(){
        String sql = "DELETE FROM Billetter";
        db.update(sql);
    }
}
