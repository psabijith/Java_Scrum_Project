package com.aitrich.BankingSector;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Authentication {

    private Map<String, String> authenticationMap = new HashMap<>();
    private final String file = "Authentication.txt";

    public Authentication() {
        try {
            loadUserData();
        } catch (IOException e) {
            System.out.println("Warning: could not load auth data: " + e.getMessage());
        }
    }

   
    private void loadUserData() throws IOException {
        authenticationMap.clear();
        File f = new File(file);
        if (!f.exists()) {
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String username = parts[0].trim();
                    String password = parts[1].trim();
                    authenticationMap.put(username, password);
                }
            }
        }
    }

   
    public boolean register(String username, String password) {
        if (username == null || username.isBlank() ||
            password == null || password.isBlank()) {
            System.out.println("Username and password cannot be empty!");
            return false;
        }

        try {
            loadUserData();

            if (authenticationMap.containsKey(username)) {
                System.out.println(username + " already exists!");
                return false;
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write(username + "," + password);
                bw.newLine();
            }

            authenticationMap.put(username, password);
            return true;

        } catch (IOException e) {
            System.out.println("Error while registering user: " + e.getMessage());
            return false;
        }
    }


    public boolean login(String username, String password) {
        if (username == null || username.isBlank() ||
            password == null || password.isBlank()) {
            System.out.println("Username and password cannot be empty!");
            return false;
        }

        try {
            loadUserData();
        } catch (IOException e) {
            System.out.println("Error loading auth data: " + e.getMessage());
            return false;
        }

        String storedPass = authenticationMap.get(username);
        if (storedPass != null && storedPass.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }
}
