package beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IMagasinLocal;
import com.infotel.metier.Produit;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;

@Named
@SessionScoped
public class ProduitBean implements Serializable{

    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5121822160971614479L;
	@EJB
    private IMagasinLocal service;
    //private Produit produit = new Produit();
    private ProduitNonPerissable produitNonPerissable = new ProduitNonPerissable();
    private ProduitPerissable produitPerissable = new ProduitPerissable();
    private List<Produit> produit;
    
    
    
    // GETTERS SETTERS
    
    
        //METHODE
//+++++++++++++++++++++++       AJOUTER         +++++++++++++++++++++++++++++
        public void ajouterProduitNonPerissable(ProduitNonPerissable pnp) {
            // TODO Auto-generated method stub
            service.ajouterProduitNonPerissable(pnp);
            produitNonPerissable = new ProduitNonPerissable();
        }
        
        public void ajouterProduitPerissable(ProduitPerissable pp) {
            // TODO Auto-generated method stub
            service.ajouterProduitPerissable(pp);
            produitPerissable = new ProduitPerissable();
            produitPerissable = new ProduitPerissable();
        }
        
        public void ajouterProduit(Produit p, long idMagasin) {
            // TODO Auto-generated method stub
            service.ajouterProduit(p, idMagasin);
            produitNonPerissable = new ProduitNonPerissable();
        }
//+++++++++++++++++++++++       SUPPRIMER           +++++++++++++++++++++++++++++
        public long supprimerProduitNonPerissable(long idProduit) {
            // TODO Auto-generated method stub
            return service.supprimerProduitNonPerissable(idProduit);
        }
        
        public long supprimerProduitPerissable(long idProduit) {
            // TODO Auto-generated method stub
            return service.supprimerProduitPerissable(idProduit);
        }
//+++++++++++++++++++++++       MODIFIER            +++++++++++++++++++++++++++++
        
        public void modifierProduitNonPerissable(ProduitNonPerissable pnp) {
            // TODO Auto-generated method stub
            service.modifierProduitNonPerissable(pnp);
            produitNonPerissable = new ProduitNonPerissable();
        }
        
        
        public void modifierProduitPerissable(ProduitPerissable pp) {
            // TODO Auto-generated method stub
            service.modifierProduitPerissable(pp);
        }
//+++++++++++++++++++++++       GET         +++++++++++++++++++++++++++++
        
        public ProduitNonPerissable getProduitNonPerissable(long idProduit) {
            // TODO Auto-generated method stub
            return service.getProduitNonPerissable(idProduit);
        }
        
        public ProduitPerissable getProduitPerissable(long idProduit) {
            // TODO Auto-generated method stub
            return service.getProduitPerissable(idProduit);
        }
//+++++++++++++++++++++++       LISTER          +++++++++++++++++++++++++++++
        
        public List<Produit> getAllProduit() {
            // TODO Auto-generated method stub
            return service.getAllProduit();
        }
        
        public List<ProduitNonPerissable> getAllProduitNonPerissable() {
            // TODO Auto-generated method stub
            return service.getAllProduitNonPerissable();
        }
        
        public List<ProduitPerissable> getAllProduitPerissable() {
            // TODO Auto-generated method stub
            return service.getAllProduitPerissable();
        }
        
        public List<Produit> getProduitParMagasin(long idMagasin) {
            // TODO Auto-generated method stub
            return service.getProduitParMagasin(idMagasin);
        }
    }
