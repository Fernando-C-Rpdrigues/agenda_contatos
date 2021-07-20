import model.Contact;

public class Main {

    public static void main (String[] args){

        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        contact1.setName("Fernando");
        contact1.setEmail("fe.C.rodrigues29@gmail.com");
        contact1.setPhone(996459374);
        contact1.setCompany("JK script");

        contact2.setName("LeoNardo");
        contact2.setEmail("le.r.Carlos@gmail.com");
        contact2.setPhone(9495890);
        contact2.setCompany("dupla Leandro e Leonardo");

        System.out.println(contact1);
        System.out.println(contact2);
    }

}
