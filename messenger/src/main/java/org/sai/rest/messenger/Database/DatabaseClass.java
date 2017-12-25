package org.sai.rest.messenger.Database;

import java.util.HashMap;
import java.util.Map;

import org.sai.rest.messenger.Model.Messages;
import org.sai.rest.messenger.Model.Profile;

public class DatabaseClass {
	private static Map<Long, Messages> messages=new HashMap<>();//not thread safe
	private static Map<String, Profile>  profiles=new HashMap<>();
	
	public static Map<Long, Messages> getMessages(){
		return messages;
		
	}
	public static Map<String, Profile> getProfiles(){
		return profiles;
		
	}

}
