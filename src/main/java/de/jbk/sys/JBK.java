package de.jbk.sys;

public class JBK {

    private static JBK instance;

    public JBK() {
        instance = this;

    }

    public static JBK getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        new JBK();
    }
}
