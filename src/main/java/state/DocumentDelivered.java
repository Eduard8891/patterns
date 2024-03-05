package state;

public class DocumentDelivered implements IDocumentState {

    @Override
    public void nextDocumStatus(DocumentContext documentContext) {
        System.out.println("DocumentAccept nextDocumStatus NOTHING happens");

    }

    @Override
    public void previousDocumStatuc(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentSend());

    }

    @Override
    public String getStatusName() {
        return StatusName.DELIVERED.getStatusName();
    }


}