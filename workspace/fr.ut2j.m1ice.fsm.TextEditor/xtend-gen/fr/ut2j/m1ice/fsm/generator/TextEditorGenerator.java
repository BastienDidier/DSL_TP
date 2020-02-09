/**
 * generated by Xtext 2.14.0
 */
package fr.ut2j.m1ice.fsm.generator;

import fr.ut2j.m1ice.fsm.FSM;
import fr.ut2j.m1ice.fsm.State;
import fr.ut2j.m1ice.fsm.Transition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class TextEditorGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    FSM fsm = ((FSM) _get);
    EList<State> listState = fsm.getState();
    EList<Transition> listTransaction = fsm.getTransition();
    fsa.generateFile("Etat.java", this.generateStateInterface());
    fsa.generateFile("EtatOn.java", this.generateStateOn());
    fsa.generateFile("EtatOff.java", this.generateStateOff());
    fsa.generateFile("EtatFinal.java", this.generateStateFinal());
    fsa.generateFile("Transaction.java", this.generateTransition());
    fsa.generateFile("FSM.java", this.generateFSM(listState, listTransaction));
  }
  
  public String generateStateInterface() {
    String str = "\r\n\t\t\t\tpublic interface Etat {\r\n\t\t\t\t    String name = \'\';\r\n\t\t\t\t    public String display();\r\n\t\t\t\t\r\n\t\t\t\t}\r\n\t\t\t\t";
    return str;
  }
  
  public String generateStateOn() {
    String str = "\r\npublic class EtatOn implements Etat{\r\n    String name;\r\n    public EtatOn(String name)\r\n    {\r\n        this.name = name;\r\n    }\r\n    public String display()\r\n    {\r\n       return  this.name+\' Etat On\';\r\n    }\r\n}";
    return str;
  }
  
  public String generateStateOff() {
    String str = "\r\npublic class EtatOff implements Etat{\r\n    String name;\r\n    public EtatOn(String name)\r\n    {\r\n        this.name = name;\r\n    }\r\n    public String display()\r\n    {\r\n       return  this.name+\' Etat Off\';\r\n    }\r\n}";
    return str;
  }
  
  public String generateStateFinal() {
    String str = "\r\npublic class EtatFinal implements Etat{\r\n\r\n    @Override\r\n    public String display() {\r\n        return \'Etat Final\';\r\n    }\r\n}";
    return str;
  }
  
  public String generateTransition() {
    String str = "\r\npublic class Transaction {\r\n    Etat s1;\r\n    Etat s2;\r\n\r\n    public Transaction(Etat OldEtat, Etat NewEtat)\r\n    {\r\n        this.s1 = OldEtat;\r\n        this.s2 = NewEtat;\r\n    }\r\n\r\n    public String display()\r\n    {\r\n        return this.s1.name+\' => \'+this.s2.name;\r\n    }\r\n}\r\n\t\t\t\t";
    return str;
  }
  
  public String generateFSM(final EList<State> listState, final EList<Transition> listeTransition) {
    String str = "import java.util.ArrayList;\r\n\t\timport java.util.List;\r\n\t\timport java.util.Scanner;\r\n\t\tpublic class FSM {\r\n\t\t\r\n\t\t    Etat currentState;\r\n\t\t    List<Transaction> listTransaction;\r\n\t\t\r\n\t\t    public FSM ()\r\n\t\t    {\r\n\t\t        this.currentState = new EtatOn(\'initial\');\r\n\t\t        this.listTransaction = new ArrayList<Transaction>();\r\n\t\t    }\r\n\t\t\r\n\t\t    public static void main(String[] args) {\r\n\t\t        FSM fsm = new FSM();\n";
    String finalState = "";
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(listState, Object.class)).length); i++) {
      {
        String _str = str;
        String _string = listState.get(i).getClass().toString();
        String _plus = ("//" + _string);
        String _plus_1 = (_plus + "\n");
        str = (_str + _plus_1);
        String classe = "";
        int _indexOf = listState.get(i).getClass().toString().indexOf("StateOn");
        boolean _notEquals = (_indexOf != (-1));
        if (_notEquals) {
          classe = "EtatOn";
        } else {
          int _indexOf_1 = listState.get(i).getClass().toString().indexOf("StateOff");
          boolean _notEquals_1 = (_indexOf_1 != (-1));
          if (_notEquals_1) {
            classe = "EtatOff";
          } else {
            classe = "EtatFinal";
            finalState = listState.get(i).getName();
          }
        }
        String _str_1 = str;
        String _name = listState.get(i).getName();
        String _plus_2 = ("Etat " + _name);
        String _plus_3 = (_plus_2 + " = new ");
        String _plus_4 = (_plus_3 + classe);
        String _plus_5 = (_plus_4 + "(\'");
        String _name_1 = listState.get(i).getName();
        String _plus_6 = (_plus_5 + _name_1);
        String _plus_7 = (_plus_6 + "\');\n");
        str = (_str_1 + _plus_7);
        if ((i == 0)) {
          String _str_2 = str;
          String _name_2 = listState.get(i).getName();
          String _plus_8 = ("fsm.currentState=" + _name_2);
          String _plus_9 = (_plus_8 + ";\n");
          str = (_str_2 + _plus_9);
        }
      }
    }
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(listeTransition, Object.class)).length); i++) {
      {
        String _str = str;
        String _name = listeTransition.get(i).getName();
        String _plus = ("Transaction " + _name);
        String _plus_1 = (_plus + " = new Transaction(");
        String _name_1 = listeTransition.get(i).getSource().getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ",");
        String _name_2 = listeTransition.get(i).getTarget().getName();
        String _plus_4 = (_plus_3 + _name_2);
        String _plus_5 = (_plus_4 + ");\n");
        str = (_str + _plus_5);
        String _str_1 = str;
        String _name_3 = listeTransition.get(i).getName();
        String _plus_6 = ("fsm.listTrasaction.add(" + _name_3);
        String _plus_7 = (_plus_6 + ");\n");
        str = (_str_1 + _plus_7);
        String _str_2 = str;
        String _name_4 = listeTransition.get(i).getTarget().getName();
        String _plus_8 = ("fsm.currentState=" + _name_4);
        String _plus_9 = (_plus_8 + ";\n");
        str = (_str_2 + _plus_9);
      }
    }
    String _str = str;
    str = (_str + "for(i=0;i<fsm.listTransaction.size();i++){\n System.out.println(fsm.listTransaction.get(i).display());\n}\n");
    String _str_1 = str;
    str = (_str_1 + "System.out.println(\'Turning final state to Final\');\n");
    boolean _equals = finalState.equals("");
    if (_equals) {
      String _str_2 = str;
      str = (_str_2 + "fsm.currentState=new EtatFinal(\'final\');\n");
    } else {
      String _str_3 = str;
      str = (_str_3 + (("fsm.currentState=" + finalState) + "\n"));
    }
    String _str_4 = str;
    str = (_str_4 + "}\n}\n");
    return str;
  }
}
