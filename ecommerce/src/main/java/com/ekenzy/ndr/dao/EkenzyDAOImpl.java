package com.ekenzy.ndr.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Math ;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;


import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.Manager;
import com.ekenzy.ndr.dao.entities.Role;
import com.ekenzy.ndr.dao.entities.SecteurActivite;
import com.ekenzy.ndr.dao.entities.StatutJuridique;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.dao.entities.socialnt.Abonnement;
import com.ekenzy.ndr.dao.entities.socialnt.AbonnementKey;
import com.ekenzy.ndr.dao.entities.socialnt.Conversation;
import com.ekenzy.ndr.dao.entities.socialnt.Message;
import com.ekenzy.ndr.dao.entities.socialnt.Note;
import com.ekenzy.ndr.dao.entities.socialnt.NoteKey;

public class EkenzyDAOImpl implements IekenzyDAO {

	@PersistenceContext
	private EntityManager em ;
	
	@Override
	public void addEntreprise(Entreprise e , Long idZone , Long idSecteur) {
		
		
		
		/*************** get Statut *****************/
		StatutJuridique statut = em.find(StatutJuridique.class, new Long(3));
		
		/*************** get Zone *****************/
		Zone z = em.find(Zone.class, idZone) ;
		
		/*************** get Ville *****************/
		Ville v = z.getVille();
		
		/*************** get secteur d'activitee *****************/
		SecteurActivite sect = em.find(SecteurActivite.class, idSecteur);
		
		/*************** setters *****************/
		e.setStatut(statut) ;
		e.setVille(v);
		e.setSecteur(sect);
		e.setZone(z);
		// actived par defaut
		e.setActived(true);
		
		// set role par defaut
		Role role = em.find(Role.class, new Long(1));
		e.setRole(role);
		
		
		//e.setManager(m);
		
		Manager m = new Manager() ;	
		// ajouter entreprise
		em.persist(e);
				
		m.setEntrepriseManager(e);	
		
		
		// set Manager par defaut
			
		
	
		em.persist(m);
		
		
				
		
	}

	@Override
	public Entreprise getEntreprise(Long id) {
		
		return em.find(Entreprise.class, id);
	}
	
	@Override
	public Entreprise getEntreprisebyNom(String nom) {
		
		Query req=em.createQuery("select e from Entreprise e where e.nom = :x");
		req.setParameter("x", nom);
		return (Entreprise) req.getSingleResult();
		
	}
	
	

	@Override
	public void addVille(Ville v) {
		
		em.persist(v);
		
	}

	
	@Override
	public void addSecteur(SecteurActivite s) {


		em.persist(s);
	}

	@Override
	public void addRole(Role r) {

		em.persist(r);
	}

	@Override
	public List<Zone> listZone() {
		Query req=em.createQuery("select c from Zone c");
		return req.getResultList();
	}

	@Override
	public List<Zone> listZone(Long idVille) {
		Query req=em.createQuery("select c from Zone c  where c.ville.idVille=:x");
		req.setParameter("x", idVille);
		return req.getResultList();
	}


	@Override
	public Ville getVille(Long id) {

		return em.find(Ville.class, id);
	}

	@Override
	public void addZone(Zone z, Long idVille) {

		Ville v = getVille(idVille);
		z.setVille(v);
		em.persist(z);
		
	}

	@Override
	public Zone getZone(Long id) {

		return em.find(Zone.class, id);
	}

	@Override
	public SecteurActivite getSecteur(Long id) {


		return em.find(SecteurActivite.class, id);
	}

	@Override
	public List<Ville> listVille() {
		Query req=em.createQuery("select v from Ville v");
		return req.getResultList();
	}

	@Override
	public List<SecteurActivite> listSecteur() {
		Query req=em.createQuery("select c from SecteurActivite c");
		return req.getResultList();
	}
	
	/************ Message *************/

