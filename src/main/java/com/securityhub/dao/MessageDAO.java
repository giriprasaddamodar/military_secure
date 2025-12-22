package com.securityhub.dao;

import com.securityhub.model.Message;
import com.securityhub.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO {

    public void saveMessage(String sender, String content) {

        String sql = "INSERT INTO messages(sender, content) VALUES (?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, sender);
            ps.setString(2, content);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Message getLatestMessage() {

        String sql = "SELECT * FROM messages ORDER BY created_at DESC LIMIT 1";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return new Message(
                        rs.getInt("id"),
                        rs.getString("sender"),
                        rs.getString("content"),
                        rs.getTimestamp("created_at")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
