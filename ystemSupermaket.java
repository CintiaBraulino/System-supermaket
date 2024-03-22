import java.util.HashMap;

public class SystemSupermaket {
    
    public static void main(String[] args) {
        HashMap<String, Cliente> clientes = new HashMap<>();
        
        // Adicionando clientes ao sistema
        clientes.put("123456789", new Cliente("Cintia", "12345678999"));
        clientes.put("987654321", new Cliente("Simone", "99999999999"));
        
        // Realizando busca pelo CPF do cliente
        String cpf = "123456789";
        Cliente cliente = clientes.get(cpf);
        
        if (cliente != null) {
            System.out.println("Nome: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    
}
