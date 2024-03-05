package state;

public class Main {

    public static void main(String[] args) {
        DocumentContext d = new DocumentContext();
        d.setiDocumentState(new DocumentNew());
        System.out.println(d.getStatusName());
        d.nextDocumStatus();
        System.out.println(d.getStatusName());
        d.nextDocumStatus();
        System.out.println(d.getStatusName());
        d.nextDocumStatus();
        System.out.println(d.getStatusName());

    }

}