	/*@Override
	public void sendMessage(String content , Long idE , Long idR) {

		Entreprise emet = getEntreprise(idE);
		Entreprise rec = getEntreprise(idR);
		
		Message m = new Message(content, new Date(), emet, rec, false);
		em.persist(m);
	}

	@Override
	public List<Message> listMessages(Long idA, Long idB) {
		
		Query req=em.createQuery("select m from Message m where ( m.emetteur.id = :x1 AND m.recepteur.id = :x2 ) OR ( m.emetteur.id = :x2 AND m.recepteur.id = :x1 )");
		req.setParameter("x1", idA);
		req.setParameter("x2", idB);	
		return req.getResultList();
	}

	@Override
	public Map<Entreprise, Message> listConversation(Long idMe) {

		Map<Entreprise,Message> map = new HashMap<Entreprise, Message>();
        
		//Query req=em.createQuery("select m from Message m where ( m.emetteur.id = :x OR m.recepteur.id = :x ) ORDER BY m.date LIMIT 1");
		
		
		
		return null;
	}
	
	/************ Message *************/

	/****** Gestion Abonnement *******/
	
	
	@Override
	public void sabonner(Long idMe, Long idAbn) {
		
		AbonnementKey keyAb = new AbonnementKey(idMe, idAbn);
		Abonnement ab = new Abonnement(new Date(), getEntreprise(idMe), getEntreprise(idAbn));
		ab.setIdAbonnement(keyAb);
		
		em.persist(ab);
		
	}

	@Override
	public List<Entreprise> getListAbonnee(Long idMe) {
		//*
		Query req=em.createQuery("select e from Entreprise as e , Abonnement as a where a.idAbonnement.abonne = e.id    and   a.idAbonnement.abonnee = :x ");
		req.setParameter("x", idMe);
		return req.getResultList();
		
	}

	@Override
	public List<Entreprise> getListAbonne(Long idMe) {
		Query req=em.createQuery("select e from Entreprise as e , Abonnement as a where a.idAbonnement.abonnee = e.id    and   a.idAbonnement.abonne = :x ");
		req.setParameter("x", idMe);
		return req.getResultList();
	}

	@Override
	public List<Entreprise> getListNouvauxAbonnee(Long idMe) {
		// TODO Auto-generated method stub
		
		//Date laDate = new Date();
		
		/**** get Yesterday ***/
	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.DATE, -1);
	    Date laDate = calendar.getTime();
	    System.out.println(laDate + "     auj    " + new Date());
		
