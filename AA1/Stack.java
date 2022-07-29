package AA1;

public class Stack<A> {
	
	/* Container para os elementos da pilha */
	class Element {	
	    private A val; // valor do elemento
	    private Element next; // proximo elemento da pilha

	    //cria um elemento com o valor el e uma referencia para next_
	    public Element(A el, Element next_){
		this.val = el;
		this.next = next_;
	    }
	    public A getVal() {
		return val;
	    }

	    public Element getNext() {
		return next;
	    }
	}
	
    private Element top; // Ultimo elemento da pilha
    
    // Contrutor da pilha
    // Cria uma pilha vazia
    public Stack() {
	this.top = null;
    }
    
    // Cria um novo elemento com o valor 'el', cujo proximo elemento
    // é o this.top (ultimo elemento da pilha) e o torna ultimo elemento da pilha(this.top)
    public void push(A el) {
	Element newtop = new Element(el, this.top);
	this.top = newtop;	
    }
    
    // Remove o ultimo elemento e atualiza a referencia
    //this.top para ser o proximo elemento(this.top.getNext())
    public A pop() throws EmptyException  {
    	//Lança um erro caso a pilha esteja vazia
	if (this.top == null)
	    throw new EmptyException("A LISTA ESTA VAZIA! ESTA OPERAÇAO NAO PODE SER EXECUTADA");
	
	A el = this.top.getVal();
	this.top = this.top.getNext();
	return el;
    }
    
    // Percorre cada elemento da pilha imprimindo seu conteudo
    public void print(String name) {
	System.out.print(name + ": [ ");	
	Element act = this.top;
	while (act != null) {
	    System.out.print("" + act.getVal());
	    act = act.getNext();
	    if (act == null) 
		break;
	    System.out.print(", ");
	}
	System.out.println(" ]");
	
    }
   // Mostrando o item que esta no topo no momento
    public A peek() throws EmptyException {
  	  if (this.top == null)
  	    throw new EmptyException("A LISTA ESTA VAZIA! ESTA OPERAÇAO NAO PODE SER EXECUTADA");

  	  return this.top.getVal();
    }
    
}
