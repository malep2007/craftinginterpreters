
import java.util.ArrayList;
import java.util.List;

/**
 * Scanner
 */
public class Scanner {

    private final String source;
    private final List<Token> tokens = new ArrayList<>();
    private int start = 0;
    private int current = 0;
    private int line = 1;

    public Scanner(String source) {
        super();
        this.source = source;
    }

    List<Token> scanTokens() {
        while(!isAtEnd()) {
            start = current;
            scanToken(); 
        }
        tokens.add(new Token(TokenType.EOF, "", null, line));
        return tokens;
    }

    private void scanToken() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scanToken'");
    }

    private boolean isAtEnd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAtEnd'");
    }
}