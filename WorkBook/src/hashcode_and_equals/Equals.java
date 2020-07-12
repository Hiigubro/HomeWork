package hashcode_and_equals;

/**
 * в java, каждый вызов оператора new
 * порождает новый объект в памяти
 */
public class Equals {
    int varA;
    int varB;

    Equals(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    /**При сравнение объектов, операция “==” вернет true лишь
     * в одном случае — когда ссылки указывают
     * на один и тот-же объект. В данном случае
     * не учитывается содержимое полей.
     */
    public boolean equals(Object obj) {
        return (this == obj);
    }
}
