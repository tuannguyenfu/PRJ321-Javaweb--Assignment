/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.User;
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
public class UserDAO {

    /**
     * INSERT USER INTO DATABASE
     * @param name
     * @param email
     * @param password
     * @param gender
     * @param dob
     * @param addressLine
     * @param city
     * @param state
     * @param country
     * @param contact
     * @param registerDate
     * @return 1 if success, 0 if fall
     */
    public int createUser(String name, String email, String password, String gender, Date dob,
            String addressLine, String city, String state, String country, String contact, Date registerDate) {
        int save = 0;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new DBContext().getConnection();
            String sql = "INSERT INTO dbo.\"USER\"(name, email, password, gender, dob, addressline, city, state, country, contact, registereddate)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?) ";
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, gender);
            ps.setDate(5, dob);
            ps.setString(6, addressLine);
            ps.setString(7, city);
            ps.setString(8, state);
            ps.setString(9, country);
            ps.setString(10, contact);
            ps.setDate(11, registerDate);
            ps.executeUpdate();
            save = 1;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return save;
    }

    /**
     * CHECK USER IS EXIST OR NOT
     *
     * @param email
     * @param password
     * @return USER IF EMAIL AND PASSWORD IS CORRECT, NULL IF NOT
     */
    public User getOne(String email, String password) {
        User u = null;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.\"USER\" WHERE email = ? and password = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setGender(rs.getString("gender"));
                u.setDob(rs.getDate("dob"));
                u.setAddressLine(rs.getString("addressline"));
                u.setCity(rs.getString("city"));
                u.setState(rs.getString("state"));
                u.setCountry(rs.getString("country"));
                u.setContact(rs.getString("contact"));
                u.setRegisterDate(rs.getDate("registereddate"));
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.closeOnCompletion();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return u;
    }
    
    /**
     * Get all email can send of user login
     * @param email - Email of user
     * @return list email to send 
     */
    public List<String> listEmailSend(String email) {
        List<String> listOfEmailToSend = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new DBContext().getConnection();
            String sql = "SELECT email FROM dbo.\"USER\" WHERE email != ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listOfEmailToSend.add(rs.getString("email"));
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.closeOnCompletion();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listOfEmailToSend;
    }

}
