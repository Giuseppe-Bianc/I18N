package it.unibas.i18n;

public class Token {
    public enum Type {
        WORD,
        NUMBER,
        HEXADECIMAL,
        OCTAL,
        REAL,
        NEGATIVE_NUMBER,
        NEGATIVE_OCTAL,
        NEGATIVE_HEXADECIMAL,
        NEGATIVE_REAL,
        SYMBOL
    }

    private final Type type;
    private final String token;
    private final int line;
    private final int start;
    private final int end;

    public Token(Type type, String token, int line, int start, int end) {
        this.type = type;
        this.token = token;
        this.line = line;
        this.start = start;
        this.end = end;
    }

    public Type getType() {
        return type;
    }

    public String getToken() {
        return token;
    }

    public int getLine() {
        return line;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Token{");
        sb.append("type=").append(type);
        sb.append(", token='").append(token).append('\'');
        sb.append(", line=").append(line);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append('}');
        return sb.toString();
    }
}
