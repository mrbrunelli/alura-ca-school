package br.com.alura.domain.student;

public interface PasswordEncryptor {
    String encrypt(String password);
    boolean validate(String encryptedPassword, String password);
}
