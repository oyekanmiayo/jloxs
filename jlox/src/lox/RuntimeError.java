package lox;

/**
 * @author: aoyekanmi
 * @date: 05/03/2022
 */
public class RuntimeError extends RuntimeException{
    final Token token;

    RuntimeError(Token token, String message){
        super(message);
        this.token = token;
    }
}
