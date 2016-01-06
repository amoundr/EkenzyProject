package com.ekenzy.ndr.web;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.SecteurActivite;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.dao.entities.socialnt.Conversation;
import com.ekenzy.ndr.dao.entities.socialnt.Message;
import com.ekenzy.ndr.metier.IEcommerceMetier;
import com.ekenzy.ndr.metier.IekenzyMetier;

@Controller
public class MessageController {
	
	@Autowired
	private IekenzyMetier metier ;
	private Long dernMsg;
	
	
	@Autowired
	private IEcommerceMetier	metierEcommerce ;

	
	//pour dive
	@RequestMapping(value="/entreprise/messages")
	public String messagerie(Model model,Principal principal)
	
	{
		
		/**** add products***/
		model.addAttribute("produits", metierEcommerce.produitsParCategorie(1L));				
		
	   String s=null;
	   String name = principal.getName(); //get logged in username
	   Entreprise e=metier.getEntrByName(name);
	   Long id=e.getId();
	   
	    List<Entreprise>listEntr=metier.getAllEntreprise(id);
	    LinkedHashMap<Message,String> malist=new LinkedHashMap<Message, String>();
	    LinkedHashMap<Message,String> msgnonlumap=new LinkedHashMap<Message, String>();
		List <Conversation> lc=metier.listConv(id, 30, 0);
		LinkedList<String> Mcss=new LinkedList<String>();
		List <Message> lm=metier.getMsgNonlu(id);
		for(Conversation c:lc){
			
			Message m=metier.getMsgbyEnDat(c.getE1().getId(), c.getE2().getId(), c.getDateCnv());
			if(m.getEE().getId()==id){
			        malist.put(m,m.getER().getNom());
			        s="msg msgenvoy";}
			if(m.getER().getId()==id){
		           malist.put(m,m.getEE().getNom());
		           s="msg msgrecue";}
			
			Mcss.add(s);
		    }
		/*mape de messages no lus
		System.out.println("*************wwamllllsl****************");
          for(Message dd:lm){
        	  msgnonlumap.put(dd,dd.getEE().getNom());
        	  System.out.println("*************   jjjjjjjjjjjjjjjjjjjjj        ****************");
		    }
		model.addAttribute("MsgNoLu",msgnonlumap);*/
		model.addAttribute("EtatMsg",Mcss);
		model.addAttribute("mc",malist);
		model.addAttribute("AllEntre",listEntr);
		System.out.println("****************ttttt gvjv  *************"+malist.size());
		
		return "messages";
	}
	// affichage des message d'une conversation
	@RequestMapping(value = "/entreprise/A/{nomDestin}/{nobrAfich}")
    @ResponseBody
    public LinkedHashMap<Long, String> findMsgByEntrE(@PathVariable("nomDestin") String nomDestin,@PathVariable("nobrAfich") String nobrAfich,Principal principal) {
		System.out.println("************ " +nobrAfich+"************************************");
		Long d =Long.parseLong(nobrAfich);
		
		int k = d.intValue();
		
		System.out.println("************  "+k+"************************************");
		long l = metier.getEntrByName(nomDestin).getId();
		String name = principal.getName(); //get logged in username
		Entreprise e=metier.getEntrByName(name);
		 Long id=e.getId();
		System.out.println("************  +k+************************************");
		Long max=metier.nombreMsgConv(id, l);
		LinkedHashMap<Long, String> mms = new LinkedHashMap<Long, String>();
		String s;
		if(k<=max){
		List<Message> lm= new ArrayList<Message>(metier.listMsgConv(l,id,k+6, k));
		int i=1;
		for (Message m : lm){
		
		
			//s="<tr><td>"+m.getEE().getNom()+"</td><td>"+m.getContenu()+"</td><td>"+m.getDateMsg()+"<td></tr>";
			
		if(m.getEE().getId()==id){
			
            s="<div class='row setborder-top-bottom'><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class=' maxmsg'><p class='msg msgenvoy'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
		}
        else{
			
		    s="<div class='row setborder-top-bottom   message-active'><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class='maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
           }
		
		mms.put(new Long(i),s);i++;
		}
		
		
		
		return mms;}
		else {
			mms.put(new Long(1),"walo");
			return mms;
		}
			
    }
	
	// envoyer un message a partir d'une conversation
	@RequestMapping(value = "/entreprise/C/{msg}/{EntrDest}")
    @ResponseBody
    public LinkedHashMap<Long, String> findMsgByEntr(@PathVariable("msg") String msg,@PathVariable("EntrDest") String EntrDest,Principal principal) {
		long l =metier.getEntrByName(EntrDest).getId();
		String name = principal.getName(); 
		Entreprise e=metier.getEntrByName(name);
		Long id=e.getId();
		metier.setAllmsgVue(l, id);
        metier.sendMsg(id, l, msg);
       
		LinkedHashMap<Long, String> mms = new LinkedHashMap<Long, String>();
		String s;
		List<Message> lm= new ArrayList<Message>(metier.listMsgConv(l, id, 1, 0));
		
		int i=1;
		for (Message m : lm){
			if(m.getEE().getId()==id){
				
	            s="<div class='row setborder-top-bottom'><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class=' maxmsg'><p class='msg msgenvoy'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
			}
	        else{
				
			    s="<div class='row setborder-top-bottom   message-active'><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class='maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
	           }
			//dernMsg=m.getIdMsg();
			mms.put(new Long(i),s);i++;
			}
	
		return mms;
    }
	
	
	// envoyer un message simple
	@RequestMapping(value = "/entreprise/D/{msg}/{idE}")
    @ResponseBody
    public String SendMessage(@PathVariable("msg") String msg,@PathVariable("idE") String idE,Principal principal) {
		long l = Long.parseLong(idE);
		String name = principal.getName(); 
		Entreprise e=metier.getEntrByName(name);
		Long id=e.getId();
		metier.setAllmsgVue(l, id);
		metier.sendMsg(id, l, msg);
		
		return "bien";
    }
	
