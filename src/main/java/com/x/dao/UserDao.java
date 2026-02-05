package com.x.dao;

import com.x.config.DbConnection;
import com.x.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    // Method to register user or to insert user detail in db
    public static boolean registerUser(User user) throws Exception {
        boolean isSuccess = false;

        String sql = "insert into users (user_name, email, name, password_hash, bio, status ) values (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getUserName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getName());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getBio());
            ps.setString(6, "active");

            return ps.executeUpdate() == 1;
        }
    }

    // to fetch data by email while user trying to log in
    public static User getUserByEmail(String email) throws Exception {
        String sql = "select * from users where email = ?";

        // fetches user by email
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getString("bio"),
                            rs.getTimestamp("created_at"),
                            rs.getString("email"),
                            rs.getString("name"),
                            rs.getString("password_hash"),
                            rs.getString("status"),
                            rs.getInt("user_id"),
                            rs.getString("user_name")
                    );
                }
            }
        }
        return null;
    }

    // edits user bio
    public static boolean editBio (int userId, String newBio) throws Exception{

         String sql = "update users set bio = ? where user_id = ?";

         try (Connection conn = DbConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){

             ps.setString(1,newBio);
             ps.setInt(2,userId);
             return ps.executeUpdate() ==1;
         }
    }

    // toggles the user status
    public static boolean toggleStatus (int userId) throws Exception{

        String sql = "update users set status =  case when status = 'active' then 'block' else  'active' end where user_id = ?";

        try(Connection conn = DbConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql)){
              ps.setInt(1,userId);
            return ps.executeUpdate() ==1;
        }
    }

}
