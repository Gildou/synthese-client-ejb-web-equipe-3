package beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IMagasinLocal;
import com.infotel.metier.Magasin;

@Named
@SessionScoped
public class MagasinBean implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 5533332365128779473L;
	// A REGENERER  private static final long serialVersionUID = 192071581349977345L;
    @EJB
    private IMagasinLocal service;
    private Magasin magasin = new Magasin();
    private List<Magasin> magasins;
    
    // GETTERS SETTERS
    
    
    //METHODES
    
//+++++++++++++++++++++++       AJOUTER         +++++++++++++++++++++++++++++
    
    public void addMagasin(Magasin m) {
        // TODO Auto-generated method stub
        service.addMagasin(m);
        magasin = new Magasin();
    }

//+++++++++++++++++++++++       SUPPRIMER           +++++++++++++++++++++++++++++
    public void supprimerMagasin(Magasin m) {
        // TODO Auto-generated method stub
        service.supprimerMagasin(m);
    }
//+++++++++++++++++++++++       MODIFIER            +++++++++++++++++++++++++++++
    
    public void modifierMagasin(Magasin m) {
        // TODO Auto-generated method stub
        service.modifierMagasin(m);
        magasin = new Magasin();
    }
//+++++++++++++++++++++++       GET         +++++++++++++++++++++++++++++
    
    public Magasin getMagasin(long idMagasin) {
        // TODO Auto-generated method stub
        return service.getMagasin(idMagasin);
    }
//+++++++++++++++++++++++       LISTER          +++++++++++++++++++++++++++++
    
    public List<Magasin> getAllMagasin() {
        // TODO Auto-generated method stub
        return service.getAllMagasin();
    }

//+++++++++++++++++++++++       CALCUL COUT         +++++++++++++++++++++++++++++
    
    public double calculPrixMagasin(Magasin m) {
        // TODO Auto-generated method stub
        return service.calculPrixMagasin(m);
    }
}
