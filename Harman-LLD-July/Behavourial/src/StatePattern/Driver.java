package StatePattern;

public class Driver {
    public static void main(String[] args){
        DocumentEditor documentEditor= new DocumentEditor();
        documentEditor.setEditingMode(new SelectionMode());
        documentEditor.PerformClick();
        documentEditor.PerformKeyPress();



        documentEditor.setEditingMode(new WritingMode());
        documentEditor.PerformClick();
        documentEditor.PerformKeyPress();


        documentEditor.setEditingMode(new ErasingMode());
        documentEditor.PerformClick();
        documentEditor.PerformKeyPress();




    }
}
