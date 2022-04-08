package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    // Couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Autowired
    @Qualifier("dao")
    private IDao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp * 540 / Math.cos(temp * Math.PI);
        return res;
    }

    /*
       Injecteer dans la variable dao un objet
       d'une classe qui implèmente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
