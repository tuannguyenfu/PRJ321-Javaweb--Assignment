/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Message;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuann
 */
public class MessageDAO {

    /**
     * Add one message to DB (message from sender to receiver)
     * @param sender
     * @param receiver
     * @param subject
     * @param message
     * @param messagedate
     * @return 1 if message was sent successfully, 0 if not
     */
    public int addOne(String sender, String receiver, String subject, String message, Date messagedate) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new DBContext().getConnection();
            String sql = "INSERT INTO dbo.\"Message\"(sender, receiver, subject, message, messagedate ) VALUES (?,?,?,?,?) ";
            ps = con.prepareStatement(sql);
            ps.setString(1, sender);
            ps.setString(2, receiver);
            ps.setString(3, subject);
            ps.setString(4, message);
            ps.setDate(5, messagedate);
            ps.executeUpdate();
            return 1;
        } catch (Exception ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return 0;
    }

    /**
     * Get all inbox of email
     *
     * @param emailReceiver
     * @return list Message of email
     */
    public List<Message> listInboxOfEmail(String emailReceiver) {
        List<Message> listInboxOfEmail = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.\"Message\" WHERE receiver = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, emailReceiver);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Message mess = new Message();
                mess.setId(rs.getInt("id"));
                mess.setSender(rs.getString("sender"));
                mess.setReceiver(rs.getString("receiver"));
                mess.setMessage(rs.getString("message"));
                mess.setSubject(rs.getString("subject"));
                mess.setTrash(rs.getString("trash"));
                mess.setMessageDate(rs.getDate("messagedate"));
                listInboxOfEmail.add(mess);
            }
        } catch (Exception ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listInboxOfEmail;
    }

    /**
     * get all email sent
     *
     * @param emailReceiver
     * @return list sender of email
     */
    public List<Message> listSentOfEmail(String emailSent) {
        List<Message> listInboxOfEmail = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.\"Message\" WHERE sender = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, emailSent);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Message mess = new Message();
                mess.setId(rs.getInt("id"));
                mess.setSender(rs.getString("sender"));
                mess.setReceiver(rs.getString("receiver"));
                mess.setMessage(rs.getString("message"));
                mess.setSubject(rs.getString("subject"));
                mess.setTrash(rs.getString("trash"));
                mess.setMessageDate(rs.getDate("messagedate"));
                listInboxOfEmail.add(mess);
            }
        } catch (Exception ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listInboxOfEmail;
    }
}
