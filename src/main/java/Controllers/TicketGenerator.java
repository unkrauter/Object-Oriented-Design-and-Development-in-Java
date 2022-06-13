/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model_client.Ticket;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author andre
 */
public class TicketGenerator {

    public static String generateTicket(Ticket ticket)
    {
        try{
            JAXBContext context = JAXBContext.newInstance(Ticket.class);
            Marshaller marshall = context.createMarshaller();          
            StringWriter writer = new StringWriter();
            marshall.marshal(ticket, writer);
            return writer.toString();
            
        }
        catch (Exception e)
        
        {
            System.out.println(e);
        }
        return null;
        }
    }

