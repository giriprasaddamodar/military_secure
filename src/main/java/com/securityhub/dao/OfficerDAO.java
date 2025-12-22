package com.securityhub.dao;

import com.securityhub.model.Officer;
import com.securityhub.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OfficerDAO {

    public Officer login(String email, String password) {

        Officer officer = null;
        String sql = "SELECT * FROM officers WHERE email=? AND password=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                officer = new Officer(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return officer;
    }
}
