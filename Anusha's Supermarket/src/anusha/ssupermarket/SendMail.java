/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anusha.ssupermarket;

/**
 *
 * @author faraz
 */


import java.io.*;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SendMail extends Thread {
    public String userd,email,Total;
 public cartThread cart1;
    private String confirmCode;
    public SendMail(String userdet,cartThread t1,String total){
        this.userd = userdet;
        Total=total;
    cart1=t1;
        Object obj;
try {
obj = new JSONParser().parse(new FileReader(userd+".json"));
JSONObject read = (JSONObject) obj;
      email=  read.get("Email").toString();
      
} catch (IOException | org.json.simple.parser.ParseException e1) {
// TODO Auto-generated catch block
 
}        
           
        
        
    }
    
    /**
     * 
     */
    @Override 
    public void run() {
String[] str={"","","","","","","","","","","","","","","","","","","",""};
String host = "smtp.gmail.com";
        final String user = "farazproject1212@gmail.com";
        final String password = "ihpkiuxqubdcutlo";
        
        String to = email;// change accordingly

        // Get the session object
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        // Compose the message
        try {
           
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Receipt from Anusha's Supermarket");
              BodyPart messageBodyPart1 = new MimeBodyPart();  
    messageBodyPart1.setText("Thanks for Shopping with Anusha Supermarket!");  
    
      MimeBodyPart messageBodyPart2 = new MimeBodyPart();
      
         DataSource source = new FileDataSource("Receipt.txt");  
    messageBodyPart2.setDataHandler(new DataHandler(source));  
    messageBodyPart2.setFileName("Receipt.txt"); 
    
      Multipart multipart = new MimeMultipart();  
    multipart.addBodyPart(messageBodyPart1);  
    multipart.addBodyPart(messageBodyPart2);  
    
     message.setContent(multipart );  
            try{
            FileWriter fw = new FileWriter("Receipt.txt")  ;
PrintWriter pw = new PrintWriter(fw);

pw.println("*******************************************");
pw.println("           Anusha's SuperMarket            ");
pw.println("");
pw.println("");
pw.println("");
pw.println("Item               Price        Amount");
int length;
for(int i=0;i<9;i++){
    
length = cart1.item[i].length();
length= 20-length;

pw.print(cart1.item[i]);

for(int j=0;j<length;j++){
    pw.print(" ");
}

pw.print(cart1.price[i]);

length = Integer.toString(cart1.price[i]).length();

length = 8-length;
for(int j=0;j<length;j++){
    pw.print(" ");
}

pw.println(cart1.price[i]);


}

pw.println("Total : "+Total);
pw.println("*******************************************");
pw.println("Contacts: Farazproject1212@gmail.com");
pw.println("Find us on : Github.com/Faraz-ghani");
pw.close();
fw.close();


    
            }
            catch(IOException e){
                e.printStackTrace();
            }
            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}