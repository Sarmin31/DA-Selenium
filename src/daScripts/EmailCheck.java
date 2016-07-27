//package daScripts;
//
//import java.io.*;
//import java.util.*;
//
//import javax.mail.*;
//import javax.mail.search.FlagTerm;
//
//public class EmailCheck {
//	
//	public EmailCheck(){
//		
//	}	
//	public static void run(String page) throws MessagingException, IOException {
//		EmailCheck gmail = new EmailCheck();
//		Properties props = new Properties();
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtps.auth", true);
//		props.put("mail.smtp.starttls.enable", true);
//		
//		Session session = Session.getDefaultInstance(props, null);
//		Store store = session.getStore("imaps");
//		store.connect("smtp.gmail.com", "da.test.email02@gmail.com","disasterassistance");
//		gmail.readMessages(store, page);
//		store.close();
//	}
//	public void readMessages(Store store,String page) throws MessagingException, IOException {
//		Folder inbox = store.getFolder("inbox");
//		inbox.open(Folder.READ_WRITE);
//		Message messages[] = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
//		//int totalMessageCount = inbox.getMessageCount();
//		//Message[] messages = inbox.getMessages();
//		for (int i = 0; i < messages.length; i++) {
//			if(messages[i].getSubject().contains(page)) {
//				System.out.println("<tr><td>"+page+"</td><td>Email</td><td>Pass</td><td>Send Page To</td></tr>");;
//			}
//		}
//		inbox.close(true);
// }
//}