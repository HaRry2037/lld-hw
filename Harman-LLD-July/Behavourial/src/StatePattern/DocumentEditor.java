package StatePattern;

public class DocumentEditor {
    private EditingMode editingMode;
    public void setEditingMode(EditingMode editingMode){
        this.editingMode=editingMode;
    }
    public void PerformClick(){
        this.editingMode.handleKeyClick();
    };
    public void PerformKeyPress(){
        this.editingMode.handleKeyPress();
    };
}
