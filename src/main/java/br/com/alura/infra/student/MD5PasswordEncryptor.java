package br.com.alura.infra.student;

import br.com.alura.domain.student.PasswordEncryptor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5PasswordEncryptor implements PasswordEncryptor {
    @Override
    public String encrypt(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("error to generate password hash");
        }
    }

    @Override
    public boolean validate(String encryptedPassword, String password) {
        return encryptedPassword.equals(encrypt(password));
    }
}
