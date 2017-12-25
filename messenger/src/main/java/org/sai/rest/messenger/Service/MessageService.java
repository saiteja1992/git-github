package org.sai.rest.messenger.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.eclipse.yasson.internal.serializer.CalendarTypeDeserializer;
import org.sai.rest.messenger.Database.DatabaseClass;
import org.sai.rest.messenger.Model.Messages;

public class MessageService {
	private Map<Long, Messages> messages=DatabaseClass.getMessages();
	public MessageService(){
		messages.put(1L, new Messages(1, "hello", "hmm"));
		messages.put(2L, new Messages(2, "hell", "hm"));
	}
	public List<Messages> getAllMessages(){
		return new ArrayList<Messages>(messages.values());
		
		/*Messages m=new Messages(1L, "hello", "sai");
		Messages m1=new Messages(1L, "hell", "saii");
		List<Messages> l=new ArrayList<>();
		l.add(m);
		l.add(m1);
		return l;*/
		
	}
	public List<Messages> getAllMessagesforYear(int Year){
		List<Messages> messagesforyear=new ArrayList<>();
		Calendar cal= Calendar.getInstance();
		for(Messages message:messages.values()){
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR)==Year){
				messagesforyear.add(message);			}
		}
		return messagesforyear;
		
	}
	public Messages getMessage(long id){
		return messages.get(id);
		
	}
	public Messages addMessage(Messages message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		
		return message;
	}
	public Messages updateMessage(Messages message){
		if (message.getId()<=0){
			return null;
		}
		messages.put(message.getId(),message);
		return message;
		
	}
	public Messages removeMessage(long id){
		return messages.remove(id);
		
	}
	
	
}
