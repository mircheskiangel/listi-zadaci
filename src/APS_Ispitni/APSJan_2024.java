package APS_Ispitni;

public class APSJan_2024 {
    DLLNode<String> node = list.getFirst();
    DLLNode<String> brisi_jazol = list.getFirst();
    int dolzina = 0;
    while(node!=null){
        if(node.element.length() >= dolzina){
            dolzina = node.element.length();
            brisi_jazol = node;
        }
        node = node.succ;
    }
    list.delete(brisi_jazol);
}