		Query req=em.createQuery("select e from Entreprise as e , Abonnement as a where a.idAbonnement.abonnee = e.id    and   a.idAbonnement.abonne = :x  and a.dateAbonnement >= :laDate");
		req.setParameter("x", idMe);
		req.setParameter("laDate" , laDate , TemporalType.DATE);
		return req.getResultList();
		
	}

	@Override
	public void annulerAbonnemt(Long idMe, Long idAbonne) {
		
		AbonnementKey keyAb = new AbonnementKey(idMe, idAbonne);
		Abonnement ab = em.find(Abonnement.class, keyAb);
		em.remove(ab);
	}

	@Override
	public void modifierEntreprise(Entreprise e) {
		
		em.merge(e) ;
		
	}

	@Override
	public List<StatutJuridique> listStatuts() {
		Query req=em.createQuery("select c from StatutJuridique c");
		return req.getResultList();
	}

	@Override
	public void modifierManager(Manager m) {
		
		em.merge(m);
	}

	@Override
	public List<Abonnement> getListAbonneeA(Long idMe) {
		Query req=em.createQuery("select a from Entreprise as e , Abonnement as a where a.idAbonnement.abonne = e.id    and   a.idAbonnement.abonnee = :x order by  a.dateAbonnement DESC");
		req.setParameter("x", idMe);
		return req.getResultList();
	}

	@Override
	public List<Abonnement> getListAbonneA(Long idMe) {
		Query req=em.createQuery("select a from Entreprise as e , Abonnement as a where a.idAbonnement.abonnee = e.id    and   a.idAbonnement.abonne = :x order by  a.dateAbonnement DESC");
		req.setParameter("x", idMe);
		return req.getResultList();
	}

	@Override
	public List<Abonnement> getListNouvauxAbonneeA(Long idMe) {
		//Date laDate = new Date();
		
				/**** get Yesterday ***/
			    Calendar calendar = Calendar.getInstance();
			    calendar.add(Calendar.DATE, -1);
			    Date laDate = calendar.getTime();
			    System.out.println(laDate + "     auj    " + new Date());
				
				Query req=em.createQuery("select a from Entreprise as e , Abonnement as a where a.idAbonnement.abonnee = e.id    and   a.idAbonnement.abonne = :x  and a.dateAbonnement >= :laDate order by  a.dateAbonnement DESC");
				req.setParameter("x", idMe);
				req.setParameter("laDate" , laDate , TemporalType.DATE);
				return req.getResultList();
	}
	/****** Gestion Abonnement *******/

	/****** Gestion Note *******/
	
	@Override
	public Note recupererNote(Long idMe, Long idNotee) {

		NoteKey nkey = new NoteKey(idMe ,idNotee);
		
		return em.find(Note.class, nkey);
	}

	@Override
	public void ajouterNote(Long idMe, Long idNotee , double note) {
		
		/*cle de la note*/
		NoteKey nKey = new NoteKey(idMe, idNotee);
		double ancNotepartielle = 0;
		boolean ancPartExiste = false ;
		
		/*recuperer la note s'elle existe*/
		Note nt =  em.find(Note.class, nKey);
		if(nt == null)
		{   /*creer note s'elle n'existe pas*/
			nt = new Note( note, getEntreprise(idMe), getEntreprise(idNotee)); nt.setNotekey(nKey);
		}else{ ancNotepartielle = nt.getNote() ; ancPartExiste = true ;}
		
		/*entregister nouvelle note partielle*/
		//nt.setNotekey(nKey);		
		nt.setNote(note);
		em.persist(nt);
		
		
		/*calculer note general */
		
		/*get nombre de notes*/
		Query req=em.createQuery("select count(*) from Note as n  where n.notekey.notee = :x ");
		req.setParameter("x", idNotee); 
		Long nbreNote = (Long) req.getSingleResult();
		
		System.out.println("nombre note : "+ nbreNote);
		
		/*get Note generale */
		Entreprise en = em.find(Entreprise.class, idNotee);
		double ancNote  = en.getNote();
		
		System.out.println("ancienne note : "+en.getNote());
		
		double nouvNote =0 ;
		if(ancPartExiste)  { nouvNote = (nbreNote * ancNote + note - ancNotepartielle) / (nbreNote) ; 
		  System.out.println("nbreNote :" +nbreNote);
		  System.out.println("ancNote :" +ancNote);
		  System.out.println("note :" +note);
		  System.out.println("ancNotepartielle :" +ancNotepartielle);
		  System.out.println("nouvNote :" +nouvNote);
		}
		else	{ nouvNote = ( (nbreNote-1) * ancNote + note) / (nbreNote) ;
		
		System.out.println("nbreNote :" +nbreNote);
		  System.out.println("ancNote :" +ancNote);
		  System.out.println("note :" +note);
		  System.out.println("nouvNote :" +nouvNote);
		
		}
		
		//System.out.println("nouvelle note :"+nouvNote);
		
		en.setNote(nouvNote);
		
		//em.merge(en);		
		
	}

	@Override
	public void modifierNote(Long idMe , Long idNotee , double note) {
		
		NoteKey nKey = new NoteKey(idMe, idNotee);
		Note nt = em.find(Note.class, nKey);		
		nt.setNote(note);	
		em.merge(nt);
	}

	
	/****** Gestion Note *******/
	
	/****** Gestion Message & conversation *******/
	@Override
	public void sendMsg(Long idEE, Long idER, String contenu) {
		Conversation c =getConversation(idEE, idER);
		Date d=new Date();
		Message m=new Message(d, contenu);
		Entreprise EE=getEntreprise(idEE);
		Entreprise ER=getEntreprise(idER);
		m.setEE(EE);m.setER(ER);
		
		if(c==null)
			AddConversation(idEE, idER, d);
		else 
			UpDateConversation(c.getIdCnv(), d);
		
		em.persist(m);
		 
	}

	@Override
	public List<Message> listMsgConv(Long idE1,Long idE2,int limit,int n) {
		
		Query req=em.createQuery("select m from Message m  where (m.EE.id=:x and m.ER.id=:y) or (m.ER.id=:x and m.EE.id=:y) order by m.dateMsg desc ");
		req.setParameter("x", idE1);req.setParameter("y", idE2);
		
        if (limit > 0) {
        	req.setMaxResults(limit);
            List<Message> list = req.getResultList();
            return list.subList(n,  java.lang.Math.min(limit, list.size()));
        } else {
            List<Message> list =  req.getResultList();;
            return list;
        }
	}

	@Override
	public void AddConversation(Long idE1, Long idE2, Date d) {
		Entreprise E1=getEntreprise(idE1);
		Entreprise E2=getEntreprise(idE2);
		Conversation c=new Conversation(d);
		c.setE1(E1);c.setE2(E2);
		em.persist(c);
		
	}

	@Override
	//listconv(x,n,(0-2-4-.......-list.size()) n par n
	public List<Conversation> listConv(Long idE, int limit,int n) {
		Query query = em.createQuery("select c from Conversation c  where (c.E1.id=:x or c.E2.id=:x) order by dateCnv desc");
		query.setParameter("x", idE);
        if (limit > 0) {
            query.setMaxResults(limit);
            List<Conversation> list = query.getResultList();
            return list.subList(n, java.lang.Math.min(limit, list.size()));
        } else {
            List<Conversation> list =  query.getResultList();;
            return list;
        }
	}

	@Override
	public Conversation getConversation(Long idE1, Long idE2) {
		Query req=em.createQuery("select c from Conversation c  where (c.E1.id=:x and c.E2.id=:y) or (c.E2.id=:x and c.E1.id=:y) ");
		req.setParameter("x", idE1);req.setParameter("y", idE2);
		if(req.getResultList().size()==0)
			return null;
		else return (Conversation) req.getResultList().get(0);
	}

	@Override
	public void UpDateConversation(Long idCnv, Date d) {
		Query req=em.createQuery("update Conversation  set dateCnv=:y"+" where idCnv=:x");
		req.setParameter("x", idCnv);req.setParameter("y", d);
		int result = req.executeUpdate();
		
	}

	@Override
	public Conversation getConverById(Long idCnv) {
		return em.find(Conversation.class, idCnv);
		
	}

	@Override
	public Long nombreConv(Long idEdyali) {
		Query req=em.createQuery("select count(c) from Conversation c  where (c.E1.id=:x or c.E2.id=:x)");
		req.setParameter("x", idEdyali);
		return (Long)req.getSingleResult();
	}

	@Override
	public Entreprise getEntrByName(String nom) {
		Query req=em.createQuery("select e from Entreprise e  where nom=:x");
		req.setParameter("x", nom);
		return (Entreprise)req.getSingleResult();
	}

	@Override
	public List<Entreprise> getAllEntreprise(Long id) {
		Query req=em.createQuery("select e from Entreprise e where id<>:x");
		req.setParameter("x", id);
		List<Entreprise> list =  req.getResultList();
		return list;
	}

	@Override
	public Message getMsgbyEnDat(Long idE1, Long idE2, Date d) {
		Query req=em.createQuery("select m from Message m  where ((EE.id=:x and ER.id=:y) or (ER.id=:x and EE.id=:y)) and dateMsg=:z");
		req.setParameter("x", idE1);req.setParameter("y", idE2);req.setParameter("z", d);
		return (Message)req.getSingleResult();
	}

	@Override
	public Long nombreMsgConv(Long idE1, Long idE2) {
		Query req=em.createQuery("select count(m) from Message m  where (m.EE.id=:x and m.ER.id=:y) or (m.EE.id=:y and m.ER.id=:x)");
		req.setParameter("x", idE1);req.setParameter("y", idE2);
		return (Long)req.getSingleResult();
	}

	@Override
	public void msgVue(Long idmsg,Boolean v) {
		Query req=em.createQuery("update Message  set vue=:y"+" where idMsg=:x");
		req.setParameter("x", idmsg);req.setParameter("y", v);
		int result = req.executeUpdate();
	
		
	}

	@Override
	public List<Message> getMsgNonlu(Long idER) {
		Query req=em.createQuery("select m from Message m  where ER.id=:x and vue=false order by EE.id,dateMsg desc");
		req.setParameter("x", idER);
		List<Message> list = req.getResultList();
		return list;
		
	}

	@Override
	public void setAllmsgVue(Long idEE, Long idER) {
		Query req=em.createQuery("update Message  set vue=true where EE.id=:x and ER.id=:y");
		req.setParameter("x", idEE);req.setParameter("y", idER);
		int result = req.executeUpdate();
		
	}
	/****** Gestion Message & conversation *******/

	@Override
	public List<Entreprise> entrepriseParMotCle(String mc) {
		
		Query req = em.createQuery("select e from Entreprise e where e.nom like :x");
		req.setParameter("x", "%"+ mc+"%");
		return req.getResultList();
	}

	
	
	
	

}
