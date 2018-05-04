public class Main {

    public static void main(String[] args) {
        PostOffice postoffice = new PostOffice();
        Person thomas = new Person("Thomas");
        Person mathias = new Person("Mathias");
        Mail m = new Mail("Mathias", "Bruh", "You've got a secret lover");

        postoffice.Attach(thomas);
        postoffice.Attach(mathias);

        postoffice.addMail(m);
    }
}