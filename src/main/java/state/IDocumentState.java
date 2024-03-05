package state;

public interface IDocumentState {
    String getStatusName();
    void nextDocumStatus(DocumentContext documentContext);
    void previousDocumStatuc(DocumentContext documentContext);
}