<%-- 
    Document   : newjsp
    Created on : 13 Jun 2022, 02:56:33
    Author     : andre
--%>

<%@page import="Controllers.TicketGenerator"%>
<%@page import="Model_client.Ticket"%>
<%@page import="java.util.List"%>
<%@page import="Model_client.Station" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="newjsp.jsp" id="usrform">
            <label for="FromStation">Select From Station:</label>
            <select name="FromStation" id="FromStation">
                <%
                    List<Station> listOfStation = ClientServiceRestful.ConsumerService.getStations();

                    for (int i = 0; i < listOfStation.size(); i++) {
                        out.print("<option value=" + i + ">" + listOfStation.get(i).getStationname() + "</option>");
                    }

                %>

            </select>
            <br><!-- comment -->
            <label for="ToStation">Select To Station:</label>

            <select name="ToStation" id="ToStation">


                <%                    List<Station> listOfStation2 = ClientServiceRestful.ConsumerService.getStations();

                    for (int i = 0; i < listOfStation2.size(); i++) {
                        out.print("<option value=" + i + ">" + listOfStation2.get(i).getStationname() + "</option>");
                    }

                %>

            </select>
            <br> 
            Ticket End Date:<input type="date" name="date"><br><!-- comment -->
            <input type="submit">
        </form>
        <%                   
                    String xml_ticket=null;
                    if (request.getParameter("FromStation") != null
                    && request.getParameter("ToStation") != null
                    && request.getParameter("date") != null) {
                        
 //              out.print("<h1>" + request.getParameter("FromStation") + "</h1>");
               
               
                        int fromZone= Integer.parseInt(request.getParameter("FromStation"));
                        int toZone= Integer.parseInt(request.getParameter("ToStation"));
                        Ticket ticket= new Ticket(listOfStation.get(fromZone).getStationname(),
                                listOfStation2.get(toZone).getStationname(),
                             String.valueOf(listOfStation.get(fromZone).getZone()),
                             String.valueOf(listOfStation2.get(toZone).getZone()), false, false);
                             xml_ticket =TicketGenerator.generateTicket(ticket);
            }
        %>
        <br>
        <textarea rows ='4' cols ='50'>
            <%
                out.print(xml_ticket);
            %>


        </textarea>


    </body>
</html>
