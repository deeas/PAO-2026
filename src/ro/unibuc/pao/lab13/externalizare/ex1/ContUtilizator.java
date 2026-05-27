package ro.unibuc.pao.lab13.externalizare.ex1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ContUtilizator implements Externalizable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;
    private String parola;
    private double sold;

    public ContUtilizator() {
        //obligatoriu pentru Externalizable
    }

    public ContUtilizator(String username, String email, String parola, double sold) {
        this.username = username;
        this.email = email;
        this.parola = parola;
        this.sold = sold;
    }

    @Override
    public  void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(username);
        out.writeUTF(email);

        double soldCriptat = sold * 2 + 100;
        out.writeDouble(soldCriptat);

        //parola NU este salvata

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        username = in.readUTF();
        email = in.readUTF();
        double soldCriptat = in.readDouble();
        sold = (soldCriptat - 100)/2;

        parola = null;
    }

    @Override
    public String toString() {
        return "ContUtilizator{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", parola='" + parola + '\'' +
                ", sold=" + sold +
                '}';
    }
}