	// affichage des conversation  avec scrolling
		@RequestMapping(value = "/entreprise/A/{nobrAfich}")
	    @ResponseBody
	    public LinkedHashMap<Long, String> findMsgByEntrEy(@PathVariable("nobrAfich") String nobrAfich,Principal principal) {
			System.out.println("************ " +nobrAfich+"************************************");
			Long d =Long.parseLong(nobrAfich);
			
			int k = d.intValue();
			
			System.out.println("************  "+k+"************************************");
			String name = principal.getName(); //get logged in username
			Entreprise e=metier.getEntrByName(name);
			 Long id=e.getId();
			 SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			Long max=metier.nombreConv(id);System.out.println("************  "+max+"************************************");
			LinkedHashMap<Long, String> mms = new LinkedHashMap<Long, String>();
			String s=null;
			
			if(k<=max){
			List<Conversation> lc= new ArrayList<Conversation>(metier.listConv(id,2*k, k));
			int i=1;
			
			for(Conversation c:lc){
				String ss=formatter.format(c.getDateCnv());System.out.println("********"+ss+"**********");
				Message m=metier.getMsgbyEnDat(id, c.getE2().getId(), c.getDateCnv());
				if(m.getEE().getId()==id){
					if(m.getVue()==true)
					 s="<div class='row setborder-top-bottom'><div class='col-lg-1'>&nbsp;</div><div class='col-lg-2' id='demo' >"+m.getER().getNom()+"</div><div class='col-lg-6'><div class=' maxmsg'><p class='msg msgenvoy'>"+m.getContenu()+"&nbsp;&nbsp;<span class='glyphicon glyphicon-remove spanee'>&nbsp;vu</span></p></div></div><div class='col-lg-2'>"+ss+"</div><div class='messageEnv' id="+m.getER().getNom()+"><span class='link'><span class='pull-right clickable panel-collapsed'><i class='glyphicon glyphicon-plus aplusa'></i></span></span><div class='popup'><div class='box'>voir la conversation</div></div></div></div>";
					else 
						s="<div class='row setborder-top-bottom'><div class='col-lg-1'>&nbsp; </div><div class='col-lg-2' id='demo' >"+m.getER().getNom()+"</div><div class='col-lg-6'><div class=' maxmsg'><p class='msg msgenvoy'>"+m.getContenu()+"&nbsp;&nbsp;<span class='glyphicon glyphicon-remove spanee'>&nbsp;non vu</span></p></div></div><div class='col-lg-2'>"+ss+"</div><div class='messageEnv' id="+m.getER().getNom()+"><span class='link'><span class='pull-right clickable panel-collapsed'><i class='glyphicon glyphicon-plus aplusa'></i></span></span><div class='popup'><div class='box'>voir la conversation</div></div></div></div>";

				   }
				if(m.getER().getId()==id){
					if(m.getVue()==true)
					   s="<div class='row setborder-top-bottom'><div class='col-lg-1'><input type='checkbox' checked disabled> </div><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-6'><div class=' maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-2'>"+ss+"</div><div class='messageEnv' id="+m.getER().getNom()+"><span class='link'><span class='pull-right clickable panel-collapsed'><i class='glyphicon glyphicon-plus aplusa'></i></span></span><div class='popup'><div class='box'>voir la conversation</div></div></div></div>";
					else   
				       s="<div class='row setborder-top-bottom'><div class='col-lg-1'><input type='checkbox' class='nnn' id='"+m.getIdMsg()+"' value='"+m.getIdMsg()+"'> </div><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-6'><div class=' maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-2'>"+ss+"</div><div class='messageEnv' id="+m.getER().getNom()+"><span class='link'><span class='pull-right clickable panel-collapsed'><i class='glyphicon glyphicon-plus aplusa'></i></span></span><div class='popup'><div class='box'>voir la conversation</div></div></div></div>";

				  }
				
				
				mms.put(new Long(i),s);i++;
			    }
			
				
			return mms;}
			else {
				mms.put(new Long(1),"walo");
				return mms;
			}
				
	    }
	
		
		
		// **** vue pour un message
		@RequestMapping(value = "/entreprise/vueMsg/{id}/{v}/{EE}")
	    
