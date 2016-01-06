package com.ekenzy.ndr.metier;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ekenzy.ndr.dao.IekenzyDAO;
import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.Manager;
import com.ekenzy.ndr.dao.entities.Role;
import com.ekenzy.ndr.dao.entities.SecteurActivite;
import com.ekenzy.ndr.dao.entities.StatutJuridique;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.dao.entities.socialnt.Abonnement;
import com.ekenzy.ndr.dao.entities.socialnt.Conversation;
import com.ekenzy.ndr.dao.entities.socialnt.Message;
import com.ekenzy.ndr.dao.entities.socialnt.Note;

@Transactional
public class EkenzyMetierImpl implements IekenzyMetier {

	private IekenzyDAO dao ;
	
	public void setDao(IekenzyDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addEntreprise(Entreprise e , Long idZone , Long idSecteur) {
	    
		//verifi 
		dao.addEntreprise(e ,idZone ,idSecteur) ;
	}

	@Override
	public Entreprise getEntreprise(Long id) {
		
		return dao.getEntreprise(id) ;
	}
	
	@Override
	public Entreprise getEntreprisebyNom(String nom) {
		
		return dao.getEntreprisebyNom(nom) ;
	}
	
	@Override
	public void addVille(Ville v) {
		
		dao.addVille(v);
		
	}

	@Override
	public void addZone(Zone z , Long idVille) {

		dao.addZone(z , idVille);
	}

	@Override
	public void addSecteur(SecteurActivite s) {


		dao.addSecteur(s);
	}

	@Override
	public void addRole(Role r) {

		dao.addRole(r) ;
	}

	@Override
	public List<Zone> listZone() {
		return dao.listZone();
	}

	@Override
	public Ville getVille(Long id) {

		return dao.getVille(id);
	}

	@Override
	public Zone getZone(Long id) {
		return dao.getZone(id);
	}

	@Override
	public SecteurActivite getSecteur(Long id) {
		
		return dao.getSecteur(id);
	}

	@Override
	public List<Ville> listVille() {
		return dao.listVille();
	}

	@Override
	public List<SecteurActivite> listSecteur() {
		return dao.listSecteur();
	}
	
	/************ Message *************

	@Override
	public void sendMessage(String content , Long idE , Long idR) {
		
		dao.sendMessage(content, idE, idR);
	}

	@Override
	public List<Message> listMessages(Long idA, Long idB) {

		return dao.listMessages(idA, idB);
		
	}
	
	/************ Message *************/


	
	/****** Gestion Abonnement *******/
	@Override
	public void sabonner(Long idA, Long idAbn) {

		dao.sabonner(idA, idAbn);
	}

	@Override
	public List<Entreprise> getListAbonnee(Long idMe) {
		return dao.getListAbonnee(idMe);
	}

	@Override
	public List<Entreprise> getListAbonne(Long idMe) {
		return dao.getListAbonne(idMe) ;
	}

	@Override
	public List<Entreprise> getListNouvauxAbonnee(Long idMe) {
		return dao.getListNouvauxAbonnee(idMe);
	}

	@Override
	public void annulerAbonnemt(Long idMe, Long idAbonne) {
		dao.annulerAbonnemt(idMe, idAbonne);
		
	}

	@Override
	public void murgeEntrepriseInofs(Entreprise entreprise, Entreprise emp) {
		
		 entreprise.setCapitalSocial(emp.getCapitalSocial());
	     entreprise.setStatut(emp.getStatut());
	     entreprise.setNumTelephone(emp.getNumTelephone());
	     entreprise.setAdresse(emp.getAdresse());
	     entreprise.setActiviteEnDetail(emp.getActiviteEnDetail());
	     entreprise.setAnneeCreation(emp.getAnneeCreation());
	     
	     entreprise.setAffCaptitalSocial(emp.isAffCaptitalSocial());
	     entreprise.setAffStatut(emp.isAffStatut());
	     entreprise.setAffNumTelephone(emp.isAffNumTelephone());
	     entreprise.setAffAdresse(emp.isAffAdresse());
	     entreprise.setAffActiviteEnDetail(emp.isAffActiviteEnDetail());
	     entreprise.setAffAnneeCreation(emp.isAffAnneeCreation());
		
	}
	@Override
	public void murgeManagerInofs(Manager manager, Manager mymanager) {
		
		manager.setAffdateNaissance(mymanager.isAffdateNaissance());
		manager.setAffemailManager(mymanager.isAffemailManager());
		manager.setAffnameManager(mymanager.isAffnameManager());
		manager.setAffsexeManager(mymanager.isAffsexeManager());
		manager.setAffvilleActuelleManager(mymanager.isAffvilleActuelleManager());
		manager.setAffvilleNassanceManager(mymanager.isAffvilleNassanceManager());
		
		manager.setNameManager(mymanager.getNameManager());
		manager.setSexeManager(mymanager.isSexeManager());
		manager.setVilleActuelleManager(mymanager.getVilleActuelleManager());
		manager.setVilleNassanceManager(mymanager.getVilleNassanceManager());
		manager.setEmailManager(mymanager.getEmailManager());
		manager.setDateNaissance(mymanager.getDateNaissance());
		
	}

	@Override
	public void modifierEntreprise(Entreprise e) {
		
		dao.modifierEntreprise(e);
		
	}

	@Override
	public List<StatutJuridique> listStatuts() {

			return dao.listStatuts() ;
	}

	@Override
	public void modifierManager(Manager m) {
		
		dao.modifierManager(m);
	}

	@Override
	public List<Abonnement> getListAbonneeA(Long idMe) {
		return dao.getListAbonneeA(idMe);
	}

	@Override
	public List<Abonnement> getListAbonneA(Long idMe) {
		return dao.getListAbonneA(idMe);
	}

	@Override
	public List<Abonnement> getListNouvauxAbonneeA(Long idMe) {
		return dao.getListNouvauxAbonneeA(idMe);
	}

	@Override
	public Note recupererNote(Long idMe, Long idNotee) {

		return dao.recupererNote(idMe, idNotee);
	}

	@Override
	public void ajouterNote(Long idMe, Long idNotee, double note) {

		dao.ajouterNote(idMe, idNotee, note);
	}

	@Override
	public void modifierNote(Long idMe, Long idNotee, double note) {
		
		dao.modifierNote(idMe, idNotee, note);
		
	}
	
	/****** Gestion Abonnement *******/
	
	/****** Gestion Message *******/
	
	@Override
	public void sendMsg(Long idEE, Long idER, String contenu) {
		 dao.sendMsg(idEE, idER, contenu);
		
	}
	@Override
	public List<Message> listMsgConv(Long idE1,Long idE2, int limit,int n) {
		return dao.listMsgConv(idE1,idE2,limit,n);
	}

	@Override
	public void AddConversation(Long idE1, Long idE2, Date d) {
		 dao.AddConversation(idE1, idE2, d);
	}

	@Override
	public List<Conversation> listConv(Long idE, int limit,int n) {
		return dao.listConv(idE, limit,n);
	}

	@Override
	public Conversation getConversation(Long idE1, Long idE2) {
		return dao.getConversation(idE1, idE2);
	}

	@Override
	public Conversation getConverById(Long idCnv) {
		return dao.getConverById(idCnv);
	}

	@Override
	public void UpDateConversation(Long idCnv, Date d) {
		 dao.UpDateConversation(idCnv, d);
		
	}

	@Override
	public Long nombreConv(Long idEdyali) {
		return dao.nombreConv(idEdyali);
		}

	

	@Override
	public Message getMsgbyEnDat(Long idE1, Long idE2, Date d) {
		return dao.getMsgbyEnDat(idE1, idE2, d);
	}

	@Override
	public Long nombreMsgConv(Long idE1, Long idE2) {
		return dao.nombreMsgConv(idE1, idE2);
	}

	@Override
	public void msgVue(Long idmsg, Boolean v) {
		dao.msgVue(idmsg, v);
		
	}

	@Override
	public List<Message> getMsgNonlu(Long idER) {
		return dao.getMsgNonlu(idER);
	}

	@Override
	public void setAllmsgVue(Long idEE, Long idER) {
	   dao.setAllmsgVue(idEE, idER);
		
	}

	@Override
	public List<Entreprise> getAllEntreprise(Long id) {
		return dao.getAllEntreprise(id);
	}

	@Override
	public Entreprise getEntrByName(String nom) {
		return dao.getEntrByName(nom);
	}

	@Override
	public List<Entreprise> entrepriseParMotCle(String mc) {

		return dao.entrepriseParMotCle(mc);
	}

	@Override
	public List<Zone> listZone(Long id) {
		
		return dao.listZone(id);
	}	
	
	
	/****** Gestion Message *******/


}
