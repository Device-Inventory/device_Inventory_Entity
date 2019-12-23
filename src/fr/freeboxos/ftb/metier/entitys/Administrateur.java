package fr.freeboxos.ftb.metier.entitys;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String mdp;

    public Administrateur() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Administrateur(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    private String codeMD5(String msg) throws NoSuchAlgorithmException {
        String code = "";
        byte[] b;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            b = md.digest(msg.getBytes());
            for (int i = 0; i < b.length; i++) {
                int x = b[i];

                if (x < 0) {
                    x += 256;
                }

                String s = String.format("%02x", x);
                code += s;
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }

        return code;
    }

    public boolean isValid(String mdp) throws NoSuchAlgorithmException {
        return this.mdp.equals(this.codeMD5(mdp));
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     * @throws java.security.NoSuchAlgorithmException
     */
    public void setMdp(String mdp) throws NoSuchAlgorithmException {
        this.mdp = this.codeMD5(mdp);
    }

    public void setEncodedMdp(String mdp) throws NoSuchAlgorithmException {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "(" + this.login + ") " + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.login);
        return hash;
    }
}