	    public void vuMessage(@PathVariable("id") String id,@PathVariable("v") String lu,@PathVariable("EE") String EE,Principal principal) {
			long idmsg = Long.parseLong(id);
			Boolean v = Boolean.parseBoolean(lu);
			metier.msgVue(idmsg, v);
			String name = principal.getName(); 
			Entreprise e=metier.getEntrByName(name);
			Long idER=e.getId();
			long idEE = metier.getEntrByName(EE).getId();
			
			if(v==true){
				
				metier.setAllmsgVue(idEE, idER);
				
			}
			
	    }
		
		
		// affichage des message d'une conversation en temps reel
		@RequestMapping(value = "/entreprise/reel/{nomDestin}")
	    @ResponseBody
	    public LinkedHashMap<String, String> AffMsgTemRell(@PathVariable("nomDestin") String nomDestin,Principal principal) {
			long l = metier.getEntrByName(nomDestin).getId();
			
			
			String s2=null;
			String name = principal.getName(); //get logged in username
			Entreprise e=metier.getEntrByName(name);
			Long id=e.getId();
			LinkedHashMap<String, String> mms = new LinkedHashMap<String, String>();
			String s;
			List<Message> lm= new ArrayList<Message>(metier.listMsgConv(l,id,1,0));Message mm=lm.get(0);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println("**************"+dernMsg+"************"+mm.getContenu() +"********");
			//System.out.println("**************"+mm.getIdMsg()+"************   zzzzzz   ********");
			if(!lm.equals(null)){
			if(!mm.getIdMsg().equals(dernMsg) && mm.getER().getId()==id){
					
					for (Message m : lm){
						String ss=formatter.format(m.getDateMsg());
										dernMsg=m.getIdMsg();
											if(m.getEE().getId()==id){
												System.out.println("**************   "+mm.getIdMsg()+"  ************  "+m.getEE().getNom()+"   ********  "+m.getContenu());
									            s="<div class='row setborder-top-bottom' id='"+m.getER().getNom()+"'"+"><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class=' maxmsg'><p class='msg msgenvoy'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
									            s2="<div class='row setborder-top-bottom k' id='"+m.getER().getNom()+"'"+"><div class='col-lg-1'><input type='checkbox' class='nnn' id='"+m.getIdMsg()+"' value='"+m.getIdMsg()+"'> </div><div class='col-lg-2' id='demo' >"+m.getER().getNom()+"</div><div class='col-lg-6'><div class=' maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-2'>"+ss+"</div><div class='messageEnv' id="+m.getER().getNom()+"><span class='link'><span class='pull-right clickable panel-collapsed'><i class='glyphicon glyphicon-plus aplusa'></i></span></span><div class='popup'><div class='box'>voir la conversation</div></div></div></div>";
											}
									        else{
												
											    s="<div class='row setborder-top-bottom' id='"+m.getEE().getNom()+"'"+"><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class='maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
											    s2="<div class='row setborder-top-bottom k' id='"+m.getEE().getNom()+"'"+"><div class='col-lg-1'><input type='checkbox' class='nnn' id='"+m.getIdMsg()+"' value='"+m.getIdMsg()+"'> </div><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-6'><div class=' maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-2'>"+ss+"</div><div class='messageEnv' id="+m.getEE().getNom()+"><span class='link'><span class='pull-right clickable panel-collapsed'><i class='glyphicon glyphicon-plus aplusa'></i></span></span><div class='popup'><div class='box'>voir la conversation</div></div></div></div>";    
									        }
											
											mms.put(s2,s);
												
												
									
						    }
					return mms;
							
			}
			
			
			else {
				System.out.println("waloooooooooooooooooooo");
				mms.put("0","walo");
				return mms;
			   }
			}
			else {
				System.out.println("waloooooooooooooooooooo");
				mms.put("0","walo");
				return mms;
			}
				
	    }
		
			
		
		// affichage message non lu
		@RequestMapping(value = "/entreprise/nonluMsg")
	    @ResponseBody
	    public LinkedHashMap<Long, String> affichMsgNonLu(Principal principal) {
			String s=null;
			String name = principal.getName(); 
			Entreprise e=metier.getEntrByName(name);
			Long id=e.getId();
			
			LinkedHashMap<Long, String> mms = new LinkedHashMap<Long, String>();
			List<Message> lm= new ArrayList<Message>(metier.getMsgNonlu(id));
			int i=0;
			for (Message m : lm){
				
					if(m.getEE().getId()==id){
						System.out.println("**************   "+m.getIdMsg()+"  ************  "+m.getEE().getNom()+"   ********  "+m.getContenu());
			            s="<div class='row setborder-top-bottom'><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class=' maxmsg'><p class='msg msgenvoy'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
					          }
			        else{
						
					    s="<div class='row setborder-top-bottom   message-active'><div class='col-lg-2' id='demo' >"+m.getEE().getNom()+"</div><div class='col-lg-7'><div class='maxmsg'><p class='msg msgrecue'>"+m.getContenu()+"</p></div></div><div class='col-lg-3'>"+m.getDateMsg()+"</div></div>";
			                 }
					
					mms.put(new Long(i),s);i++;
					
              }
			
			return mms;
	    }

}
