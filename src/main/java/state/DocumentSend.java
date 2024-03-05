package state;

public class DocumentSend implements IDocumentState {

    @Override
    public void nextDocumStatus(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentDelivered());

    }

    @Override
    public void previousDocumStatuc(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentNew());

    }

    @Override
    public String getStatusName() {
        return StatusName.SEND.getStatusName();
    }


}