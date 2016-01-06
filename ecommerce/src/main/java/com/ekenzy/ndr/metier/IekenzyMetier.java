package com.ekenzy.ndr.metier;


import java.util.Date;
import java.util.List;

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

public interface IekenzyMetier {
	
	//******Zone*******//
		public void addVille(Ville v) ;
		public Ville getVille(Long id);
		public List<Ville> listVille() ;
		//******Zone*******//
		
		//******Zone*******//
		public void addZone(Zone z , Long idVille) ;
		public Zone getZone(Long id);
		public List<Zone> listZone() ;
		public List<Zone> listZone(Long id) ;
		//******Zone*******//
		
		public void addRole(Role r) ;
		
		//******Secteur*******//
		public void addSecteur(SecteurActivite s) ;
		public SecteurActivite getSecteur(Long id);
		public List<SecteurActivite> listSecteur() ;
		//******Secteur*******//
		
		//******Entreprise*******//
		public Entreprise getEntreprise(Long id );
		public void addEntreprise(Entreprise e , Long idZone , Long idSecteur) ;
		public Entreprise getEntreprisebyNom(String nom);
		public void modifierEntreprise(Entreprise e);
		public List<Entreprise> entrepriseParMotCle(String mc) ;
		
		public void murgeEntrepriseInofs(Entreprise a , Entreprise b);
		
		
		//salah
		public List<Entreprise> getAllEntreprise(Long id);
		public Entreprise getEntrByName(String nom);
		
		//******Entreprise*******//
		
		//******** Statut ********//
		public List<StatutJuridique> listStatuts() ;
		//******** Statut ********//
		

		//******** Manager ********//
		public void modifierManager(Manager m);
		public void murgeManagerInofs(Manager manager, Manager mymanager);
		//******** Manager ********//
		
		/******Message*******
		public void sendMessage(String content , Long idE , Long idR);
		public List<Message> listMessages(Long idA , Long idB);*/
		
		//******Message*******//
		
		/****** Gestion Abonnement *******/
		
		public void sabonner(Long idA , Long idAbn);
		public List<Entreprise>  getListAbonnee(Long idMe);
		public List<Abonnement>  getListAbonneeA(Long idMe);
		public List<Entreprise>  getListAbonne(Long idMe);
		public List<Abonnement>  getListAbonneA(Long idMe);
		public List<Entreprise>  getListNouvauxAbonnee(Long idMe) ;
		public List<Abonnement>  getListNouvauxAbonneeA(Long idMe) ;
		public void annulerAbonnemt(Long idMe , Long idAbonne); 
			
		/****** Gestion Abonnement *******/
		
		/****** Gestion Note *******/
		
		public Note recupererNote(Long idMe , Long idNotee);
		public void ajouterNote(Long idMe , Long idNotee , double note);
		public void modifierNote(Long idMe , Long idNotee , double note);
		
		/****** Gestion Note *******/
		
		//******message*******//
				public void sendMsg(Long idEE,Long idER, String contenu);
				public List<Message>listMsgConv(Long idE1,Long idE,int limit,int n);
				public Message getMsgbyEnDat(Long idE1,Long idE2,Date d);
				public void AddConversation(Long idE1,Long idE2,Date d);
				public List<Conversation>listConv(Long idE,int limit,int n);
				public Conversation getConversation(Long idE1,Long idE2);
				public Conversation getConverById(Long idCnv);
				public void UpDateConversation(Long idCnv,Date d);
				public Long nombreConv(Long idEdyali);
				public Long nombreMsgConv(Long idE1, Long idE2);
				public void msgVue(Long idmsg,Boolean v);
				public List<Message>getMsgNonlu(Long idER);
				public void setAllmsgVue(Long idEE, Long idER);
				//******message*******//
	

}
