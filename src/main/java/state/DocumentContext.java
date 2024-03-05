package state;

public class DocumentContext {

    private IDocumentState iDocumentState;

    public IDocumentState getiDocumentState() {
        return iDocumentState;
    }

    public void nextDocumStatus() {
        iDocumentState.nextDocumStatus(this);
    }

    public void previousDocumStatuc() {
        iDocumentState.previousDocumStatuc(this);
    }

    public void setiDocumentState(IDocumentState iDocumentState) {
        this.iDocumentState = iDocumentState;
    }

    public String getStatusName() {
        return iDocumentState.getStatusName();
    }
}