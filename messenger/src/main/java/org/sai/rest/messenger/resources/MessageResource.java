package org.sai.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.sai.rest.messenger.Model.Messages;
import org.sai.rest.messenger.Service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageservice=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getMessages(@QueryParam("year") int year){
		if(year>0){
			return messageservice.getAllMessagesforYear(year);
		}
		return messageservice.getAllMessages();
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Messages addMessage(Messages message){
		//return "post";
		return messageservice.addMessage(message);
		
	}
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Messages updateMessage(@PathParam("messageId") long id, Messages message){
		message.setId(id);
		return messageservice.updateMessage(message);
		
	}
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Messages deleteMessage(@PathParam("messageId") long id){
		return messageservice.removeMessage(id);
		
	}
@GET
@Path("/{messageId}")
@Produces(MediaType.APPLICATION_JSON)
public Messages getMessage(@PathParam("messageId") long id){
	return messageservice.getMessage(id);
	
}



}
