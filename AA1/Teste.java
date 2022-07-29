package AA1;

public class Teste {
    public static void execute(){
		Stack<String>stack = new Stack<String>();
		try {
		stack.push("João");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Maria");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Antonio");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Unibrasil");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Marcos");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Eugenio");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Leão");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Joaquim");
		System.out.println(stack.peek() + " adicionado");
		stack.push("José");
		System.out.println(stack.peek() + " adicionado");
		stack.push("Carlos Eduardo Albuquerque");
		System.out.println(stack.peek() + " adicionado");
		System.out.println();
		stack.print("Stack");
		System.out.println();
		System.out.println("1 pop: " + stack.pop());
		System.out.println("2 pop: " + stack.pop());
		System.out.println("3 pop: " + stack.pop());
		System.out.println("4 pop: " + stack.pop());
		System.out.println("5 pop: " + stack.pop());
		System.out.println("6 pop: " + stack.pop());
		System.out.println("7 pop: " + stack.pop());
		System.out.println("8 pop: " + stack.pop());
		System.out.println("9 pop: " + stack.pop());
		System.out.println("10 pop: " + stack.pop());
		stack.print("Pilha Vazia");
		System.out.println("11 pop: " + stack.pop());
		System.out.println();
		}
		catch (Exception e ) {
			System.err.println(e);
		}
    }
}
