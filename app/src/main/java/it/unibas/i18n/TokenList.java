package it.unibas.i18n;

import org.checkerframework.checker.units.qual.C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TokenList {
    private static final Logger logger = LoggerFactory.getLogger(TokenList.class.getName());
    private List<Token> tokens = new ArrayList<>();

    public List<Token> getTokens() {
        return tokens;
    }

    /**
     * Returns the number of elements in this list.  If this list contains
     * more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return tokens.size();
    }

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    public boolean isEmpty() {
        return this.tokens.isEmpty();
    }

    public void addToken(Token token) {
        this.tokens.add(token);
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index >= size()})
     */
    public Token get(int index) {
        return this.tokens.get(index);
    }

    public Token getNextToken(int index) {
        if (index == -1 || index == this.tokens.size() - 1) {
            return null;
        }
        return this.tokens.get(index + 1);
    }

    public Token getTwoTokensAfter(int index) {
        if (index == -1 || index >= this.tokens.size() - 2) {
            return null;
        }
        return this.tokens.get(index + 2);
    }

    /*public TokenList resolveReal(){
        TokenList tokenListRepaired = new TokenList();
        //StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tokens.size() - 2; i++) {
            tokenListRepaired.addToken(this.tokens.get(i));
        }
        return tokenListRepaired;
    }*/

    /**
     * Performs the given action for each element of the {@code Iterable}
     * until all elements have been processed or the action throws an
     * exception.  Actions are performed in the order of iteration, if that
     * order is specified.  Exceptions thrown by the action are relayed to the
     * caller.
     * <p>
     * The behavior of this method is unspecified if the action performs
     * side-effects that modify the underlying source of elements, unless an
     * overriding class has specified a concurrent modification policy.
     *
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified action is null
     * @implSpec <p>The default implementation behaves as if:
     * <pre>{@code
     *     for (T t : this)
     *         action.accept(t);
     * }</pre>
     * @since 1.8
     */
    public void forEach(Consumer<? super Token> action) {
        tokens.forEach(action);
    }
}