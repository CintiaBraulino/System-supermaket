import java.util.HashMap;

public class SystemSupermaket {
    
    public static void main(String[] args) {
        HashMap<String, Users> users = new HashMap<>();
        
        // Adicionando clientes ao sistema
        users.put("123456789", new Users("Cintia", "12345678999"));
        users.put("987654321", new Users("Simone", "99999999999"));
        
        // Realizando busca pelo CPF do cliente
        String cpf = "123456789";
        Users cliente = users.get(cpf);
        
        if (cliente != null) {
            System.out.println("Nome: " + users.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    
}
